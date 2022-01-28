package View.Cadastro;


import Application.Aplicacao;
import Model.Entity.Pessoa.Pessoa;
import Controller.CadastroController;
import View.Login.LoginView;
import View.Mensagem.*;

import java.util.Scanner;

public class CadastroView {
    static Scanner sc = new Scanner(System.in);

    public static void cadastrarUsuario() {
        MensagemCadastroView.cadastrarUsuario();
        int opcaoDesejada = sc.nextInt();
        if (opcaoDesejada == 1) {
            CadastroPessoaFisicaView.cadastro();
        } else if (opcaoDesejada == 2) {
            CadastroPessoaJuridicaView.cadastro();
        } else if (opcaoDesejada == 3) {
            Aplicacao.init();
        } else {
            MensagemView.opcaoInvalida();
            cadastrarUsuario();
        }
    }

    public static void criarContaCadastro(Pessoa pessoaEscolhida) {
        ////perguntar qual agencia e associar a conta
        //perguntar ou gerar numero de conta
        //após verficar cadastro trazer o cadastro da pessoa
        MensagemCadastroView.cadastroEncontrado(pessoaEscolhida);
        MensagemView.escolhendoAgencia();
        int agenciaConta = sc.nextInt();
        MensagemContaView.escolhendoTipoConta();
        //TODO gerar número de conta
        int numeroConta = 0;
        CadastroController.criarConta(pessoaEscolhida, agenciaConta, numeroConta);
        MensagemContaView.contaCriadaComSucesso();
        LoginView.loginConta();

    }

//    public static void agenciaEscolhida(){
//        if(agencia == 1){
////                    agenciaCentro();
////            System.out.println("Adicionando ao cadastro agenciaCentro");
//        }else if(agencia == 2){
////                    agenciaBairro();
//        }else if(agencia == 3){
////                    agencialitoral();
//        }else{
//            Mensagem.opcaoInvalida();
//        }
//    }

}
