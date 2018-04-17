package Cliente;

public class ClienteNacional extends Cliente{

    private String cnh;
    private String cpf;

    public ClienteNacional(String nome, int id, int idade, String cep, double saldo, String cnh, String cpf) {
        
        super(nome, id, idade, cep, saldo);
        this.cnh = cnh;
        this.cpf = cpf;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public void display(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Cep: " + this.getCep());
        System.out.println("Cpf: " + this.getCpf());
        System.out.println("Cnh: " + this.getCnh());
    }
}
