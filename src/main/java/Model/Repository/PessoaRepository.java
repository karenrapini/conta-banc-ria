package Model.Repository;

import Model.Entity.Pessoa.PessoaEntity;
import Model.Entity.Pessoa.PessoaFisicaEntity;
import Model.Entity.Pessoa.PessoaJuridicaEntity;

public class PessoaRepository {

    public static PessoaEntity encontraPessoaPorConta(int numeroConta){
        for (int i = 0; i < PessoaFisicaEntity.pessoasFisicas.size(); i++ ){
            if(PessoaFisicaEntity.pessoasFisicas.get(i).getConta().equals(numeroConta)){
                return PessoaFisicaEntity.pessoasFisicas.get(i);
            }
        }
        for (int i = 0; i < PessoaJuridicaEntity.pessoasJuridicas.size(); i++ ){
            if(PessoaJuridicaEntity.pessoasJuridicas.get(i).getConta().equals(numeroConta)){
                return PessoaJuridicaEntity.pessoasJuridicas.get(i);
            }
        }
        return new PessoaEntity();  //TODO colocar Exception ;

    }

}
