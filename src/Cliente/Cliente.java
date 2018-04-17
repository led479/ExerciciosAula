package Cliente;

abstract public class Cliente {
    
    String nome, cep;
    int id, idade;

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    double saldo;
    
    public Cliente(String nome, int id, int idade, String cep, double saldo) {
        this.nome = nome;
        this.id = id;
        this.idade = idade;
        this.cep = cep;
        this.saldo = saldo;
    }
}
