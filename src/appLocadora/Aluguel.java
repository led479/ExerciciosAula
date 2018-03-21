package appLocadora;

public class Aluguel {
    
    public String dataRetirada;
    public String dataDevolucao;
    public boolean multa;
    
    void multarTanque(){
        if (multa == true){
            Cliente.saldo += 100;
        }else{
            Cliente.saldo = Cliente.saldo;
        }
    }
    
    public boolean isMulta() {
        return multa;
    }

    public void setMulta(boolean multa) {
        this.multa = multa;
    }
    
    public String getDataRetirada() {
        return dataRetirada;
    }

    public void setDataRetirada(String dataRetirada) {
        this.dataRetirada = dataRetirada;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
}
    