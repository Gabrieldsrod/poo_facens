package aula_6_tarefa;

import java.util.Scanner;
import javax.sound.midi.Soundbank;

public class main_organizamusicas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OrganizadorDeFaixas organizador = new OrganizadorDeFaixas();
        int indice;
        
        int op;
        do {
            System.out.println("\n1 - Adicionar Faixa"
                    + "\n2 - Remover Faixa"
                    + "\n3 - Reproduzir Faixa"
                    + "\n4 - Listar todas as Faixas"
                    + "\n5 - Sair");
            
            op = sc.nextInt();
            
            switch (op) {
                case 1:
                    System.out.print("\nTitulo: ");
                    sc.nextLine();
                    String titulo = sc.nextLine();
                    System.out.print("Artista: ");
                    String artista = sc.nextLine();
                    System.out.print("Duracao: ");
                    int duracao = sc.nextInt();
                    
                    Faixa faixa = new Faixa(titulo, artista, duracao);
                    organizador.adicionarFaixa(faixa);
                    break;
                
                case 2:
                    System.out.print("Indice da faixa a ser removida: ");
                    indice = sc.nextInt();
                    organizador.removerFaixa(indice);
                    break;
                
                case 3:
                    System.out.print("Indice da faixa a ser reproduzida: ");
                    indice = sc.nextInt();
                    organizador.reproduzirFaixa(indice);
                    break;
                
                case 4:
                    organizador.listarTodasAsFaixas();
                    break;
                
                case 5:
                    
                    break;
                default:
                    throw new AssertionError();
            }
        } while (op != 5);
    }

}
