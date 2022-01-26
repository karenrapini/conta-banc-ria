package View;


import Application.Aplicacao;
import Class.Pessoa;
import Class.PessoaFisica;
import Class.PessoaJuridica;
import Controller.CadastroController;
import java.util.Scanner;



public class CadastroView {
    static Scanner sc = new Scanner(System.in);

    public static void cadastrarUsuario() {
        Mensagem.cadastrarUsuario();
        int opcaoDesejada = sc.nextInt();
        if (opcaoDesejada == 1) {
            cadastroPessoaFisica();
        } else if (opcaoDesejada == 2) {
            cadastroPessoaJuridica();
        } else if (opcaoDesejada == 3) {
            Aplicacao.init();
        } else {
            Mensagem.opcaoInvalida();
            cadastrarUsuario();
        }
    }

    public static void cadastroPessoaFisica() {
        Mensagem.digiteSeuNome();
        String nome = sc.next();
        Mensagem.digiteSeuEndereco();
        //TODO next não aceita string muito compridas?
        String endereco = sc.next();
        Mensagem.digiteSuaSenha();
        String senha = sc.next();
        Mensagem.digiteSeuDocumento("CPF");
        float cpf = sc.nextFloat();
        CadastroController.cadastroPessoaFisica(nome, endereco, senha, cpf);
        Mensagem.cadastroRealizadoComSucesso();
        Aplicacao.init();
        loginConta();
    }

    public static void cadastroPessoaJuridica() {
        Mensagem.digiteSeuNome();
        String nome = sc.next();
        Mensagem.digiteSeuEndereco();
        //TODO next não aceita string muito compridas?
        String endereco = sc.next();
        Mensagem.digiteSuaSenha();
        String senha = sc.next();
        Mensagem.digiteSeuDocumento("CNPJ");
        float cnpj = sc.nextFloat();
        CadastroController.cadastroPessoaJuridica(nome, endereco, senha, cnpj);
        Mensagem.cadastroRealizadoComSucesso();
        Aplicacao.init();
    }

    public static void cadastroRealizado() {
        Mensagem.cadastroRealizado();
        int opcao = sc.nextInt();
        if (opcao == 1) {
            Mensagem.digiteSeuDocumento("CPF");
            Mensagem.associandoDocumentoConta();
            float cpf = sc.nextFloat();
            PessoaFisica pessoaFisica = CadastroController.buscaPessoaPorCpf(cpf);
            if (pessoaFisica.getCpf() != cpf) {
                Mensagem.documentoNaoEncontrado();
                CadastroView.cadastrarUsuario();
            } else {
                criarConta(pessoaFisica);
            }

        } else if (opcao == 2) {
            Mensagem.digiteSeuDocumento("CNPJ");
            Mensagem.associandoDocumentoConta();
            float cnpj = sc.nextFloat();
            PessoaJuridica pessoaJuridica = CadastroController.buscaPessoaPorCnpj(cnpj);
            if (pessoaJuridica.getCnpj() != cnpj) {
                Mensagem.documentoNaoEncontrado();
                CadastroView.cadastrarUsuario();
            } else {
                criarConta(pessoaJuridica);

                //TODO confirmado que é o mesmo usuario, perguntar os outros dados e salvar em seu cadastro
            }
        } else {
            Mensagem.opcaoInvalida();
        }
    }

    public static void verificarCadastro() {
        Mensagem.verificaCadastro();
        int opcaoCadastro = sc.nextInt();
        if (opcaoCadastro == 1) {
            CadastroView.cadastroRealizado();
        } else if (opcaoCadastro == 2) {
            CadastroView.cadastrarUsuario();
        } else {
            Mensagem.opcaoInvalida();
            CadastroView.cadastrarUsuario();
        }
    }

    public static void criarConta(Pessoa pessoaEscolhida) {
        CadastroView.verificarCadastro();
        Mensagem.cadastroEncontrado(pessoaEscolhida);
        Mensagem.escolhendoAgencia();
        int agenciaConta = sc.nextInt();
        System.out.println("Qual conta desejar criar?\n" +
                "1 - Conta Corrente" +
                "2 - Conta Investimento" +
                "3 - Conta Poupança ! ATENÇÃO somente pessoas fisicas tem conta Poupança");
        //TODO gerar número de conta
        int numeroConta = 0;
        CadastroController.criarConta(pessoaEscolhida, agenciaConta, numeroConta);
        Mensagem.contaCriadaComSucesso();
    }

    public static void loginConta() {
        Mensagem.logando();
        int opcaoLogin = sc.nextInt();
        if (opcaoLogin == 1) {
            Mensagem.digiteSeuDocumento("CPF");
            float cpfLogin = sc.nextInt();
            Pessoa pessoaLogin = CadastroController.buscaPessoaPorCpf(cpfLogin);
            Mensagem.digiteSuaSenha();
            String senhaLogin = sc.next();
            if (senhaLogin == pessoaLogin.getSenha()) {
                Index.menuConta();
            } else {
//               todo observar que estamos em loop (:

//                Lanço exeception senha invalida
                Mensagem.opcaoInvalida();
                //Tentar Novamente ou Voltar ao menu inicial
                Mensagem.digiteSuaSenha();
                senhaLogin = sc.next();
                loginConta();
            }
        } else if (opcaoLogin == 2) {
            Mensagem.digiteSeuDocumento("CNPJ");
            float cnpjLogin = sc.nextInt();
            Pessoa pessoaLogin = CadastroController.buscaPessoaPorCnpj(cnpjLogin);
            Mensagem.digiteSuaSenha();
            String senhaLogin = sc.next();
            if (senhaLogin == pessoaLogin.getSenha()) {
                Index.menuConta();
            }

//      TODO Pedir login e senha, comparar em "banco de dados" e mandar para menu de conta PJ ou PF
        }

//    public static void agenciaEscolhida(){
//        if(agencia == 1){
////                    agenciaCentro();
////            System.out.println("Adicionando ao cadastro agenciaCentro");
//        }else if(agencia == 2){
////                    agenciaBairro();
//        }else if(agencia == 3){
////                    agencialitoral();
//        }else{
//            Mensagem.opcaoInvalida();
//        }
//    }
    }
}
