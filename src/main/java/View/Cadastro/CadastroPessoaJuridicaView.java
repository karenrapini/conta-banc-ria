package View.Cadastro;

import Application.Aplicacao;
import Controller.CadastroController;
import Model.Entity.Pessoa.PessoaJuridica;
import View.Index.IndexView;
import View.Login.LoginPessoaJuridicaView;
import View.Mensagem.*;

import java.util.Scanner;


public class CadastroPessoaJuridicaView {
    static Scanner sc = new Scanner(System.in);

    public static void cadastro() {
        MensagemDadosView.digiteSeuNome();
        String nome = sc.next();
        MensagemDadosView.digiteSeuEndereco();
        //TODO next não aceita string muito compridas?
        String endereco = sc.next();
        MensagemDadosView.digiteSuaSenha();
        String senha = sc.next();
        MensagemDadosView.digiteSeuDocumento("CNPJ");
        float cnpj = sc.nextFloat();
        PessoaJuridica pessoaJuridica = CadastroController.cadastroPessoaJuridica(nome, endereco, senha, cnpj);
        MensagemCadastroView.cadastroRealizadoComSucesso();
        LoginPessoaJuridicaView.menuLogin(pessoaJuridica);
    }

    public static void criarConta(PessoaJuridica pessoaJuridica){

    }
}
