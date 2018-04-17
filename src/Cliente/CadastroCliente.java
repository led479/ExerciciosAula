    package Cliente;
    import java.util.ArrayList;

public class CadastroCliente {
    
    public ArrayList<ClienteNacional> clientesNcn;
    private ArrayList<ClienteEstrangeiro> clientesEstrg;
    
    public void CadastroCliente(){
        this.clientesNcn = new ArrayList<>();
        this.clientesEstrg = new ArrayList<>();
    }
    
    public void addClienteEstrangeiro(String nome, int id, int idade, String cep, double saldo, int passaporte) {
        clientesEstrg.add(new ClienteEstrangeiro(nome, id, idade, cep, saldo, passaporte));
    }
    
    public void addClienteNacional(String nome, int id, int idade, String cep, double saldo, String cnh, String cpf){
        clientesNcn.add(new ClienteNacional(nome, id, idade, cep, saldo, cnh, cpf));
    }
        
    
    /* public void removeClienteNcn(int id) throws Exception {
        try {
            
            }
        }catch (Exception e) {
            throw new Exception (e.getMessage());
        }
    } */
}


