package Classes;


import java.util.ArrayList;

public class PessoaJuridica extends Pessoa{
    private float cnpj;

    public static ArrayList<PessoaJuridica> pessoasJuridicas = new ArrayList<>();

    public PessoaJuridica(String nome, String endereco,float cnpj){
        super(nome, endereco);
        this.cnpj = cnpj;
    }

    public PessoaJuridica() {
        super();
    }

    public float getCnpj() {
        return cnpj;
    }



}
