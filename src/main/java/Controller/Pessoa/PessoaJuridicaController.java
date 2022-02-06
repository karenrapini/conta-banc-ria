package Controller.Pessoa;

import Model.Entity.Pessoa.PessoaJuridicaEntity;
import Model.Repository.PessoaJuridicaRepository;

public class PessoaJuridicaController {

    public static PessoaJuridicaEntity cadastro(String nome, String endereco, String senha, float cnpj){
        PessoaJuridicaEntity pessoaJuridica = new PessoaJuridicaEntity(nome, endereco, senha, cnpj);
        PessoaJuridicaRepository.cadastroPessoaJuridica(pessoaJuridica);
        return pessoaJuridica;
    }
    public static PessoaJuridicaEntity encontraPessoaPorCnpj(float cnpj){
        return PessoaJuridicaRepository.buscaPessoaPorCnpj(cnpj);
    }

}
