package Model;

public class PessoaJuridica {

    public static void cadastroPessoaJuridica(Classes.PessoaJuridica pessoaJuridica){
        Classes.PessoaJuridica.pessoasJuridicas.add(pessoaJuridica);
    }

    public static Classes.PessoaJuridica buscaComparaCnpj(float cnpj){
        for (int i = 0; i < Classes.PessoaJuridica.pessoasJuridicas.size(); i++ ){
            if(Classes.PessoaJuridica.pessoasJuridicas.get(i).getCnpj() == cnpj){
                return Classes.PessoaJuridica.pessoasJuridicas.get(i);
            }
        }

        return new Classes.PessoaJuridica();  //TODO colocar Exception ;

    }

}
