package View.Cadastro;


import Application.Aplicacao;
import Model.Entity.Pessoa.Pessoa;
import Controller.CadastroController;
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

    public static void cadastroRealizado() {
        MensagemCadastroView.cadastroRealizado();
        int opcao = sc.nextInt();
        if (opcao == 1) {
            CadastroPessoaFisicaView.criarConta();
        } else if (opcao == 2) {
            CadastroPessoaJuridicaView.criarConta();
        } else {
            MensagemView.opcaoInvalida();
        }
    }

    public static void verificarCadastro() {
        MensagemCadastroView.verificarCadastro();
        int opcaoCadastro = sc.nextInt();
        if (opcaoCadastro == 1) {
            CadastroView.cadastroRealizado();
        } else if (opcaoCadastro == 2) {
            CadastroView.cadastrarUsuario();
        } else {
            MensagemView.opcaoInvalida();
            CadastroView.cadastrarUsuario();
        }
    }

    public static void criarConta(Pessoa pessoaEscolhida) {
        CadastroView.verificarCadastro();
        MensagemCadastroView.cadastroEncontrado(pessoaEscolhida);
        MensagemView.escolhendoAgencia();
        int agenciaConta = sc.nextInt();
        MensagemContaView.escolhendoTipoConta();
        //TODO gerar número de conta
        int numeroConta = 0;
        CadastroController.criarConta(pessoaEscolhida, agenciaConta, numeroConta);
        MensagemContaView.contaCriadaComSucesso();
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
