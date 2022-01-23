package View;

import java.util.Scanner;

public class Index {

    static Scanner sc = new Scanner(System.in);
    public static void escolhendoOpcao(){
        int opcaoEscolhida = sc.nextInt();
        if(opcaoEscolhida == 1){
            CadastroView.cadastrarUsuario();
        }else if(opcaoEscolhida == 2){
            CadastroView.criarConta();
        }else if(opcaoEscolhida == 3){
            CadastroView.loginConta();
        }else if(opcaoEscolhida == 0){
            System.out.println("O Banco Let's Code agradece! Sessão Finalizada.");
        }else if(opcaoEscolhida < 0 | opcaoEscolhida >4){
            System.out.println("Opção Inválida.");
        }
    }

}
