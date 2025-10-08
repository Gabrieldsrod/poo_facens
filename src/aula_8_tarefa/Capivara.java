package aula_8_tarefa;

public class Capivara extends Animal{
    private int peso;

    public Capivara() {
    }

    public Capivara(String nome, int idade, int peso) {
        super(nome, idade);
        this.peso = peso;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String imprimir() {
        return super.imprimir()
                + "\nPeso: " + peso; 
    }

    @Override
    public String falar() {
        return "Cri cri cri cri cri";
    }
    
    
    
}
