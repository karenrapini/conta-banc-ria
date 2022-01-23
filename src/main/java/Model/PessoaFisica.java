package Model;

public class PessoaFisica {

    public static void cadastroPessoaFisica(Classes.PessoaFisica pessoaFisica){
        Classes.PessoaFisica.pessoasFisicas.add(pessoaFisica);
    }

    public static Classes.PessoaFisica buscaComparaCpf(float cpf){
        for (int i = 0; i < Classes.PessoaFisica.pessoasFisicas.size(); i++ ){
            if(Classes.PessoaFisica.pessoasFisicas.get(i).getCpf() == cpf){
                return Classes.PessoaFisica.pessoasFisicas.get(i);
            }
        }

        return new Classes.PessoaFisica();  //TODO colocar Exception ;

    }

}
