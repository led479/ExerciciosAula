package appLocadora;

public class ClienteEstrangeiro extends Cliente{
    
    public int passaporte;
    
    public ClienteEstrangeiro(String nome, int idade, int passaporte) {
        super(nome, idade);
        this.passaporte = passaporte;
    }
    
    public int getPassaporte() {
        return passaporte;
    }

    public void setPassaporte(int passaporte) {
        this.passaporte = passaporte;
    }
}
