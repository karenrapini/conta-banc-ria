package View.Conta.Corrente;

import Application.Aplicacao;
import Controller.Conta.Corrente.ContaCorrentePessoaFisicaController;
import Model.Entity.Pessoa.PessoaFisicaEntity;
import View.ContaView;
import View.Mensagem.*;
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
        menu(pessoaFisica);
    }

    public static void menu(PessoaFisicaEntity pessoaFisica){
        MensagemPessoaFisicaView.operacaoConta();
        int acaoConta = sc.nextInt();
        switch (acaoConta){
            case 1:
                sacar(pessoaFisica);
            case 2:
                transferir(pessoaFisica);
            case 3:depositar();
            case 4:saldo();
            case 5:voltarInicio();
            case 0:sair();
            default: MensagemInvalidaView.opcaoInvalida();
                menu(pessoaFisica);
        }
    }

    public static void sacar(PessoaFisicaEntity pessoaFisica){
        ContaView.sacar(pessoaFisica);
    }

    public static void transferir(PessoaFisicaEntity pessoaFisica){
        ContaView.transferir(pessoaFisica);
        //Conta Poupança | Conta Corrente | Conta Investimento
        //Saldo | Perguntar quantia | Perguntar conta | Pedir senha
        //PJ tem taxa de 0,5% a cada transferencia
    }

    public static void depositar(){
        //Conta Poupança | Conta Corrente | Conta Investimento | De outra pessoa
        //Perguntar quantia | Nome da pessoa | Você inseriu o envelope?
    }

    public static void saldo(){
        MensagemContaView.saldo(pessoaFisicaEntity.getConta().getSaldo());
    }
    public static void voltarInicio(){
        Aplicacao.init();
    }

    public static void sair(){
        MensagemView.agradeceFinaliza();
    }

}
