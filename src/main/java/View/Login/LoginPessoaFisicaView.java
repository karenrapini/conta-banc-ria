package View.Login;

import Controller.CadastroController;
import View.Index.IndexView;
import View.Mensagem.MensagemDadosView;
import View.Mensagem.MensagemView;

import java.util.Scanner;
import Model.Entity.Pessoa.Pessoa;

public class LoginPessoaFisicaView {

    static Scanner sc = new Scanner(System.in);

    public static void login(){
        MensagemDadosView.digiteSeuDocumento("CPF");
        float cpfLogin = sc.nextInt();
        Pessoa pessoaLogin = CadastroController.buscaPessoaPorCpf(cpfLogin);
        MensagemDadosView.digiteSuaSenha();
        String senhaLogin = sc.next();
        if (senhaLogin == pessoaLogin.getSenha()) {
            IndexView.menuConta();
        } else {
//              todo observar que estamos em loop (:
//              Lanço exeception senha invalida
            MensagemView.opcaoInvalida();
            //Tentar Novamente ou Voltar ao menu inicial
            MensagemDadosView.digiteSuaSenha();
            senhaLogin = sc.next();
            LoginPessoaJuridicaView.login();
        }
    }

}
