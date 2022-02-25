package View.Mensagem;

import Model.Entity.Pessoa.PessoaEntity;

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
        System.out.println("Seu saldo é de R$ " + saldo);
    }

    public static void quantiaSaque(){
        System.out.println("Qual quantia deseja sacar?");
    }

    public static void quantiaTransferencia(){
        System.out.println("Qual quantia deseja transferir?");
    }

    public static void saqueRealizado(BigDecimal saldo){
        System.out.println("Saque realizado com sucesso! Seu novo saldo é R$ " + saldo);
    }

    public static void transferenciaRealizada(){
        System.out.println("Transferência realizada com sucesso!");
    }
    public static void contaDestino(){
        System.out.println("Qual número da conta destino?");
    }

    public static void confirmaDadosTransferencia(PessoaEntity pessoaContaDestino){
        System.out.println("Confirma os dados de transferência? \n" +
                "Nome: " + pessoaContaDestino.getNome() + "\n" +
                "Agência: " + pessoaContaDestino.getConta().getAgenciaConta() + "\n" +
                "Número da Conta: " + pessoaContaDestino.getConta().getNumeroConta() + "\n\n" +
                "1 - SIM \n" +
                "2 - NÃO");
    }

}
