package aula_11;

import java.util.ArrayList;

public class interfaceMain {

    public static void main(String[] args) {
        ArrayList<IAutomatico> veiculosAutomaticos = new ArrayList<>();
        
        System.out.println("Polimorfismo veiculos automaticos:");
        veiculosAutomaticos.add(new CarroAutomatico());
        veiculosAutomaticos.add(new MotoAutomatica());
        veiculosAutomaticos.add(new Aviao());
        
        for (IAutomatico veiculo : veiculosAutomaticos) {
            veiculo.mudaMarchaAutomaticamente();
        }
        
        System.out.println("");
        System.out.println("Polimorfimo Voo:");
        
        ArrayList<IVoa> voadores = new ArrayList<>();
        voadores.add(new Morcego());
        voadores.add(new Aviao());
        
        for (IVoa voador : voadores) {
            voador.voar();
        }
        
    }

}
