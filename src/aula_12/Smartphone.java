package aula_12;


public class Smartphone extends Device implements IScreenAdjustable, IAdjustableVolume {

    public Smartphone(String brand, String model) {
        super(brand, model);
    }
    
    @Override
    public void turnOn() {
        System.out.println("Ligando celular");
    }

    @Override
    public void turnOff() {
        System.out.println("Desligando celular");
    }

    @Override
    public void AdjustBrightness(int value) {
        System.out.println("Brilho da tela ajustado para " + value);
    }

    @Override
    public void AdjustContrast(int value) {
        System.out.println("Contraste da tela ajustado para " + value);
    }

    @Override
    public void IncreaseVolume(int value) {
        System.out.println("Volume do celular aumentado em " + value);
    }

    @Override
    public void DecreaseVolume(int value) {
        System.out.println("Volume do celular reduzido em " + value);
    }

}
