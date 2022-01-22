package Conta;


import java.util.ArrayList;

public class PessoaFisica extends Pessoa{
    float cpf;

    static ArrayList<PessoaFisica> pessoasFisicas = new ArrayList<>();

    public PessoaFisica(String nome, String endereco, float cpf) {
        super(nome, endereco);
        this.cpf = cpf;
    }

    public float getCpf() {
        return cpf;
    }
}
