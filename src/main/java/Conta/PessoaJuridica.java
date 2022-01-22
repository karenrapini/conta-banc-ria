package Conta;


import java.util.ArrayList;

public class PessoaJuridica extends Pessoa{
    float cnpj;

    static ArrayList<PessoaJuridica> pessoasJuridicas = new ArrayList<>();

    public PessoaJuridica(String nome, String endereco,float cnpj){
        super(nome, endereco);
        this.cnpj = cnpj;
    }

    public float getCnpj() {
        return cnpj;
    }
}
