package aula_12;


public class Computer extends Device implements IAdjustableVolume {

    public Computer(String brand, String model) {
        super(brand, model);
    }
    
    @Override
    public void turnOn() {
        System.out.println("Ligando computador: " + getModel());
    }

    @Override
    public void turnOff() {
        System.out.println("Desligando computador: "+ getModel());
    }

    @Override
    public void IncreaseVolume(int value) {
        System.out.println("Volume do computador aumentado em " + value);
    }

    @Override
    public void DecreaseVolume(int value) {
        System.out.println("Volume do computador diminuido em " + value);
    }

}
