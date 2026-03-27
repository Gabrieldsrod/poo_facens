package aula_12;

public class main_Midias {

    public static void main(String[] args) {
        Audio podcast = new Audio(100, "Podcast Legal");
        Audio musica = new Audio(200, "Nona sinfonia de Beethoven");
        
        Video gameplay = new Video(2000, "Gameplay Bacana");
        Video filme = new Video(5000, "Peter Pan");
        
        TV samsungQLED =  new TV("Samsung", "QLED");
        Computer nitro5 =  new Computer("Acer", "Nitro 5");
        Smartphone celular = new Smartphone("Samsung", "S22 Ultra");
        
        samsungQLED.turnOn();
        samsungQLED.playMedia(filme);
        samsungQLED.AdjustBrightness(20);
        samsungQLED.IncreaseVolume(14);
        filme.stop();
        samsungQLED.turnOff();
        
        System.out.println("");
        nitro5.turnOn();
        nitro5.playMedia(gameplay);
        nitro5.DecreaseVolume(4);
        gameplay.stop();
        nitro5.turnOff();
        
        System.out.println("");
        celular.turnOn();
        celular.playMedia(musica);
        celular.AdjustBrightness(56);
        celular.AdjustContrast(23);
        musica.stop();
        celular.turnOff();
        
    }

}
