package View.Cadastro;

import Controller.CadastroController;
import Model.Entity.Pessoa.PessoaFisica;
import View.Login.LoginPessoaFisicaView;
import View.Mensagem.*;

import java.util.Scanner;


public class CadastroPessoaFisicaView {
    static Scanner sc = new Scanner(System.in);

    public static void cadastro() {
        MensagemDadosView.digiteSeuNome();
        String nome = sc.next();
        MensagemDadosView.digiteSeuEndereco();
        //TODO next não aceita string muito compridas?
        String endereco = sc.next();
        MensagemDadosView.digiteSuaSenha();
        String senha = sc.next();
        MensagemDadosView.digiteSeuDocumento("CPF");
        float cpf = sc.nextFloat();
        PessoaFisica pessoaFisica = CadastroController.cadastroPessoaFisica(nome, endereco, senha, cpf);
        MensagemCadastroView.cadastroRealizadoComSucesso();
        LoginPessoaFisicaView.menuLogin(pessoaFisica);
    }


    public static void criarConta(PessoaFisica pessoaFisica){
        MensagemDadosView.digiteSeuDocumento("CPF");
        MensagemContaView.associandoDocumentoConta();
        float cpf = sc.nextFloat();
        PessoaFisica pessoaFisica = CadastroController.buscaPessoaPorCpf(cpf);
        if (pessoaFisica.getCpf() != cpf) {
            MensagemView.documentoNaoEncontrado();
            CadastroView.cadastrarUsuario();
        } else {
            CadastroView.criarContaCadastro(pessoaFisica);
        }
    }
}
