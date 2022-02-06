package Model.Entity.Conta;

import java.math.BigDecimal;

public class ContaCorrenteEntity extends ContaEntity {

    public ContaCorrenteEntity(int numeroConta, int agenciaConta) {
        super(numeroConta, agenciaConta);
    }

    public ContaCorrenteEntity(int numeroConta, int agenciaConta, BigDecimal saldo) {
        super(numeroConta, agenciaConta, saldo);
    }
}
