package aula_11;

public class Moto extends Automovel{

    @Override
    public void acelera() {
        System.out.println("Randandandan");
    }

    @Override
    public void freia() {
        System.out.println("*Moto freiando*");
    }
    
    public void empinar() {
        System.out.println("*Moto empina*");
    }

    

}
