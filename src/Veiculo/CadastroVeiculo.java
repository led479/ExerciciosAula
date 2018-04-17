package Veiculo;

import java.util.ArrayList;

public class CadastroVeiculo {
    
    private ArrayList<Veiculo> veiculos;
    
    public void addVeiculo(String placa, String cor, String marca, String modelo, int id, int potenciaMotor, int quilometragem, boolean disponivel, boolean tanqueCheio, double precoDia){
        
        veiculos.add(new Veiculo(placa, cor, marca, modelo, id, potenciaMotor, quilometragem, disponivel, tanqueCheio, precoDia));
    }
}
