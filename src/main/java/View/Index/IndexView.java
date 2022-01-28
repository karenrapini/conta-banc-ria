package View.Index;

import Application.Aplicacao;
import Model.Entity.Pessoa.Pessoa;
import Model.Entity.Pessoa.PessoaJuridica;
import View.Cadastro.CadastroPessoaJuridicaView;
import View.Cadastro.CadastroView;
import View.Login.LoginView;
import View.Mensagem.*;
import java.util.Scanner;


public class IndexView {

    static Scanner sc = new Scanner(System.in);

    public static void menuInicial(){
        int menuInicial = sc.nextInt();
        if(menuInicial == 1){
            CadastroView.cadastrarUsuario();
        }else if(menuInicial == 2){
            LoginView.loginConta();
        }else if(menuInicial == 0){
            MensagemView.agradeceFinaliza();
        }else{
            MensagemView.opcaoInvalida();
            Aplicacao.init();
        }
    }

    public static void menuConta(){
        //Criar conta?
        MensagemContaView.operacaoConta();
        int acaoConta = sc.nextInt();
        switch (acaoConta){
            case 1:sacar();
            case 2:tranferir();
            case 3:depositar();
            case 4:investir();
            case 5:saldo();
            case 0:voltarInicio();
            default: MensagemView.opcaoInvalida();
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
