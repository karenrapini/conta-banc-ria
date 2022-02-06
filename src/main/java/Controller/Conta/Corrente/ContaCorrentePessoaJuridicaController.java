package Controller.Conta.Corrente;

import Model.Entity.Conta.ContaCorrenteEntity;
import Model.Entity.Pessoa.PessoaJuridicaEntity;

public class ContaCorrentePessoaJuridicaController {

    public static ContaCorrenteEntity criarConta(PessoaJuridicaEntity pessoaJuridica, int agenciaConta, int numeroConta){
        ContaCorrenteEntity conta = new ContaCorrenteEntity(agenciaConta, numeroConta);
        //setar com model repository
        pessoaJuridica.setConta(conta);
        return conta;
    }
}
