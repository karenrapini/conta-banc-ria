package View.Mensagem;

public class MensagemView {

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

    public static void documentoNaoEncontrado(){
        System.out.println("Não encontramos o documento digitado em nosso banco de Dados");
    }

    public static void escolhendoAgencia(){
        System.out.println("Digite/ Escolha sua agencia:\n" +
                "1 - Centro" +
                "2 - Bairro" +
                "3 - Litoral");
    }
    public static void logando(){
        System.out.println("Maravilha! Vamos Logar");
        System.out.println("Digite:\n" +
                "1 - PESSOA FISICA \n" +
                "2 - PESSOA JURIDICA");
    }

    public static void senhaInvalida(){
        System.out.println("Senha Inválida!");
    }

    public static void opcaoInvalida(){
        System.out.println("Opção inválida");
    }

    public static void agradeceFinaliza(){
        System.out.println("O Banco Let's Code agradece! Sessão Finalizada.");
    }

    public static void menuLogin(){
        System.out.println("Bem vindo ao Menu Login\n" +
                "Digite a opção desejada\n" +
                "1 - Acessar minha(s) conta(s)\n" +
                "2 - Criar conta\n" +
                "3 - Finalizar sessão");
    }

}
