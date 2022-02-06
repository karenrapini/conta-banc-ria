package View.Mensagem;

import java.math.BigDecimal;

public class MensagemContaView {


    public static void contaCriadaComSucesso(){
        System.out.println("Conta criada com Sucesso");
        System.out.println("Seu número de conta é: ");
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
    
    public static void saldo(BigDecimal saldo){
        System.out.println("Seu saldo é " + saldo);
    }

    public static void quantiaSaque(){
        System.out.println("Qual quantia deseja sacar?");
    }
}
