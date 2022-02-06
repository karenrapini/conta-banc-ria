package View.Pessoa;

import Application.Aplicacao;
import View.Mensagem.*;
import java.util.Scanner;

public class PessoaView {
    static Scanner sc = new Scanner(System.in);

    public static void cadastro() {
        MensagemCadastroView.cadastrarUsuario();
        int opcaoDesejada = sc.nextInt();
        if (opcaoDesejada == 1) {
            PessoaFisicaView.cadastro();
        } else if (opcaoDesejada == 2) {
            PessoaJuridicaView.cadastro();
        } else if (opcaoDesejada == 3) {
            Aplicacao.init();
        } else {
            MensagemInvalidaView.opcaoInvalida();
            cadastro();
        }
    }
}
