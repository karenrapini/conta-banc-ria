package View.Login;

import View.Mensagem.MensagemView;

import java.util.Scanner;

public class LoginView {

    static Scanner sc = new Scanner(System.in);
    public static void loginConta() {
        MensagemView.logando();
        int opcaoLogin = sc.nextInt();
        if (opcaoLogin == 1) {
            LoginPessoaFisicaView.login();
        } else if (opcaoLogin == 2) {
           LoginPessoaJuridicaView.login();

//      TODO Pedir login e senha, comparar em "banco de dados" e mandar para menu de conta PJ ou PF
        }
    }


}
