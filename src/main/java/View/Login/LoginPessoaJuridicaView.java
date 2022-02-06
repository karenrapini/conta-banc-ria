package View.Login;

import java.util.Scanner;

import Controller.Pessoa.PessoaJuridicaController;
import Model.Entity.Pessoa.PessoaJuridicaEntity;
import View.Conta.Corrente.ContaCorrentePessoaJuridicaView;
import View.Mensagem.MensagemDadosView;
import View.Mensagem.MensagemInvalidaView;
import View.Mensagem.MensagemPessoaJuridicaView;
import View.Mensagem.MensagemView;


public class LoginPessoaJuridicaView {

    static Scanner sc = new Scanner(System.in);

    public static void login(){
        MensagemDadosView.digiteSeuDocumento("CNPJ");
        float cnpjLogin = sc.nextInt();
        PessoaJuridicaEntity pessoaLogin = PessoaJuridicaController.encontraPessoaPorCnpj(cnpjLogin);
        if(cnpjLogin != pessoaLogin.getCnpj()){
            System.out.println("CNPJ Inexistente");
            // criar saida para tela inicial
            //Tentar Novamente ou Voltar ao menu inicial
            login();
        }
        MensagemDadosView.digiteSuaSenha();
        String senhaLogin = sc.next();
        if(senhaLogin == pessoaLogin.getSenha()) {
            LoginPessoaJuridicaView.menuLogin(pessoaLogin);
        }else{
            MensagemInvalidaView.senhaInvalida();
            //Tentar Novamente ou Voltar ao menu inicial
            // criar saida para tela inicial
            login();
        }
    }

    public static void menuLogin(PessoaJuridicaEntity pessoaJuridica){
        MensagemPessoaJuridicaView.menuLogin();
        int opcaoDesejada = sc.nextInt();
        if(opcaoDesejada == 1){
            //Acessar ou criar conta corrente
            ContaCorrentePessoaJuridicaView.criar(pessoaJuridica);
        }else if(opcaoDesejada == 2){
            //Acessar ou criar conta investimento
        }else if(opcaoDesejada == 3){
            MensagemView.agradeceFinaliza();
        }else{
            MensagemInvalidaView.opcaoInvalida();
            menuLogin(pessoaJuridica);
        }
    }
}
