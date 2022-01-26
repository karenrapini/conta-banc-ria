package View.Cadastro;

import Application.Aplicacao;
import Controller.CadastroController;
import Model.Entity.Pessoa.PessoaJuridica;
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
        CadastroController.cadastroPessoaJuridica(nome, endereco, senha, cnpj);
        MensagemCadastroView.cadastroRealizadoComSucesso();
        Aplicacao.init();
    }

    public static void criarConta(){
        MensagemDadosView.digiteSeuDocumento("CNPJ");
        MensagemContaView.associandoDocumentoConta();
        float cnpj = sc.nextFloat();
        PessoaJuridica pessoaJuridica = CadastroController.buscaPessoaPorCnpj(cnpj);
        if (pessoaJuridica.getCnpj() != cnpj) {
            MensagemView.documentoNaoEncontrado();
            CadastroView.cadastrarUsuario();
        } else {
            CadastroView.criarConta(pessoaJuridica);

            //TODO confirmado que é o mesmo usuario, perguntar os outros dados e salvar em seu cadastro
        }
    }
}
