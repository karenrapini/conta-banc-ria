package Model.Repository;
import Model.Entity.Pessoa.PessoaFisicaEntity;
public class PessoaFisicaRepository {

    public static void cadastroPessoaFisica(PessoaFisicaEntity pessoaFisica){
        PessoaFisicaEntity.pessoasFisicas.add(pessoaFisica);
    }

    public static PessoaFisicaEntity buscaPessoaPorCpf(float cpf){
        for (int i = 0; i < PessoaFisicaEntity.pessoasFisicas.size(); i++ ){
            if(PessoaFisicaEntity.pessoasFisicas.get(i).getCpf() == cpf){
                return PessoaFisicaEntity.pessoasFisicas.get(i);
            }
        }
        return new PessoaFisicaEntity();  //TODO colocar Exception ;

    }

}
