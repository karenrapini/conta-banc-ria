package View.Pessoa;

import Controller.Pessoa.PessoaFisicaController;
import Model.Entity.Pessoa.PessoaFisicaEntity;
import View.Login.LoginPessoaFisicaView;
import View.Mensagem.*;
import java.util.Scanner;


public class PessoaFisicaView {
    static Scanner sc = new Scanner(System.in);

    private static final String DOCUMENTO = "CPF";

    public static void cadastro() {
        MensagemDadosView.digiteSeuNome();
        String nome = sc.next();
        MensagemDadosView.digiteSeuEndereco();
        //TODO next não aceita string muito compridas?
        String endereco = sc.next();
        MensagemDadosView.digiteSuaSenha();
        String senha = sc.next();
        MensagemDadosView.digiteSeuDocumento(DOCUMENTO);
        float cpf = sc.nextFloat();
        PessoaFisicaEntity pessoaFisica = PessoaFisicaController.cadastro
                (nome, endereco, senha, cpf);
        MensagemCadastroView.cadastroRealizadoComSucesso();
        LoginPessoaFisicaView.menuLogin(pessoaFisica);
    }
}
