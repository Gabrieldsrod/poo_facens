package aula_4_tarefa;

public class Animal {

    private String nome;
    private String tipo;
    private int idade;
    private int energia = 100;
    private int felicidade = 100;

    public Animal(String nome, String tipo, int idade) {
        this.nome = nome;
        this.tipo = tipo;
        this.idade = idade;
    }

    public int getEnergia() {
        return energia;
    }
    
    

    public void alimentar() {
        energia += 10;
        System.out.println(nome + " foi alimentado e recuperou 10 de energia!");
        mostrarStatus();
    }

    public void brincar() {
        felicidade += 10;
        energia -= 10;
        if (energia < 40) {
            if (energia < 0) {
                System.out.println(nome + " morreu...");
            }
            else {
                System.out.println(nome + " está com "
                    + energia + " de energia.");
                System.out.println("Talvez seja bom descansar...");
                mostrarStatus();
            }
        }
    }

    public void dormir() {
        energia = 100;
        mostrarStatus();
    }

    public void mostrarStatus() {
        System.out.println("");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo: " + tipo);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Energia = " + energia);
        System.out.println("felicidade = " + felicidade);
        System.out.println("");
    }

}
