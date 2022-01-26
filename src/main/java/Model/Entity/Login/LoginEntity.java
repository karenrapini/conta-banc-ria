package Model.Entity.Login;

public class LoginEntity {
    private float documento;
    private String senha;

    public LoginEntity() {
    }

    public LoginEntity(float documento, String senha){
        this.documento = documento;
        this.senha = senha;
    }

    public boolean verificaLogin (){

        return true;
    }
}
