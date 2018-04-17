package Principal;

import Veiculo.CadastroVeiculo;

public class Locadora {
    
    public static void main(String[] args) {
        
        CadastroVeiculo cadastr = new CadastroVeiculo();
        cadastr.addVeiculo("ABC-5325", "Azul", "Ford", "Fiesta", 2000, 40000, true, true, 250.00);
        cadastr.addVeiculo("XXX-4324", "Preto", "Ford", "New Fiesta", 3000, 30000, true, true, 300.00);
        cadastr.getVeiculo("ABC-5325").display();
        System.out.println(cadastr.getVeiculo("XXX-4324").getPlaca());
    }
}
