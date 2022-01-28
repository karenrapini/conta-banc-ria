package View.Login;

import Controller.CadastroController;
import Model.Entity.Pessoa.PessoaFisica;
import Model.Entity.Pessoa.PessoaJuridica;
import View.Cadastro.CadastroPessoaFisicaView;
import View.Mensagem.MensagemDadosView;
import View.Mensagem.MensagemView;

import java.util.Scanner;

public class LoginPessoaFisicaView {

    static Scanner sc = new Scanner(System.in);

    public static void login(){
        MensagemDadosView.digiteSeuDocumento("CPF");
        float cpfLogin = sc.nextInt();
        PessoaFisica pessoaFisica = CadastroController.buscaPessoaPorCpf(cpfLogin);
        if(cpfLogin != pessoaFisica.getCpf()){
            System.out.println("CNPJ Inexistente");
            // criar saida para tela inicial
            //Tentar Novamente ou Voltar ao menu inicial
            login();
        }
        MensagemDadosView.digiteSuaSenha();
        String senhaLogin = sc.next();
        if(senhaLogin == pessoaFisica.getSenha()) {
            LoginPessoaFisicaView.menuLogin(pessoaFisica);
        }else{
            MensagemView.senhaInvalida();
            //Tentar Novamente ou Voltar ao menu inicial
            // criar saida para tela inicial
            login();
        }
    }

    public static void menuLogin(PessoaFisica pessoaFisica){
        MensagemView.menuLogin();
        int opcaoDesejada = sc.nextInt();
        if(opcaoDesejada == 1){
            //acessar minhas contas
        }else if(opcaoDesejada == 2){
            CadastroPessoaFisicaView.criarConta(pessoaFisica);
        }else if(opcaoDesejada == 3){
            MensagemView.agradeceFinaliza();
        }else{
            MensagemView.opcaoInvalida();
            menuLogin(pessoaFisica);
        }


    }

}
