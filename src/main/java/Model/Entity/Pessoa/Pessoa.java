package Model.Entity.Pessoa;

import Model.Entity.Conta.ContaEntity;

public class Pessoa {
    private String nome;
    private String endereco;
    private String senha;
    private ContaEntity conta;

    public Pessoa(String nome, String endereco, String senha) {
        this.nome = nome;
        this.endereco = endereco;
        this.senha = senha;
    }
// TODO construtor Pessoa Vazio Temporário
    public Pessoa() {

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

