package View.Login;

import Application.Aplicacao;
import Controller.CadastroController;

import java.util.Scanner;

import Model.Entity.Pessoa.Pessoa;
import Model.Entity.Pessoa.PessoaJuridica;
import View.Cadastro.CadastroPessoaJuridicaView;
import View.Index.IndexView;
import View.Mensagem.MensagemDadosView;
import View.Mensagem.MensagemView;


public class LoginPessoaJuridicaView {

    static Scanner sc = new Scanner(System.in);

    public static void login(){
        MensagemDadosView.digiteSeuDocumento("CNPJ");
        float cnpjLogin = sc.nextInt();
        PessoaJuridica pessoaLogin = CadastroController.buscaPessoaPorCnpj(cnpjLogin);
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
            MensagemView.senhaInvalida();
            //Tentar Novamente ou Voltar ao menu inicial
            // criar saida para tela inicial
            login();
        }
    }

    public static void menuLogin(PessoaJuridica pessoaJuridica){
        MensagemView.menuLogin();
        int opcaoDesejada = sc.nextInt();
        if(opcaoDesejada == 1){
            //acessar minhas contas
        }else if(opcaoDesejada == 2){
            CadastroPessoaJuridicaView.criarConta(pessoaJuridica);
        }else if(opcaoDesejada == 3){
            MensagemView.agradeceFinaliza();
        }else{
            MensagemView.opcaoInvalida();
            menuLogin(pessoaJuridica);
        }


    }
}
