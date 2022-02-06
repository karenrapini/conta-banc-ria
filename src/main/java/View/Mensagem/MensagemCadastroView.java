package View.Mensagem;
import Model.Entity.Pessoa.PessoaEntity;

public class MensagemCadastroView {

    public static void cadastrarUsuario(){
        System.out.println("Bem vindo a sessão de Cadastro!\n" +
                "Digite a opção desejada:\n" +
                "1 - Cadastro de pessoa Fisica\n" +
                "2 - Cadastro de pessoa Juridica\n" +
                "3 - Voltar a tela de Boas Vindas");
    }

    public static void cadastroRealizadoComSucesso(){
        System.out.println("Cadastro realizado com sucesso!");
    }

    public static void cadastroEncontrado(PessoaEntity pessoaEscolhida){
        System.out.println("Tudo certo " + pessoaEscolhida.getNome() + ", encontramos seu cadastro :D");
    }

}
