package View;

import Class.Pessoa;

public class Mensagem {

   public static final String MSG_CADASTRAR_USUARIO = "Cadastrar usuário.";

    public static void boasVindas(){
        System.out.println("Bem Vindo ao Banco Let's Code.");
        System.out.println("Nosso assistente virtual está aqui para lhe ajudar! " +
                "\nO que gostaria de fazer? \n" +
                "\nDigite a opção desejada:" +
                "\n1 - " + MSG_CADASTRAR_USUARIO +
                "\n2 - Fazer login. "+
                "\n0 - Sair.");
    }


    public static void verificaCadastro(){
        System.out.println("É um prazer te-lo conosco!\n" +
                "Vamos criar uma conta para você!");
        System.out.println("Você ja realizou seu cadastro em nosso banco?\n" +
                "1 - Ja realizei meu cadastro\n" +
                "2 - Quero me cadastrar");
    }

    public static void cadastrarUsuario(){
        System.out.println("Bem vindo a sessão de Cadastro!\n" +
                "Digite a opção desejada:\n" +
                "1 - Cadastro de pessoa Fisica\n" +
                "2 - Cadastro de pessoa Juridica\n" +
                "3 - Voltar a tela de Boas Vindas");
    }

    public static void cadastroRealizado() {
        System.out.println("Muito bem! Vamos criar sua conta.\n" +
                "Qual documento você cadastrou?\n" +
                "1 - CPF  - Pessoa Fisica\n" +
                "2 - CNPJ - Pessoa Juridica");
    }

    public static void documentoNaoEncontrado(){
        System.out.println("Não encontramos o documento digitado em nosso banco de Dados");
    }

    public static void digiteSeuNome(){
        System.out.println("Digite seu nome");
    }

    public static void digiteSeuEndereco(){
        System.out.println("Digite seu endereco");
    }

    public static void cadastroRealizadoComSucesso(){
        System.out.println("Cadastro realizado com sucesso!");
    }
    //TODO melhorar essa parte, pois entra qualquer string em documento

    public static void digiteSeuDocumento(String documento){
        System.out.println("Digite seu " + documento);
    }

    public static void opcaoInvalida(){
        System.out.println("Opção inválida");
    }

    public static void agradeceFinaliza(){
        System.out.println("O Banco Let's Code agradece! Sessão Finalizada.");
    }

    public static void associandoDocumentoConta(){
        System.out.println(" cadastrado para associarmos a sua conta.");
    }

    public static void escolhendoAgencia(){
        System.out.println("Digite/ Escolha sua agencia:\n" +
                "1 - Centro" +
                "2 - Bairro" +
                "3 - Litoral");
    }

    public static void cadastroEncontrado(Pessoa pessoaEscolhida){
        System.out.println("Tudo certo " + pessoaEscolhida.getNome() + ", encontramos seu cadastro :D");
    }

    public static void contaCriadaComSucesso(){
        System.out.println("Conta criada com Sucesso");
        System.out.println("Seu número de conta é:");
    }

    public static void digiteSuaSenha(){
        System.out.println("Digite sua senha.\n" +
                "Use apenas letras");;
    }

    public static void operacaoConta(){
        System.out.println("Qual operação deseja realizar?\n" +
                "1 - Sacar\n" +
                "2 - Transferir\n" +
                "3 - Depositar\n" +
                "4 - Investir\n" +
                "5 - Saldo\n" +
                "0 - Voltar ao Inicio");
    }

    public static void logando(){
        System.out.println("Maravilha! Vamos Logar");
        System.out.println("Digite:\n" +
                "1 - PESSOA FISICA \n" +
                "2 - PESSOA JURIDICA");
    }

}
