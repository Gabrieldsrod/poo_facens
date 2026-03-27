package aula_12;

public class Audio extends Media implements IMedia{

    public Audio(int duration, String title) {
        super(duration, title);
    }
    
    @Override
    public void play() {
        System.out.println("Reproduzindo audio");
    }

    @Override
    public void stop() {
        System.out.println("Parando audio");
    }

}
