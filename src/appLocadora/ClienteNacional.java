package appLocadora;

public class ClienteNacional extends Cliente{
    
    public int cnh;
    public int cpf;

    public ClienteNacional(String nome, int idade, int cnh, int cpf) {
        super(nome, idade);
        this.cnh = cnh;
        this.cpf = cpf;
    }

    public int getCnh() {
        return cnh;
    }

    public void setCnh(int cnh) {
        this.cnh = cnh;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
}
