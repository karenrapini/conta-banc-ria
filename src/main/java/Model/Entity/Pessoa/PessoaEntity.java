package Model.Entity.Pessoa;

import Model.Entity.Conta.ContaEntity;

public class PessoaEntity {
    private String nome;
    private String endereco;
    private String senha;
    private ContaEntity conta;
    //Pessoa> conta enum contas> tem 1, 2,3 C.C, C.I., C.J.

    public PessoaEntity(String nome, String endereco, String senha) {
        this.nome = nome;
        this.endereco = endereco;
        this.senha = senha;
    }
// TODO construtor Pessoa Vazio Temporário
    public PessoaEntity() {

    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getSenha() {
        return senha;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public ContaEntity getConta() {
        return conta;
    }

    public void setConta(ContaEntity conta) {
        this.conta = conta;
    }
}

