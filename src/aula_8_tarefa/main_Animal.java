package aula_8_tarefa;

import java.util.ArrayList;
import java.util.Scanner;

public class main_Animal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Animal> animais = new ArrayList<>();
        
        int op;
        
        do {            
            System.out.println("\n1- Cadastrar"
                + "\n2- Mostrar todos"
                + "\n3- Animal falando"
                + "\n4- Sair");
            op = sc.nextInt();
            sc.nextLine();
            
            switch (op) {
                case 1:
                    System.out.print("Nome do animal: ");
                    String nome = sc.nextLine();
                    System.out.print("Idade do animal: ");
                    int idade = sc.nextInt();
                    sc.nextLine();
                            
                    System.out.println("\nQual tipo de animal deseja cadastrar?"
                            + "\n1 - Cachorro"
                            + "\n2 - Gato"
                            + "\n3 - Capivara");
                    
                    int animalEscolhido = sc.nextInt();
                    switch (animalEscolhido) {
                        case 1:
                            System.out.print("Velocidade: ");
                            int velocidade = sc.nextInt();
                            Cachorro cachorro = new Cachorro(nome, idade, velocidade);
                            animais.add(cachorro);
                            break;
                            
                        case 2:
                            System.out.print("Altura do Salto: ");
                            int alturaSalto = sc.nextInt();
                            Gato gato = new Gato(nome, idade, alturaSalto);
                            animais.add(gato);
                            break;
                            
                        case 3:
                            System.out.print("Peso: ");
                            int peso = sc.nextInt();
                            Capivara capivara = new Capivara(nome, idade, peso);
                            animais.add(capivara);
                            break;
                            
                        default:
                            throw new AssertionError();
                    }
                    break;
                
                case 2:
                    for (Animal animal : animais) {
                        System.out.println(animal.imprimir());
                    }
                    break;
                
                case 3:
                    for (Animal animal : animais) {
                        System.out.println(animal.falar());
                    }
                    break;
                
                case 4:
                    
                    break;
                    
                default:
                    throw new AssertionError();
            }
        } while (op != 4);
    }

}
