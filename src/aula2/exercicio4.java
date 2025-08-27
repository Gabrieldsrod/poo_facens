package aula2;

import java.util.Scanner;

public class exercicio4 {

//    Escreva um algoritmo que calcule a média dos números digitados pelo usuário, se eles forem
//    pares. Termine a leitura se o usuário digitar zero (0).

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int[] numsPares = new int[99];
        int num, countPar = 0;
        
        do {
            System.out.print("Digite um numero: ");
            num = sc.nextInt();
            
            if (num % 2 == 0 && num != 0) {
               numsPares[countPar] = num;
               countPar++;
            }
        } while(num != 0);
        
        System.out.println("Media dos pares: " + calcularMedia(numsPares, countPar));
        
      sc.close();
    }

    public static double calcularMedia(int[] array, int count) {
        double soma = 0;
        for (int i = 0; i < count; i++) {
            soma += array[i];
        }
        
        return soma / count;
    }
}
