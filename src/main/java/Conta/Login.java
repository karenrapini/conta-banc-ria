package Conta;

public class Login{
    private float documento;
    private String senha;

    public Login() {
    }

    public Login(float documento, String senha){
        this.documento = documento;
        this.senha = senha;
    }

    public boolean verificaLogin (){

        return true;
    }
}
