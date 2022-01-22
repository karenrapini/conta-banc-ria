package Conta;


import java.util.Scanner;

public class Cadastro {
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
            System.out.println(" Opção inválida");
            cadastrarUsuario();
        }
    }

    public static void cadastroPessoaFisica(){
        System.out.println("Digite seu nome");
        String nome = sc.next();
        System.out.println("Digite seu endereco");
        String endereco = sc.next();
        System.out.println("Digite seu CPF");
        float cpf =sc.nextFloat();
        PessoaFisica pessoaFisica = new PessoaFisica(nome, endereco, cpf );
        PessoaFisica.pessoasFisicas.add(pessoaFisica);
        System.out.println("Cadastro realizado com sucesso!");
    }

    public static void cadastroPessoaJuridica(){
        System.out.println("Digite seu nome");
        String nome = sc.next();
        System.out.println("Digite seu endereco");
        String endereco = sc.next();
        System.out.println("Digite seu CNPJ");
        float cnpj =sc.nextFloat();
        PessoaJuridica pessoaJuridica = new PessoaJuridica(nome, endereco, cnpj );
        PessoaJuridica.pessoasJuridicas.add(pessoaJuridica);
        System.out.println("Cadastro realizado com sucesso!");

    }

    public static void cadastroRealizado(){
        System.out.println("Muito bem! Vamos criar sua conta.\n" +
                " Qual documento você cadastrou?\n" +
                " 1 - CPF  - Pessoa Fisica\n" +
                " 2 - CNPJ - Pessoa Juridica");
        int opcao = sc.nextInt();
        if(opcao == 1){
            System.out.println("Informe CPF cadastrado para associar a sua conta ");
            float cpf = sc.nextFloat();
            for (int i=0; i < PessoaFisica.pessoasFisicas.size(); i++ ){
                if(PessoaFisica.pessoasFisicas.get(i).getCpf() == cpf){
                    PessoaFisica pessoaFisica = PessoaFisica.pessoasFisicas.get(i);
                    break;
                }
            }
        }

        System.out.println("Digite o número da sua conta");
        float numeroConta = sc.nextFloat();

    }

    public static void verificarCadastro(){
        Mensagem.mensagemVerificaCadastro();
        int opcaoCadastro = sc.nextInt() ;
        if(opcaoCadastro == 1){
            Cadastro.cadastroRealizado();
        }else if(opcaoCadastro == 2){
            Cadastro.cadastrarUsuario();
        }else {
            System.out.println("Opção Inválida!");
            Cadastro.cadastrarUsuario();
        }
    }

}
