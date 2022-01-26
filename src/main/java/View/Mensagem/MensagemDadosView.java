package View.Mensagem;

public class MensagemDadosView {

    public static void digiteSeuNome(){
        System.out.println("Digite seu nome");
    }

    public static void digiteSeuEndereco(){
        System.out.println("Digite seu endereco");
    }

    public static void digiteSuaSenha(){
        System.out.println("Digite sua senha.\n" +
                "Use apenas letras");;
    }

    //TODO melhorar essa parte, pois entra qualquer string em documento
    public static void digiteSeuDocumento(String documento){
        System.out.println("Digite seu " + documento);
    }

}
