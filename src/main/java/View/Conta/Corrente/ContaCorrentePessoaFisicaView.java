package View.Conta.Corrente;

import Application.Aplicacao;
import Controller.Conta.Corrente.ContaCorrentePessoaFisicaController;
import Model.Entity.Pessoa.PessoaFisicaEntity;
import View.Mensagem.*;
import java.math.BigDecimal;
import java.util.Random;
import java.util.Scanner;

public class ContaCorrentePessoaFisicaView {

    static Scanner sc = new Scanner(System.in);
    static private PessoaFisicaEntity pessoaFisicaEntity;

    public static void criar(PessoaFisicaEntity pessoaFisica){
        MensagemView.escolhendoAgencia();
        int agenciaConta = sc.nextInt();
        Random random = new Random();
        int numeroConta = random.nextInt(100);
        System.out.println("Sua agencia: " + agenciaConta + "Seu numero: " + numeroConta);
        ContaCorrentePessoaFisicaController.criarConta(pessoaFisica, agenciaConta, numeroConta);
        pessoaFisicaEntity = pessoaFisica;
        MensagemContaView.contaCriadaComSucesso();
        menu();
    }

    public static void menu(){
        MensagemContaView.operacaoConta();
        int acaoConta = sc.nextInt();
        switch (acaoConta){
            case 1:sacar();
            case 2:tranferir();
            case 3:depositar();
            case 4:investir();
            case 5:saldo();
            case 0:voltarInicio();
            default: MensagemInvalidaView.opcaoInvalida();
                Aplicacao.init();
        }
    }

    public static void sacar() {
        MensagemContaView.saldo(pessoaFisicaEntity.getConta().getSaldo());
        MensagemContaView.quantiaSaque();
        //mandar uma parte para o controller
        BigDecimal quantia = sc.nextBigDecimal();
        if(quantia.compareTo(pessoaFisicaEntity.getConta().getSaldo()) <= 0){
            boolean verificandoSenha = true;
            do {
                MensagemDadosView.digiteSuaSenha();
                String senhaLogin = sc.next();
                if(senhaLogin.equals(pessoaFisicaEntity.getSenha())){
                    verificandoSenha = false;
                    BigDecimal sacando = pessoaFisicaEntity.getConta().getSaldo().subtract(quantia);
                    pessoaFisicaEntity.getConta().setSaldo(sacando);
                    System.out.println(pessoaFisicaEntity.getConta().getSaldo());
                    menu();
                }else{
                    MensagemInvalidaView.senhaInvalida();
                }
            }while (verificandoSenha);
        }else{
            MensagemInvalidaView.saldoInsuficiente();
        }
    }

    public static void tranferir(){
        //Conta Poupança | Conta Corrente | Conta Investimento
        //Saldo | Perguntar quantia | Perguntar conta | Pedir senha
        //PJ tem taxa de 0,5% a cada transferencia
    }

    public static void depositar(){
        //Conta Poupança | Conta Corrente | Conta Investimento | De outra pessoa
        //Perguntar quantia | Nome da pessoa | Você inseriu o envelope?
    }

    public static void investir(){
        //Conta Investimento
        //Saldo | Valor que deseja investir
        // PJ tem 2 % a mais que PF
    }

    public static void saldo(){
        MensagemContaView.saldo(pessoaFisicaEntity.getConta().getSaldo());
    }
    public static void voltarInicio(){
        Aplicacao.init();
    }

}
