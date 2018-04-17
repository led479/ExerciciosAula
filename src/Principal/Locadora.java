package Principal;

import Cliente.ClienteNacional;
import Veiculo.Veiculo;

public class Locadora {
    
    public static void main(String[] args) {
        
        Veiculo veic = new Veiculo("ABC-5325", "Azul", "Ford", "Fiesta", 1, 2, 3, true, true, 250.00);
        veic.display();
        ClienteNacional c1 = new ClienteNacional("Mateus Pandino", 1, 19, "432423", 10000.00, "2543324", "07068610943"); 
        c1.setSaldo(500.00);
        c1.setIdade(20);
        c1.display();
    }
}
