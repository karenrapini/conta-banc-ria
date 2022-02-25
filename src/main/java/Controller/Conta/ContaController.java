package Controller.Conta;

import Model.Entity.Pessoa.PessoaEntity;

import java.math.BigDecimal;

public class ContaController {

    public static boolean validarSenha(PessoaEntity pessoa, String senha){
        if(senha.equals(pessoa.getSenha())) {
            return true;
        }
        return false;
    }
    public static void sacar(PessoaEntity pessoaEntity, BigDecimal quantia){
        BigDecimal novoSaldo = pessoaEntity.getConta().getSaldo().subtract(quantia);
        pessoaEntity.getConta().setSaldo(novoSaldo);
    }

    public static void transferir(PessoaEntity pessoaContaOrigem, BigDecimal quantia, PessoaEntity pessoaContaDestino){
        BigDecimal contaOrigem = pessoaContaOrigem.getConta().getSaldo().subtract(quantia);
        pessoaContaOrigem.getConta().setSaldo(contaOrigem);
        BigDecimal contaDestino = pessoaContaDestino.getConta().getSaldo().add(quantia);
        pessoaContaDestino.getConta().setSaldo(contaDestino);
    }

}
