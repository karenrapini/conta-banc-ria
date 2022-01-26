package View.Mensagem;

public class MensagemContaView {


    public static void associandoDocumentoConta(){
        System.out.println(" cadastrado para associarmos a sua conta.");
    }


    public static void contaCriadaComSucesso(){
        System.out.println("Conta criada com Sucesso");
        System.out.println("Seu número de conta é:");
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

    public static void escolhendoTipoConta(){
        System.out.println("Qual conta desejar criar?\n" +
                "1 - Conta Corrente" +
                "2 - Conta Investimento" +
                "3 - Conta Poupança ! ATENÇÃO somente pessoas fisicas tem conta Poupança");
    }
}
