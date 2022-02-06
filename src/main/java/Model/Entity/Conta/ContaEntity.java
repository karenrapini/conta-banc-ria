package Model.Entity.Conta;

import java.math.BigDecimal;

public class ContaEntity {
    private int numeroConta;
    private int agenciaConta;
    private BigDecimal saldo = new BigDecimal(200.00);


    public ContaEntity(int numeroConta, int agenciaConta){
        this.numeroConta = numeroConta;
        this.agenciaConta = agenciaConta;
    }

    protected ContaEntity(int numeroConta, int agenciaConta, BigDecimal saldo){
        this.numeroConta = numeroConta;
        this.agenciaConta = agenciaConta;
        this.saldo = saldo;
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

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "ContaEntity{" +
                "numeroConta=" + numeroConta +
                ", agenciaConta=" + agenciaConta +
                ", saldo=" + saldo +
                '}';
    }
}

