package aula_4_tarefa;

import java.util.Scanner;

public class main_animal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nome do animal: ");
        String nome = sc.nextLine();
        System.out.print("Tipo: ");
        String tipo = sc.nextLine();
        System.out.print("Idade: ");
        int idade = sc.nextInt();
        Animal animal = new Animal(nome, tipo, idade);
        int op;
        do {
            System.out.println("[1]Alimentar"
                    + "\n[2]Brincar"
                    + "\n[3]Dormir"
                    + "\n[4]Mostrar status"
                    + "\n[5]encerrar");
            op = sc.nextInt();
            
            switch (op) {
                case 1:
                    animal.alimentar();
                    break;
                case 2:
                    animal.brincar();
                    break;
                case 3:
                    animal.dormir();
                    break;
                case 4:
                    animal.mostrarStatus();
                    break;
            }
        } while (animal.getEnergia() >= 0);
    }
}
