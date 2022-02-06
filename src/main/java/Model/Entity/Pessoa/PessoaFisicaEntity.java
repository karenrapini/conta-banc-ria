package Model.Entity.Pessoa;


import java.util.ArrayList;

public class PessoaFisicaEntity extends PessoaEntity {
    float cpf;

    public static ArrayList<PessoaFisicaEntity> pessoasFisicas = new ArrayList<>();

    public PessoaFisicaEntity(String nome, String endereco, String senha, float cpf) {
        super(nome, endereco, senha);
        this.cpf = cpf;
    }

    // TODO construtor Pessoa Vazio Temporário
    public PessoaFisicaEntity() {
        super();
    }

    public float getCpf() {
        return cpf;
    }

}
