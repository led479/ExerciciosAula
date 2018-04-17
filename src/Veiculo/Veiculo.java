package Veiculo;

public class Veiculo {
    
    private String placa, cor, marca, modelo;
    private int id, potenciaMotor, quilometragem;
    private boolean disponivel, tanqueCheio;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPotenciaMotor() {
        return potenciaMotor;
    }

    public void setPotenciaMotor(int potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }

    public int getId() {
        return id;
    }
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

    public Veiculo(String placa, String cor, String marca, String modelo, int potenciaMotor, int quilometragem, boolean disponivel, boolean tanqueCheio, double precoDia) {
        this.placa = placa;
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
        this.potenciaMotor = potenciaMotor;
        this.quilometragem = quilometragem;
        this.disponivel = disponivel;
        this.tanqueCheio = tanqueCheio;
        this.precoDia = precoDia;
    }

    
    public void display(){
        System.out.println("-----------------------------------");
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Disponibilidade: " + disponivel);
        System.out.println("ID do produto: " + id);
        System.out.println("Preço da diaria " + precoDia);
        System.out.println("-----------------------------------");
    }
    
}
