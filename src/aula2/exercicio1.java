package aula2;

import java.util.Scanner;

public class exercicio1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int input, count = 0;
        
        int[] nums = new int[100];
        System.out.print("Digite numeros: ");
        
        do {
            input = sc.nextInt();
            if (input > 0) {
                nums[count] = input;
                count++;
            }
           
            
       } while (input >=0);
       
        System.out.println("Media aritmetica = " + mediaAritmetica(nums, count));
        
        sc.close();
    }
    
    public static double mediaAritmetica(int[] array, int count) {
        
        double soma = 0;
        double result;
        
        for (int i = 0; i < count;i++) {
            soma += array[i];
        }
        
        result = soma / count;
        
        return result;
    }

}
