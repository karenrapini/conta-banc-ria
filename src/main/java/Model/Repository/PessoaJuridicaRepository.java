package Model.Repository;

import Model.Entity.Pessoa.PessoaJuridicaEntity;
public class PessoaJuridicaRepository {

    public static void cadastroPessoaJuridica(PessoaJuridicaEntity pessoaJuridica){
        PessoaJuridicaEntity.pessoasJuridicas.add(pessoaJuridica);
    }

    public static PessoaJuridicaEntity buscaPessoaPorCnpj(float cnpj){
        for (int i = 0; i < PessoaJuridicaEntity.pessoasJuridicas.size(); i++ ){
            if(PessoaJuridicaEntity.pessoasJuridicas.get(i).getCnpj() == cnpj){
                return PessoaJuridicaEntity.pessoasJuridicas.get(i);
            }
        }

        return new PessoaJuridicaEntity();  //TODO colocar Exception ;

    }

}
