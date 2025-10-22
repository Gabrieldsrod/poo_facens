package aula_9.view;

import aula_9.dao.ProdutoDAO;
import aula_9.entity.Produto;
import java.util.ArrayList;
import java.util.Scanner;

public class main_Produto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList<>();
        Produto produtoAux = null;

        ProdutoDAO dao = new ProdutoDAO();
        
        int op, idProduto, quantidade;
        String nome;
        double valorUnitario;

        do {
            produtos = dao.getAll(Produto.class);
            System.out.println("\n1- Inserir Produto\n"
                    + "2- Apagar\n"
                    + "3- Editar\n"
                    + "4- Listar todos");
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    System.out.print("Nome do produto: ");
                    nome = sc.nextLine();
                    System.out.print("Quantidade: ");
                    quantidade = sc.nextInt();
                    System.out.print("Valor unitario: R$");
                    valorUnitario = sc.nextFloat();

                    produtoAux = new Produto(nome, quantidade, valorUnitario);
                    dao.inserir(produtoAux);
                    break;
                case 2:
                    mostrarProdutos(produtos);
                    System.out.print("Id do produto: ");
                    idProduto = sc.nextInt();
                    sc.nextLine();
                    
                    dao.excluir(idProduto);
                    break;
                case 3:
                    mostrarProdutos(produtos);
                    System.out.print("Id do produto: ");
                    idProduto = sc.nextInt();
                    sc.nextLine();
                    
                    System.out.print("Nome do produto: ");
                    nome = sc.nextLine();
                    System.out.print("Quantidade: ");
                    quantidade = sc.nextInt();
                    System.out.print("Valor unitario: R$");
                    valorUnitario = sc.nextFloat();

                    produtoAux = new Produto(idProduto, nome, quantidade, valorUnitario);
                    dao.editar(produtoAux);
                    break;
                case 4:
                    mostrarProdutos(produtos);
                    break;
            }
        } while (op != 5);
    }
    
    public static void mostrarProdutos(ArrayList<Produto> produtos) {
        for (Produto prod : produtos) {
            System.out.println(prod);
        }
    }
}
