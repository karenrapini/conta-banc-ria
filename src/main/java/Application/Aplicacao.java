package Application;

import View.Index;
import View.Mensagem;


import java.util.Scanner;

public class Aplicacao {
    static Scanner sc = new Scanner(System.in);

    public static void main (String[] Args){
        init();
    }

    public static void init(){
        Mensagem.boasVindas();
        Index.menuInicial();
    }

}
