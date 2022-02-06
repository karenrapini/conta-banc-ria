package View.Conta.Poupanca;

import Application.Aplicacao;
import Controller.Conta.Poupanca.ContaPoupancaPessoaFisicaController;
import Model.Entity.Pessoa.PessoaFisicaEntity;
import View.Mensagem.MensagemContaView;
import View.Mensagem.MensagemInvalidaView;
import View.Mensagem.MensagemView;
import java.util.Random;
import java.util.Scanner;

public class ContaPoupancaPessoaFisicaView {

    static Scanner sc = new Scanner(System.in);
    static private PessoaFisicaEntity pessoaFisicaEntity;

    public static void criar(PessoaFisicaEntity pessoaFisica){
        MensagemView.escolhendoAgencia();
        int agenciaConta = sc.nextInt();
        Random random = new Random();
        int numeroConta = random.nextInt(100);
        System.out.println("Sua agencia: " + agenciaConta + "Seu numero: " + numeroConta);
        ContaPoupancaPessoaFisicaController.criarConta(pessoaFisica, agenciaConta, numeroConta);
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
        //IR NO SALDO, VER SE TEM A QUANTIA
        //CASO TENHA EU AUTORIZO O SAQUE
        //CASO NÃO TENHA EU LANÇO SALDO INSUFICIENTE

        //Conta Poupança | Conta Corrente | Conta Investimento
        //Saldo | Perguntar quantia | Pedir senha
        //PJ tem taxa de 0,5% a cada saque
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
        //Conta Poupança | Conta Corrente | Conta Investimento | Todos
    }
    public static void voltarInicio(){
        Aplicacao.init();
    }
}
