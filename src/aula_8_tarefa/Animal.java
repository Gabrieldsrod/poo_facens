package aula_8_tarefa;

public class Animal {
    private String nome;
    private int idade;

    public Animal() {
    }

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    public String imprimir() {
        return "\nNome: " + nome
                + "\nIdade: " + idade;
    }
    
    public String falar() {
        return "Som";
    }
}
