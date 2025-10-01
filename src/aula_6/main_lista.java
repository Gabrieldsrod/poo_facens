package aula_6;

import java.util.ArrayList;

public class main_lista {

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        
        lista.add("Gabriel");
        lista.add("Anastacio");
        lista.add("Jack Sparrow");
        
        if (lista.contains("Jack Sparrow")) {
            System.out.println("Yarr!");
        }
        
        if (lista.isEmpty() == true) {
            System.out.println("Ta vazia sim");
        }
        
        else {
            System.out.println("Ta vazia nao");
        }
        
        
        
    }

}
