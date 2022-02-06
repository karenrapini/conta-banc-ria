package Application;

import View.IndexView;
import View.Mensagem.MensagemView;


public class Aplicacao {

    public static void main (String[] Args){
        init();
    }

    public static void init(){
        MensagemView.boasVindas();
        IndexView.menuInicial();

    }

}
