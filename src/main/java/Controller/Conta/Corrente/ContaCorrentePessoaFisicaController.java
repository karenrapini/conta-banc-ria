package Controller.Conta.Corrente;

import Model.Entity.Conta.ContaCorrenteEntity;
import Model.Entity.Pessoa.PessoaFisicaEntity;

public class ContaCorrentePessoaFisicaController {

    public static ContaCorrenteEntity criarConta(PessoaFisicaEntity pessoaFisica, int agenciaConta, int numeroConta){
        ContaCorrenteEntity conta = new ContaCorrenteEntity(agenciaConta, numeroConta);
        //setar com model repository
        pessoaFisica.setConta(conta);
        System.out.println("Essa é a conta " + conta.toString());
        return conta;
    }

}
