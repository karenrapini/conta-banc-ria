package View.Pessoa;

import Controller.Pessoa.PessoaJuridicaController;
import Model.Entity.Pessoa.PessoaJuridicaEntity;
import View.Login.LoginPessoaJuridicaView;
import View.Mensagem.*;

import java.util.Scanner;


public class PessoaJuridicaView {
    static Scanner sc = new Scanner(System.in);

    private static final String DOCUMENTO = "CNPJ";

    public static void cadastro() {
        MensagemDadosView.digiteSeuNome();
        String nome = sc.next();
        MensagemDadosView.digiteSeuEndereco();
        //TODO next não aceita string muito compridas?
        String endereco = sc.next();
        MensagemDadosView.digiteSuaSenha();
        String senha = sc.next();
        MensagemDadosView.digiteSeuDocumento(DOCUMENTO);
        float cnpj = sc.nextFloat();
        PessoaJuridicaEntity pessoaJuridica = PessoaJuridicaController.cadastro
                (nome, endereco, senha, cnpj);
        MensagemCadastroView.cadastroRealizadoComSucesso();
        LoginPessoaJuridicaView.menuLogin(pessoaJuridica);
    }
}
