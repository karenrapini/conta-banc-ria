package Model.Repository;

import Model.Entity.Pessoa.PessoaJuridica;
public class PessoaJuridicaRepository {

    public static void cadastroPessoaJuridica(PessoaJuridica pessoaJuridica){
        PessoaJuridica.pessoasJuridicas.add(pessoaJuridica);
    }

    public static PessoaJuridica buscaPessoaPorCnpj(float cnpj){
        for (int i = 0; i < PessoaJuridica.pessoasJuridicas.size(); i++ ){
            if(PessoaJuridica.pessoasJuridicas.get(i).getCnpj() == cnpj){
                return PessoaJuridica.pessoasJuridicas.get(i);
            }
        }

        return new PessoaJuridica();  //TODO colocar Exception ;

    }

}
