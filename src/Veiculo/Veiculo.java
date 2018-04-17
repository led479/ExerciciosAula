package Veiculo;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type;

public class Veiculo {
    
    String placa, cor, marca, modelo;
    int id, potenciaMotor, quilometragem;
    boolean disponivel, tanqueCheio;
    double precoDia;

    public double getPrecoDia() {
        return precoDia;
    }

    public void setPrecoDia(double precoDia) {
        this.precoDia = precoDia;
    }

        public int getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public boolean isTanqueCheio() {
        return tanqueCheio;
    }

    public void setTanqueCheio(boolean tanqueCheio) {
        this.tanqueCheio = tanqueCheio;
    }

    public Veiculo(String placa, String cor, String marca, String modelo, int id, int potenciaMotor, int quilometragem, boolean disponivel, boolean tanqueCheio, double precoDia) {
        this.placa = placa;
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
        this.id = id;
        this.potenciaMotor = potenciaMotor;
        this.quilometragem = quilometragem;
        this.disponivel = disponivel;
        this.tanqueCheio = tanqueCheio;
        this.precoDia = precoDia;
    }
    
    public void display(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Disponibilidade: " + disponivel);
    }
    
}
