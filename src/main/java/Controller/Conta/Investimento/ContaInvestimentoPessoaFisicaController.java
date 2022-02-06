package Controller.Conta.Investimento;

import Model.Entity.Conta.ContaInvestimentoEntity;
import Model.Entity.Pessoa.PessoaFisicaEntity;

public class ContaInvestimentoPessoaFisicaController {

    public static ContaInvestimentoEntity criarConta(PessoaFisicaEntity pessoaFisica, int agenciaConta, int numeroConta){
        ContaInvestimentoEntity conta = new ContaInvestimentoEntity(agenciaConta, numeroConta);
        //setar com model repository
        pessoaFisica.setConta(conta);
        return conta;
    }
}
