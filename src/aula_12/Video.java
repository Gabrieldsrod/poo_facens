package aula_12;

public class Video extends Media implements IMedia{

    public Video(int duration, String title) {
        super(duration, title);
    }
    
    @Override
    public void play() {
        System.out.println("Reproduzindo video: " + getTitle());
    }

    @Override
    public void stop() {
        System.out.println("Parando video: " + getTitle());
    }
    
}
