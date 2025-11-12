package aula_11;

public class Morcego extends Animal implements IVoa{
    
    public void localizarEco() {
        System.out.println("Localizando Eco...");
    }
    
    @Override
    public void voar() {
        System.out.println("Morcego voando...");
    }

}
