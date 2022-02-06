package View.Login;

import Controller.Pessoa.PessoaFisicaController;
import Model.Entity.Pessoa.PessoaFisicaEntity;
import View.Conta.Corrente.ContaCorrentePessoaFisicaView;
import View.Mensagem.MensagemDadosView;
import View.Mensagem.MensagemInvalidaView;
import View.Mensagem.MensagemPessoaFisicaView;
import View.Mensagem.MensagemView;

import java.util.Scanner;

public class LoginPessoaFisicaView {

    static Scanner sc = new Scanner(System.in);

    public static void login(){
        MensagemDadosView.digiteSeuDocumento("CPF");
        float cpfLogin = sc.nextFloat();
        PessoaFisicaEntity pessoaFisica = PessoaFisicaController.encontraPessoaPorCpf(cpfLogin);
        if(cpfLogin != pessoaFisica.getCpf()){
            System.out.println("CPF Inexistente");
            // criar saida para tela inicial
            //Tentar Novamente ou Voltar ao menu inicial
            login();
        }
        MensagemDadosView.digiteSuaSenha();
        String senhaLogin = sc.next();
        if(senhaLogin.equals(pessoaFisica.getSenha())) {
            LoginPessoaFisicaView.menuLogin(pessoaFisica);
        }else{
            MensagemInvalidaView.senhaInvalida();
            //Tentar Novamente ou Voltar ao menu inicial
            // criar saida para tela inicial
            login();
        }
    }

    public static void menuLogin(PessoaFisicaEntity pessoaFisica){
        MensagemPessoaFisicaView.menuLogin();
        int opcaoDesejada = sc.nextInt();
        if(opcaoDesejada == 1){
            //Opcao acessar conta corrente
            //se ele tiver conta, acessa a conta
            pessoaFisica.getConta();
            //se não tiver conta mande para criar conta
            ContaCorrentePessoaFisicaView.criar(pessoaFisica);
        }else if(opcaoDesejada == 2){
            //acessar conta investimento
        }else if(opcaoDesejada == 3){
            //acessar conta poupança
        }else if(opcaoDesejada == 0) {
            //menu inicial
        }else{
            MensagemInvalidaView.opcaoInvalida();
            MensagemView.agradeceFinaliza();
        }

//        CadastroPessoaFisicaView.criarConta(pessoaFisica);

    }
}
