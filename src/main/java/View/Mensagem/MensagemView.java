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


    public static void escolhendoAgencia(){
        System.out.println("\nDigite/ Escolha sua agencia:\n" +
                "1 - Centro\n" +
                "2 - Bairro\n" +
                "3 - Litoral\n");
    }
    public static void logando(){
        System.out.println("Maravilha! Vamos Logar");
        System.out.println("Digite:\n" +
                "1 - PESSOA FISICA \n" +
                "2 - PESSOA JURIDICA\n");
    }

    public static void agradeceFinaliza(){
        System.out.println("O Banco Let's Code agradece! Sessão Finalizada.");
    }
}
