package View;

import Controller.Conta.ContaController;
import Model.Entity.Pessoa.PessoaEntity;
import Model.Repository.PessoaRepository;
import View.Mensagem.MensagemContaView;
import View.Mensagem.MensagemDadosView;
import View.Mensagem.MensagemInvalidaView;

import java.math.BigDecimal;
import java.util.Scanner;

public class ContaView {

    static Scanner sc = new Scanner(System.in);

    public static void sacar(PessoaEntity pessoaEntity) {
        MensagemContaView.saldo(pessoaEntity.getConta().getSaldo());
        MensagemContaView.quantiaSaque();
        BigDecimal quantia = sc.nextBigDecimal();

        if(compareQuantia(pessoaEntity, quantia)){
            boolean verificandoSenha = true;
            do {
                MensagemDadosView.digiteSuaSenha();
                String senhaLogin = sc.next();
                if(ContaController.validarSenha(pessoaEntity, senhaLogin)){
                    verificandoSenha = false;
                    ContaController.sacar(pessoaEntity, quantia);
                    MensagemContaView.saqueRealizado(pessoaEntity.getConta().getSaldo());
                    //menu();
                }else{
                    MensagemInvalidaView.senhaInvalida();
                }
            }while (verificandoSenha);
        }else{
            MensagemInvalidaView.saldoInsuficiente();
//            menu();
        }
    }

    public static void transferir(PessoaEntity pessoaContaOrigem){
        MensagemContaView.saldo(pessoaContaOrigem.getConta().getSaldo());
        MensagemContaView.quantiaTransferencia();
        BigDecimal quantia = sc.nextBigDecimal();

        if(compareQuantia(pessoaContaOrigem, quantia)){
          if(validandoSenha(pessoaContaOrigem)){
              MensagemContaView.contaDestino();
              int contaDestino = sc.nextInt();
              PessoaEntity pessoaContaDestino = PessoaRepository.encontraPessoaPorConta(contaDestino);
              MensagemContaView.confirmaDadosTransferencia(pessoaContaDestino);
              int opcaoEscolhida = sc.nextInt();
              if(opcaoEscolhida == 1){
                  ContaController.transferir(pessoaContaOrigem, quantia, pessoaContaDestino);
                  MensagemContaView.transferenciaRealizada();
              }else{
//            menu();
              }
          }
        }else{
            MensagemInvalidaView.saldoInsuficiente();
//            menu();
        }
    }

    public static boolean compareQuantia(PessoaEntity pessoaEntity, BigDecimal quantia){
        boolean verificandoQuantia = true;
        if(quantia.compareTo(pessoaEntity.getConta().getSaldo()) <= 0){
            verificandoQuantia = false;
        }
        return verificandoQuantia;
    }

    public static boolean validandoSenha (PessoaEntity pessoaEntity){
        boolean verificandoSenha = true;
        do {
            MensagemDadosView.digiteSuaSenha();
            String senhaLogin = sc.next();

            if(ContaController.validarSenha(pessoaEntity, senhaLogin)){
                verificandoSenha = false;
            }else{
                MensagemInvalidaView.senhaInvalida();
            }
        }while (verificandoSenha);

        return !verificandoSenha;
    }

    public static PessoaEntity pessoaContaDestino(){
        return pessoaContaDestino();

    }
}
