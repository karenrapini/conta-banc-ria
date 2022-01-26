package Class;


import java.util.ArrayList;

public class PessoaFisica extends Pessoa{
    float cpf;

    public static ArrayList<PessoaFisica> pessoasFisicas = new ArrayList<>();

    public PessoaFisica(String nome, String endereco, String senha, float cpf) {
        super(nome, endereco, senha);
        this.cpf = cpf;
    }

    // TODO construtor Pessoa Vazio Temporário
    public PessoaFisica() {
        super();
    }

    public float getCpf() {
        return cpf;
    }

}
