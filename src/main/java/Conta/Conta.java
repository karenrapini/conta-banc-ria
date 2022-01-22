package Conta;

import java.math.BigDecimal;

public class Conta{
    private Pessoa titular;
    private int numeroConta;
    private int agenciaConta;
    private BigDecimal saldo = new BigDecimal(200.00);
    private String senha;

    private Conta(BigDecimal saldo, String senha){
        this.saldo = getSaldo();
        this.senha = senha;
    }

    public Conta(Pessoa titular, int numeroConta, int agenciaConta){
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.agenciaConta = agenciaConta;
    }

    public Pessoa getTitular() {
        return titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public int getAgenciaConta() {
        return agenciaConta;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

}

