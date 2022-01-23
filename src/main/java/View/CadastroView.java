package View;


import Classes.PessoaFisica;
import Classes.PessoaJuridica;
import Controller.CadastroController;

import java.util.Scanner;

public class CadastroView {
    static Scanner sc = new Scanner(System.in);

    public static void cadastrarUsuario(){
        Mensagem.mensagemCadastrarUsuario();
        int opcaoDesejada = sc.nextInt();
        if(opcaoDesejada == 1){
            cadastroPessoaFisica();
        }else if(opcaoDesejada == 2){
            cadastroPessoaJuridica();
        }else if (opcaoDesejada == 3){
            Mensagem.boasVindas();
        }else{
            Mensagem.opcaoInvalida();
            cadastrarUsuario();
        }
    }

    public static void cadastroPessoaFisica(){
        Mensagem.digiteSeuNome();
        String nome = sc.next();
        Mensagem.digiteSeuEndereco();
        String endereco = sc.next();
        Mensagem.digiteSeuDocumento("CPF");
        float cpf =sc.nextFloat();
        CadastroController.cadastroPessoaFisica(nome, endereco, cpf);
        Mensagem.cadastroRealizadoComSucesso();
    }

    public static void cadastroPessoaJuridica(){
        Mensagem.digiteSeuNome();
        String nome = sc.next();
        Mensagem.digiteSeuEndereco();
        String endereco = sc.next();
        Mensagem.digiteSeuDocumento("CNPJ");
        float cnpj =sc.nextFloat();
        CadastroController.cadastroPessoaJuridica(nome, endereco, cnpj);
        Mensagem.cadastroRealizadoComSucesso();

    }

    public static void cadastroRealizado(){
        Mensagem.mensagemCadastroRealizado();
//        System.out.println("Seu cadastro é de pessoa fisica ou juridica?");
        int opcao = sc.nextInt();
        if(opcao == 1){
            Mensagem.digiteSeuDocumento("CPF cadastrado para associarmos a sua conta.");
            float cpf = sc.nextFloat();
            PessoaFisica pessoaFisica = CadastroController.buscaComparaCpf(cpf);
            if(pessoaFisica.getCpf() != cpf){
                Mensagem.documentoNaoEncontrado();
                CadastroView.cadastrarUsuario();
            }else{
                //TODO confirmado que é o mesmo usuario, perguntar os outros dados e salvar em seu cadastro
            }

        }else if(opcao == 2){
            Mensagem.digiteSeuDocumento("CNPJ cadastrado para associarmos a sua conta.");
            float cnpj = sc.nextFloat();
            PessoaJuridica pessoaJuridica = CadastroController.buscaComparaCnpj(cnpj);
            if(pessoaJuridica.getCnpj() != cnpj){
                Mensagem.documentoNaoEncontrado();
                CadastroView.cadastrarUsuario();
            }else{
                //TODO confirmado que é o mesmo usuario, perguntar os outros dados e salvar em seu cadastro
            }
        }else{
            Mensagem.opcaoInvalida();
        }

        System.out.println("Digite o número da sua conta");
        float numeroConta = sc.nextFloat();

    }

    public static void verificarCadastro(){
        Mensagem.mensagemVerificaCadastro();
        int opcaoCadastro = sc.nextInt() ;
        if(opcaoCadastro == 1){
            CadastroView.cadastroRealizado();
        }else if(opcaoCadastro == 2){
            CadastroView.cadastrarUsuario();
        }else {
            System.out.println("Opção Inválida!");
            CadastroView.cadastrarUsuario();
        }
    }

    public static void criarConta(){
        CadastroView.verificarCadastro();

    }

    public static void loginConta(){

    }

    public static void documentoUsuario(){

    }


}
