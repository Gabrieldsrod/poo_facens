package aula_3_tarefa;

import java.util.Scanner;

public class main_pessoa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        int op;

        do {
            System.out.println("");
            System.out.println("[1] Criar pessoa");
            System.out.println("[2] Mostrar pessoa");
            System.out.println("[3] Encerrar");

            System.out.print("Escolha: ");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.print("CPF: ");
                    sc.nextLine();
                    String cpf = sc.nextLine();
                    pessoa.setCpf(cpf);
                   

                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    pessoa.setNome(nome);

                    System.out.print("Sexo: ");
                    char sexo = sc.next().charAt(0);
                    pessoa.setSexo(sexo);
                  
                    System.out.print("Idade: ");
                    int idade = sc.nextInt();
                    pessoa.setIdade(idade);

                    break;

                case 2:
                    String stringDados = pessoa.imprimir();
                    System.out.println(stringDados);
                case 3:
                    break;
                default:
                    System.out.println("Escolha invalida");
                    ;
            }
        } while (op != 3);

    }

}
