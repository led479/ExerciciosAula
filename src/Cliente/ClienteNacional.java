package Cliente;

public class ClienteNacional extends Cliente{

    public String cnh;
    public String cpf;

    public ClienteNacional(String nome, int id, int idade, String cep, double saldo, String cnh, String cpf) {
        
        super(nome, id, idade, cep, saldo);
        this.cnh = cnh;
        this.cpf = cpf;
    }
    
    public void display(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Cep: " + this.cep);
        System.out.println("Cpf: " + this.cpf);
        System.out.println("Cnh: " + this.cnh);
    }
}
