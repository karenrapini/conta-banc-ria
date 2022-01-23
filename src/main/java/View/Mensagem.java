package View;


public class Mensagem {
    public static void boasVindas(){
        System.out.println(" Seja Bem Vindo ao Banco Let's Code.");
        System.out.println(" Nosso assistente virtual está aqui para lhe ajudar! " +
                "\n O que gostaria de fazer? " +
                "\n Digite a opção desejada " +
                "\n 1 - Cadastrar usuário " +
                "\n 2 - Criar conta " +
                "\n 3 - Fazer login em conta existente " +
                "\n 0 - Sair");
    }

    public static void mensagemVerificaCadastro(){
        System.out.println("É um prazer te-lo conosco!\n" +
                "Vamos criar uma conta para você!");
        System.out.println("Você ja realizou seu cadastro em nosso banco?\n" +
                " 1 - Ja realizei meu cadastro\n" +
                " 2 - Quero me cadastrar");
    }

    public static void mensagemCadastrarUsuario(){
        System.out.println("Bem vindo a sessão de Cadastro!\n" +
                " Digite a opção desejada\n" +
                " 1 - Cadastro de pessoa Fisica\n" +
                " 2 - Cadastro de pessoa Juridica\n" +
                " 3 - Voltar a tela de Boas Vindas");
    }

    public static void mensagemCadastroRealizado() {
        System.out.println("Muito bem! Vamos criar sua conta.\n" +
                " Qual documento você cadastrou?\n" +
                " 1 - CPF  - Pessoa Fisica\n" +
                " 2 - CNPJ - Pessoa Juridica");
    }

    public static void documentoNaoEncontrado(){
        System.out.println("Não encontramos o documento digitado em nosso banco de Dados");
    }

    public static void digiteSeuNome(){
        System.out.println("Digite seu nome");
    }

    public static void digiteSeuEndereco(){
        System.out.println("Digite seu endereco");
    }

    public static void cadastroRealizadoComSucesso(){
        System.out.println("Cadastro realizado com sucesso!");
    }
    //TODO melhorar essa parte, pois entra qualquer string em documento
    public static void digiteSeuDocumento(String documento){
        System.out.println("Digite seu " + documento);
    }

    public static void opcaoInvalida(){
        System.out.println(" Opção inválida");
    }

}
