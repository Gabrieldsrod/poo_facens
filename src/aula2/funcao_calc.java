package aula2;


import java.util.Scanner;

public class funcao_calc {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um numero: ");
        double param1 = sc.nextDouble();
        
        System.out.print("Digite outro numero: ");
        double param2 = sc.nextDouble();
        
        System.out.print("Digite a operacao (+ , - , * , / ): ");
        String operacao = sc.next();
        
        double resultado = calculadora(operacao, param1, param2);
        
        System.out.print("Resultado(" + operacao +  ") = " + resultado);
        System.out.println("");
        
        sc.close();
        
    }
    
    public static double calculadora(String operador, double param1, double param2) {
        switch (operador) {
            case "+":
                double soma = soma(param1, param2);
                return soma;
                
            case "-":
                double subtracao = subtracao(param1, param2);
                return subtracao;
         
            case "*":
                double multiplicacao = multiplicacao(param1, param2);
                return multiplicacao;
                
            case "/":
                double divisao = divisao(param1, param2);
                return divisao;
                
            default:
                throw new AssertionError();
        }
    }
    
    public static double soma(double param1, double param2) {
        return param1 + param2;
    }
    public static double subtracao(double param1, double param2) { 
        return param1 - param2;
    }
    public static double multiplicacao(double param1, double param2) {
        return param1 * param2;
    }
    public static double divisao(double param1, double param2) {
        return param1 / param2;
    }
}
