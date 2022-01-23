package Controller;

import Classes.PessoaFisica;
import Classes.PessoaJuridica;

public class CadastroController {

    public static void cadastroPessoaFisica(String nome, String endereco, float cpf){
        PessoaFisica pessoaFisica = new PessoaFisica(nome, endereco, cpf);
        Model.PessoaFisica.cadastroPessoaFisica(pessoaFisica);
    }

    public static void cadastroPessoaJuridica(String nome, String endereco, float cnpj){
        PessoaJuridica pessoaJuridica = new PessoaJuridica(nome, endereco, cnpj);
        Model.PessoaJuridica.cadastroPessoaJuridica(pessoaJuridica);
    }

    public static PessoaFisica buscaComparaCpf(float cpf){
        return Model.PessoaFisica.buscaComparaCpf(cpf);
    }

    public static PessoaJuridica buscaComparaCnpj(float cnpj){
        return Model.PessoaJuridica.buscaComparaCnpj(cnpj);
    }

}
