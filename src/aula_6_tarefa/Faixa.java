package aula_6_tarefa;

public class Faixa {
    private String titulo;
    private String artista;
    private int duracao;

    public Faixa(String titulo, String artista, int duracao) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }

    public int getDuracao() {
        return duracao;
    }
    
    public String print() {
        return "Titulo: " + titulo
                + "\nArtista: " + artista
                + "\nDuracao: " + duracao +"s";
    }
    
    public void reproduzir () {
        System.out.print("Reproduzindo: ");
        System.out.println(titulo + " (" + duracao + "s)" + " - " + artista);
    }
}
