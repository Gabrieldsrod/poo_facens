package aula_11;

public class Aviao implements IAutomatico, IVoa{
    private String modelo;
    
    private void decolar() {
        System.out.println("Aviao decolando...");
    }
    
    private void pousar() {
        System.out.println("Aviao pousando...");
    }
    
    @Override
    public void mudaMarchaAutomaticamente() {
        System.out.println("*Muda marcha aviao*");
    }

    @Override
    public void voar() {
        System.out.println("Aviao voando...");
    }
}
