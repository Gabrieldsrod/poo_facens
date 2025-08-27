package aula2;

import java.util.Scanner;

public class exercicio2 {
//Em uma eleição presidencial existem quatro candidatos. Os votos são informados através de
//códigos. Os dados utilizados para a contagem dos votos obedecem à seguinte codificação:
//1,2,3,4 = voto para os respectivos candidatos;
//5 = voto nulo;
//6 = voto em branco;
//Elabore um algoritmo que leia o código do candidato em um voto. Calcule e escreva:
//- total de votos para cada candidato;
//- total de votos nulos;
//- total de votos em branco;
//Como finalizador do conjunto de votos, tem-se o valor 0.
    
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        
        int[] votos = new int[6];
        
        int voto;
        
        do {            
            System.out.print("Voto: ");
            voto = sc.nextInt();
            
            switch (voto) {
                case 1:
                    votos[0]++; //candidato 1
                    break;
                case 2:
                    votos[1]++; //candidato 2
                    break;
                case 3:
                    votos[2]++; //candidato 3
                    break;
                case 4:
                    votos[3]++; //candidadto 4
                    break;
                case 5:
                    votos[4]++; //nulo
                    break;
                case 6:
                    votos[5]++; //branco
                    break;
                case 0:
                    break;
            }
            
        } while (voto > 0);
        
        calcularVotos(votos);
        
        sc.close();
    }

    public static void calcularVotos(int[] array) {
        int numVoto = 1;
        
        for (int voto : array) {
            if (numVoto <= 4) {
                System.out.println("Votos candidato " + numVoto + " : " + voto);
            }
            if (numVoto == 5) {
                System.out.println("Votos nulos: " + voto);
            }
            if (numVoto == 6) {
                System.out.println("Votos em branco: " + voto);
            }
            numVoto++;
        }
    }
}
