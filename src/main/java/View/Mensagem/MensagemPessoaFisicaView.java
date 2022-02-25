package View.Mensagem;

import Model.Entity.Pessoa.PessoaFisicaEntity;

import java.math.BigDecimal;

public class MensagemPessoaFisicaView {
    public static void menuLogin(){
        System.out.println("Bem vindo ao Menu Login\n" +
                "Quero acessar ou criar minha:\n" +
                "1 - Conta Corrente\n" +
                "2 - Conta Investimento\n" +
                "3 - Conta Poupança" +
                "0 - Sair");
    }

    public static void operacaoConta(){
        System.out.println("Qual operação deseja realizar?\n" +
                "1 - Sacar\n" +
                "2 - Transferir\n" +
                "3 - Depositar\n" +
                "4 - Ver saldo\n" +
                "5 - Voltar ao início\n" +
                "0 - Sair");
    }
}
