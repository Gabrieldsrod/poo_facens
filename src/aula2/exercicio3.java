package aula2;

import java.util.Scanner;

public class exercicio3 {

//    Escreva um algoritmo que calcule a média aritmética das 3 notas dos alunos de uma classe.
//O algoritmo deverá ler, além das notas, o código do aluno e deverá ser encerrado quando o
//código for igual a zero.

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double nota1, nota2, nota3;
        int id;
        
        do {            
            System.out.print("ID do aluno: ");
            id = sc.nextInt();
            
            if(id != 0) {
                
                System.out.print("Nota 1: ");
                nota1 = sc.nextDouble();
                System.out.print("Nota 2: ");
                nota2 = sc.nextDouble();
                System.out.print("Nota 3: ");
                nota3 = sc.nextDouble();

                System.out.println("Media: " + calcularMedia(nota1, nota2, nota3));
                
            }
        } while (id != 0);
       
        sc.close();
    }
    
    public static double calcularMedia(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3;
    }
}
