package View;

import Application.Aplicacao;

import java.util.Scanner;

import static View.Mensagem.agradeceFinaliza;
import static View.Mensagem.opcaoInvalida;


public class Index {

    static Scanner sc = new Scanner(System.in);

    public static void menuInicial(){
        int menuInicial = sc.nextInt();
        if(menuInicial == 1){
            CadastroView.cadastrarUsuario();
        }else if(menuInicial == 2){
            CadastroView.loginConta();
        }else if(menuInicial == 0){
            agradeceFinaliza();
        }else if(menuInicial < 0 | menuInicial >4){
            opcaoInvalida();
        }
    }

    public static void menuConta(){
        Mensagem.operacaoConta();
        int acaoConta = sc.nextInt();
        switch (acaoConta){
            case 1:sacar();
            case 2:tranferir();
            case 3:depositar();
            case 4:investir();
            case 5:saldo();
            case 0:voltarInicio();
            default: Mensagem.opcaoInvalida();
            Aplicacao.init();
        }

    }

    public static void sacar() {
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
