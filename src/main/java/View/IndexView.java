package View;

import Application.Aplicacao;
import View.Pessoa.PessoaView;
import View.Login.LoginView;
import View.Mensagem.*;
import java.util.Scanner;

public class IndexView {

    static Scanner sc = new Scanner(System.in);

    public static void menuInicial(){
        //usar switch case
        //switch ()
        int menuInicial = sc.nextInt();
        if(menuInicial == 1){
            PessoaView.cadastro();
        }else if(menuInicial == 2){
            LoginView.login();
        }else if(menuInicial == 0){
            MensagemView.agradeceFinaliza();
        }else{
            MensagemInvalidaView.opcaoInvalida();
            Aplicacao.init();
        }
    }
}
