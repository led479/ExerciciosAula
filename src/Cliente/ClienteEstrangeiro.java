package Cliente;

public class ClienteEstrangeiro extends Cliente{
    
    public int passaporte;
    
    public ClienteEstrangeiro(String nome, int id, int idade, String cep, double saldo, int passaporte) {
        super(nome, id, idade, cep, saldo);
        this.passaporte = passaporte;
    }
    
    public int getPassaporte() {
        return passaporte;
    }
    
    public void setPassaporte(int passaporte) {
        this.passaporte = passaporte;
    }
}
