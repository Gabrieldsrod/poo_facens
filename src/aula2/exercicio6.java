package aula2;

import java.util.Scanner;

public class exercicio6 {
    
    //Faça um Programa que leia 10 números inteiros e armazene-os num vetor. Armazene os números
    //pares no vetor PAR e os números IMPARES no vetor impar. Imprima os três vetores.

    public static void main(String[] args) {
            
        Scanner sc = new Scanner(System.in);
        
        int[] vetor = new int[10], vetorPar = new int[10], vetorImpar = new int[10];
        int tamanhoPar, tamanhoImpar;
        
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextInt();
        }
            
        tamanhoPar = armazenaPares(vetor, vetorPar);
        tamanhoImpar = armazenaImpares(vetor, vetorImpar);
        
        System.out.println("");
        mostraVetor(vetorPar, tamanhoPar);
        System.out.println("");
        mostraVetor(vetorImpar, tamanhoImpar);
        System.out.println("");
        mostraVetor(vetor, vetor.length);
        System.out.println("");
        
        sc.close();
    }
    
    public static int armazenaPares(int[] array, int[] arrayPar) {
        int count = 0;
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                arrayPar[count++] = array[i];
            }
        }

        return count;
    }
    
    public static int armazenaImpares(int[] array, int[] arrayImpar) {
        int count = 0;
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                arrayImpar[count++] = array[i];
            }
        }

        return count;
    }
    
    public static void mostraVetor(int[] array, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
