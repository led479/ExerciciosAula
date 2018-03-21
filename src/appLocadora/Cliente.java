package appLocadora;

public class Cliente {
    
    public String nome;
    public int idade;
    static public double saldo;
        
    public Cliente(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
