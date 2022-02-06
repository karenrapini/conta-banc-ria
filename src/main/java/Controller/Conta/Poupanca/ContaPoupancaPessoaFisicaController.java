package Controller.Conta.Poupanca;

import Model.Entity.Conta.ContaPoupancaEntity;
import Model.Entity.Pessoa.PessoaFisicaEntity;

public class ContaPoupancaPessoaFisicaController{

    public static ContaPoupancaEntity criarConta(PessoaFisicaEntity pessoaFisica, int agenciaConta, int numeroConta){
        ContaPoupancaEntity conta = new ContaPoupancaEntity(agenciaConta, numeroConta);
        //setar com model repository
        pessoaFisica.setConta(conta);
        return conta;
    }

}
