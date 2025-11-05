package aula_10;

public class Pessoa {
    private String nome;
    private static int contador;

    public Pessoa(String nome) {
        this.nome = nome;
        contador++;
    }

    public String getNome() {
        return nome;
    }

    public void setContador(int contador) {
        Pessoa.contador = contador;
    }
    
    public static void mostrarTotalPessoas() {
        System.out.println("Contador: " + contador);
    }
    
}
