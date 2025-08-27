package aula2;

import java.util.Scanner;

public class exercicio5 {

//    Faça um Programa que leia um vetor de 5 números inteiros, mostre a soma, a multiplicação e os
//    números.
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int[] vetor = new int[5];
        
        System.out.println("Digite 5 numeros");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Numero (" + (i+1) + "): ");
            vetor[i] = sc.nextInt();
        }
        
        int soma = somaVetor(vetor);
        System.out.println("Soma dos numeros: " + soma);
        System.out.println("");
        
        int produto = multiplicaVetor(vetor);
        System.out.println("Multiplicacao dos numeros: " + produto);
        System.out.println("");
        
        mostrarVetor(vetor);
    }
    
    public static int somaVetor(int[] array) {
        int soma = 0;
        
        for (int num : array) {
            soma += num;
        }
        return soma;
    }
    
    public static int multiplicaVetor(int[] array) {
        int multiplicacao = 1;
        
        for (int num : array) {
            multiplicacao *= num;
        }
        return multiplicacao;
    }
    
    public static void mostrarVetor(int[] array) {
        for (int num : array) 
            System.out.println(num + " ");
    }
}
