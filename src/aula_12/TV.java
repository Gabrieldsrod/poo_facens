package aula_12;


public class TV extends Device implements IAdjustableVolume, IScreenAdjustable {

    public TV(String brand, String model) {
        super(brand, model);
    }
    
    @Override
    public void turnOn() {
        System.out.println("Ligando TV");
    }

    @Override
    public void turnOff() {
        System.out.println("Desligando TV");
    }
    
    @Override
    public void IncreaseVolume(int value) {
        System.out.println("Aumentando volume da TV em " + value);
    }

    @Override
    public void DecreaseVolume(int value) {
        System.out.println("Reduzindo volume da TV em " + value);
    }

    @Override
    public void AdjustBrightness(int value) {
        System.out.println("Brilho da tela ajustado para " + value);
    }

    @Override
    public void AdjustContrast(int value) {
        System.out.println("Contraste da tela ajustado para " + value);
    }
    
}
