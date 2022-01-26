package Model.Entity.Conta;

import java.math.BigDecimal;

public class ContaEntity {
    private int numeroConta;
    private int agenciaConta;
    private BigDecimal saldo = new BigDecimal(200.00);


    private ContaEntity(BigDecimal saldo){
        this.saldo = getSaldo();

    }

    public ContaEntity(int numeroConta, int agenciaConta){
        this.numeroConta = numeroConta;
        this.agenciaConta = agenciaConta;
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

