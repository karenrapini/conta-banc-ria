package Conta;

import java.util.Scanner;

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


}
