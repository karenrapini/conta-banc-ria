package View.Mensagem;
import Model.Entity.Pessoa.Pessoa;

public class MensagemCadastroView {


    public static void verificarCadastro(){
        System.out.println("É um prazer te-lo conosco!\n" +
                "Vamos criar uma conta para você!");
        System.out.println("Você ja realizou seu cadastro em nosso banco?\n" +
                "1 - Ja realizei meu cadastro\n" +
                "2 - Quero me cadastrar");
    }

    public static void cadastrarUsuario(){
        System.out.println("Bem vindo a sessão de Cadastro!\n" +
                "Digite a opção desejada:\n" +
                "1 - Cadastro de pessoa Fisica\n" +
                "2 - Cadastro de pessoa Juridica\n" +
                "3 - Voltar a tela de Boas Vindas");
    }

    public static void cadastroRealizado() {
        System.out.println("Muito bem! Vamos criar sua conta.\n" +
                "Qual documento você cadastrou?\n" +
                "1 - CPF  - Pessoa Fisica\n" +
                "2 - CNPJ - Pessoa Juridica");
    }

    public static void cadastroRealizadoComSucesso(){
        System.out.println("Cadastro realizado com sucesso!");
    }

    public static void cadastroEncontrado(Pessoa pessoaEscolhida){
        System.out.println("Tudo certo " + pessoaEscolhida.getNome() + ", encontramos seu cadastro :D");
    }

}
