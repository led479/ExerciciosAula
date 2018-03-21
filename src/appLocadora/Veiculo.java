package appLocadora;

public class Veiculo {
    
    public String placa;
    public String marca;
    public String modelo; //SUV, Passeio e Intermediario
    public boolean statusTanque; //checa se o carro foi entrega com o tanque cheio
    public boolean statusDispnv; //checa se o carro esta disponivel para locacao
    
    public Veiculo(String placa, String marca, String modelo, boolean statusTanque, boolean statusDispnv){
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.statusTanque = statusTanque;
        this.statusDispnv = statusDispnv;
    }
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoCarro() {
        return marca;
    }

    public void setTipoCarro(String tipoCarro) {
        this.marca = tipoCarro;
    }

    public boolean isStatusTanque() {
        return statusTanque;
    }

    public void setStatusTanque(boolean statusTanque) {
        this.statusTanque = statusTanque;
    }

    public boolean isStatusLocacao() {
        return statusDispnv;
    }

    public void setStatusLocacao(boolean statusLocacao) {
        this.statusDispnv = statusLocacao;
    }
}
