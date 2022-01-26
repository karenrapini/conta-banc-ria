package Controller;

import Model.Entity.Conta.ContaEntity;
import Model.Entity.Pessoa.Pessoa;
import Model.Entity.Pessoa.PessoaFisica;
import Model.Entity.Pessoa.PessoaJuridica;
import Model.Repository.PessoaFisicaRepository;
import Model.Repository.PessoaJuridicaRepository;

public class CadastroController {

    public static void cadastroPessoaFisica(String nome, String endereco, String senha, float cpf){
        PessoaFisica pessoaFisica = new PessoaFisica(nome, endereco , senha , cpf);
        PessoaFisicaRepository.cadastroPessoaFisica(pessoaFisica);
    }

    public static void cadastroPessoaJuridica(String nome, String endereco, String senha, float cnpj){
        PessoaJuridica pessoaJuridica = new PessoaJuridica(nome, endereco, senha, cnpj);
        PessoaJuridicaRepository.cadastroPessoaJuridica(pessoaJuridica);
    }

    public static void criarConta(Pessoa pessoaEscolhida, int agenciaConta, int numeroConta){
        ContaEntity conta = new ContaEntity(agenciaConta, numeroConta);
        pessoaEscolhida.setConta(conta);
    }

    public static PessoaFisica buscaPessoaPorCpf(float cpf){
        // TODO tem que receber o CPF e comparar a lista de pessoas cadastradas
        return PessoaFisicaRepository.buscaPessoaPorCpf(cpf);
    }

    public static PessoaJuridica buscaPessoaPorCnpj(float cnpj){
        return PessoaJuridicaRepository.buscaPessoaPorCnpj(cnpj);
    }



}
