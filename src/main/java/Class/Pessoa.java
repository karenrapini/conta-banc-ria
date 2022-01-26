package Class;

import Class.Conta;

public class Pessoa {
    private String nome;
    private String endereco;
    private String senha;
    private Conta conta;

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

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }
}

