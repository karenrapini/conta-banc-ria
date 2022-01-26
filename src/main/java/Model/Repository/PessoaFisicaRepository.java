package Model.Repository;
import Model.Entity.Pessoa.PessoaFisica;
public class PessoaFisicaRepository {

    public static void cadastroPessoaFisica(PessoaFisica pessoaFisica){
        PessoaFisica.pessoasFisicas.add(pessoaFisica);
    }

    public static PessoaFisica buscaPessoaPorCpf(float cpf){
        for (int i = 0; i < PessoaFisica.pessoasFisicas.size(); i++ ){
            if(PessoaFisica.pessoasFisicas.get(i).getCpf() == cpf){
                return PessoaFisica.pessoasFisicas.get(i);
            }
        }

        return new PessoaFisica();  //TODO colocar Exception ;

    }

}
