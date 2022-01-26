package View.Login;

import Controller.CadastroController;

import java.util.Scanner;
import Model.Entity.Pessoa.Pessoa;
import View.Index.IndexView;
import View.Mensagem.MensagemDadosView;
import View.Mensagem.MensagemView;


public class LoginPessoaJuridicaView {

    static Scanner sc = new Scanner(System.in);

    public static void login(){
        MensagemDadosView.digiteSeuDocumento("CNPJ");
        float cnpjLogin = sc.nextInt();
        Pessoa pessoaLogin = CadastroController.buscaPessoaPorCnpj(cnpjLogin);
        MensagemDadosView.digiteSuaSenha();
        String senhaLogin = sc.next();
        if (senhaLogin == pessoaLogin.getSenha()) {
            IndexView.menuConta();
        }else{
            //todo observar que estamos em loop (:
//              Lanço exeception senha invalida
            MensagemView.opcaoInvalida();
            //Tentar Novamente ou Voltar ao menu inicial
            MensagemDadosView.digiteSuaSenha();
            senhaLogin = sc.next();
            LoginPessoaJuridicaView.login();
        }
    }
}
