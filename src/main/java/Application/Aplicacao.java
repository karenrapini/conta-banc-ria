package Application;

import View.Index.IndexView;
import View.Mensagem.MensagemView;


import java.util.Scanner;

public class Aplicacao {
    static Scanner sc = new Scanner(System.in);

    public static void main (String[] Args){
        init();
    }

    public static void init(){
        MensagemView.boasVindas();
        IndexView.menuInicial();
    }

}
