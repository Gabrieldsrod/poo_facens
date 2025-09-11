package aula_5_tarefa;

import java.util.Scanner;

public class main_vendedor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vendedor vendedor = new Vendedor();
        int op;
        do {            
            
        System.out.println("""
                               1 - Cadastrar Vendedor
                               2 - Calcular Venda
                               3 - Sair""");
            op = sc.nextInt();
            
            switch (op) {
                case 1:
                    System.out.print("Codigo: ");
                    int codigo = sc.nextInt();
                    System.out.print("Nome: ");
                    sc.nextLine();
                    String nome = sc.nextLine();
                    System.out.print("Percentual Comissao: ");
                    double percentualComissao = sc.nextDouble();

                    vendedor = new Vendedor(codigo, nome, percentualComissao);
                    System.out.println(vendedor.imprimir());
                    System.out.println("");
                    break;
                case 2:
                    if (vendedor.getNome() != null) {
                            System.out.print("Valor da venda: R$");
                            double valorVenda = sc.nextDouble();
                            System.out.print("Valor do desconto: R$");
                            double valorDesconto = sc.nextDouble();
                            
                            if (valorDesconto == 0) {
                                System.out.println("");
                                System.out.println(vendedor.imprimir(valorVenda));
                                System.out.println("");
                            }
                            else {
                                System.out.println("");
                                System.out.println(vendedor.imprimir(valorVenda, valorDesconto));
                                System.out.println("");
                            }
                            
                        }
                        else {
                            System.out.println("Crie uma vendedor primeiro!");
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
