package Controller.Conta.Investimento;

import Model.Entity.Conta.ContaInvestimentoEntity;
import Model.Entity.Pessoa.PessoaJuridicaEntity;

public class ContaInvestimentoPessoaJuridicaController {

    public static ContaInvestimentoEntity criarConta(PessoaJuridicaEntity pessoaJuridica, int agenciaConta, int numeroConta){
        ContaInvestimentoEntity conta = new ContaInvestimentoEntity(agenciaConta, numeroConta);
        //setar com model repository
        pessoaJuridica.setConta(conta);
        return conta;
    }
}
