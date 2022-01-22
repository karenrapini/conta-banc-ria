import Conta.*;


import java.util.Scanner;

public class Aplicação {
    static Scanner sc = new Scanner(System.in);

    public static void main (String[] Args){

        Mensagem.boasVindas();
        escolhendoOpcao();
    }

    public static void escolhendoOpcao(){
        int opcaoEscolhida = sc.nextInt();
        if(opcaoEscolhida == 1){
            Cadastro.cadastrarUsuario();
        }else if(opcaoEscolhida == 2){
            criarConta();
        }else if(opcaoEscolhida == 3){
            loginConta();
        }else if(opcaoEscolhida == 0){
            System.out.println("O Banco Let's Code agradece! Sessão Finalizada.");
        }else if(opcaoEscolhida < 0 | opcaoEscolhida >4){
            System.out.println("Opção Inválida.");
        }
    }

    public static void criarConta(){
        Cadastro.verificarCadastro();
    }

    public static void loginConta(){

    }

    public static void documentoUsuario(){

    }

}
