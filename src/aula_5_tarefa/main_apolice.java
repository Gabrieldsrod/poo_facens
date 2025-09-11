package aula_5_tarefa;

import java.util.Scanner;

public class main_apolice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Apolice apolice = new Apolice();
        
        int op;
        do {
            System.out.println("""
                               1 - Criar Apolice
                               2 - Ver Dados Apolice
                               3 - Sair""");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.print("Numero: ");
                    int numero = sc.nextInt();
                    System.out.print("Nome: ");
                    sc.next();
                    String nome = sc.nextLine();
                    System.out.print("Idade: ");
                    int idade = sc.nextInt();
                    System.out.print("Sexo: ");
                    char sexo = sc.next().charAt(0);
                    System.out.print("Valor do automovel: ");
                    double valorAutomovel = sc.nextDouble();

                    apolice = new Apolice(numero, nome, idade, sexo, valorAutomovel);
                    System.out.println("");
                    break;
                case 2:
                    if (apolice.getNome() != null) {
                            System.out.println("");
                            System.out.println(apolice.imprimir());
                            System.out.println("");
                        }
                        else {
                            System.out.println("Crie uma apolice primeiro!");
                            System.out.println("");
                        }
                    break;
                case 3:

                    break;
                default:
                    throw new AssertionError();
            }
        } while (op != 3);
    }
}
