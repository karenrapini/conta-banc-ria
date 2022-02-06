package Model.Entity.Pessoa;


import java.util.ArrayList;

public class PessoaJuridicaEntity extends PessoaEntity {
    private float cnpj;

    public static ArrayList<PessoaJuridicaEntity> pessoasJuridicas = new ArrayList<>();

    public PessoaJuridicaEntity(String nome, String endereco, String senha, float cnpj){
        super(nome, endereco, senha);
        this.cnpj = cnpj;
    }

    public PessoaJuridicaEntity() {
        super();
    }

    public float getCnpj() {
        return cnpj;
    }



}
