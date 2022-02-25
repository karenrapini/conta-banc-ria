package Controller.Pessoa;

import Model.Entity.Pessoa.PessoaFisicaEntity;
import Model.Repository.PessoaFisicaRepository;

public class PessoaFisicaController {

    public static PessoaFisicaEntity cadastro(String nome, String endereco, String senha, float cpf){
        PessoaFisicaEntity pessoaFisica = new PessoaFisicaEntity(nome, endereco , senha , cpf);
        PessoaFisicaRepository.cadastroPessoaFisica(pessoaFisica);
        return pessoaFisica;
    }

    public static PessoaFisicaEntity encontraPessoaPorCpf(float cpf){
        return PessoaFisicaRepository.buscaPessoaPorCpf(cpf);
    }
}
