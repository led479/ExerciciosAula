package Veiculo;

import java.util.ArrayList;

public class CadastroVeiculo {
    
    private ArrayList<Veiculo> veiculosList;

    public void addVeiculo(String placa, String cor, String marca, String modelo, int potenciaMotor, int quilometragem, boolean disponivel, boolean tanqueCheio, double precoDia){
        
        veiculosList.add(new Veiculo(placa, cor, marca, modelo, potenciaMotor, quilometragem, disponivel,tanqueCheio, precoDia));
    }
    
    public CadastroVeiculo() {
        
        this.veiculosList = new ArrayList<>();
    }
    
    public Veiculo getVeiculo(String placa){
        
        for(Veiculo v: veiculosList){
            if(v.getPlaca().equals(placa)){
                return v;
            }
        }
        return null;
    }
    
}
