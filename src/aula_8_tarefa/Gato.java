package aula_8_tarefa;

public class Gato extends Animal{
    private int alturaSalto;

    public Gato(String nome, int idade, int alturaSalto) {
        super(nome, idade);
        this.alturaSalto = alturaSalto;
    }

    public Gato() {
    }

    @Override
    public String imprimir() {
        return super.imprimir()
                + "\nAltura do Salto: " + alturaSalto; 
    }

    @Override
    public String falar() {
        return "Miau Miau"; 
    }
    
    
}
