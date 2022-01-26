package Controller;

import Class.Conta;
import Class.Pessoa;
import Class.PessoaFisica;
import Class.PessoaJuridica;
import Model.PessoaFisicaModel;
import Model.PessoaJuridicaModel;

public class CadastroController {

    public static void cadastroPessoaFisica(String nome, String endereco, String senha, float cpf){
        PessoaFisica pessoaFisica = new PessoaFisica(nome, endereco , senha , cpf);
        PessoaFisicaModel.cadastroPessoaFisica(pessoaFisica);
    }

    public static void cadastroPessoaJuridica(String nome, String endereco, String senha, float cnpj){
        PessoaJuridica pessoaJuridica = new PessoaJuridica(nome, endereco, senha, cnpj);
        PessoaJuridicaModel.cadastroPessoaJuridica(pessoaJuridica);
    }

    public static void criarConta(Pessoa pessoaEscolhida, int agenciaConta, int numeroConta){
        Conta conta = new  Conta(agenciaConta, numeroConta);
        pessoaEscolhida.setConta(conta);
    }

//    public static Conta cadastroContaPessoa(Pessoa pessoa, int numeroConta, int agenciaConta){
////        Conta cadastroContaPessoa = new Conta(pessoa, numeroConta, agenciaConta);
////        PessoaFisicaModel.cadastroPessoaFisica();
//        return cadastroContaPessoa;
//    }

    public static PessoaFisica buscaPessoaPorCpf(float cpf){
        // TODO tem que receber o CPF e comparar a lista de pessoas cadastradas
        return PessoaFisicaModel.buscaPessoaPorCpf(cpf);
    }

    public static PessoaJuridica buscaPessoaPorCnpj(float cnpj){
        return PessoaJuridicaModel.buscaPessoaPorCnpj(cnpj);
    }



}
