package aula_4_tarefa;

import java.util.Scanner;

public class main_funcionario {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionario funcionario = null;
        int op;
        do {
            System.out.println("[1]Criar Funcionario "
                    + "\n[2]Mostrar Folha de Pagamento"
                    + "\n[3]Sair");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.print("Cracha: ");
                    int cracha = sc.nextInt();

                    System.out.print("Nome: ");
                    String nome = sc.next();

                    System.out.print("Tipo vinculado (H ou N): ");
                    char tipo = sc.next().charAt(0);
                    if (tipo != 'H' && tipo != 'N') {
                        System.out.println("Tipo invalido");
                        return;
                    }

                    funcionario = new Funcionario(cracha, nome, tipo);

                    if (funcionario.getTipoVinculado() == 'H') {
                        System.out.print("Quantidade de horas: ");
                        float qtdeHoras = sc.nextFloat();
                        funcionario.setQtdeHora(qtdeHoras);

                        System.out.print("valor por hora: ");
                        float valorHora = sc.nextFloat();
                        funcionario.setValorHora(valorHora);
                    } else {
                        System.out.print("Salario: ");
                        float salario = sc.nextFloat();
                        funcionario.setSalario(salario);
                    }

                    System.out.print("Valor a ser descontado: ");
                    float valorDesconto = sc.nextFloat();
                    funcionario.setValorDesconto(valorDesconto);
                    System.out.println("");
                    break;

                case 2:
                    if (funcionario != null) {
                        System.out.println("");
                        System.out.println(funcionario.imprimir());
                        System.out.println("");
                    }
                    else {
                        System.out.println("Crie um funcionario primeiro!");
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
