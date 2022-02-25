package Controller.Pessoa;

import Model.Entity.Pessoa.PessoaEntity;
import Model.Repository.PessoaRepository;

public class PessoaController {

    public static PessoaEntity encontraPessoaPorConta(int numeroConta){
            return PessoaRepository.encontraPessoaPorConta(numeroConta);
    }

}
