package aula_7_tarefa;

import java.util.ArrayList;
import java.util.Scanner;

public class main_projeto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Projeto> projetos = new ArrayList<>();
        int op;

        do {
            System.out.println("1- Cadastrar projeto"
                    + "\n2 - Adicionar tarefa"
                    + "\n3 - Adicionar membro a uma tarefa"
                    + "\n4 - Lista Projetos"
                    + "\n5 - Mostra Projeto especifico"
                    + "\n6 - Sair");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.print("\nId: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("\nNome: ");
                    String nome = sc.nextLine();

                    projetos.add(new Projeto(id, nome));
                    break;

                case 2:
                    System.out.print("Id do projeto: ");
                    int idProjeto = sc.nextInt();
                    sc.nextLine();

                    Projeto projetoDesejado = null;
                    for (Projeto proj : projetos) {
                        if (proj.getId() == idProjeto) {
                            projetoDesejado = proj;
                            break;
                        }
                    }

                    if (projetoDesejado != null) {
                        System.out.println(projetoDesejado.print());
                        projetoDesejado.listarTarefas();

                        System.out.print("Id da tarefa: ");
                        int idTarefa = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Nome: ");
                        String nomeTarefa = sc.nextLine();

                        System.out.println("Deseja adicionar um Membro (S/N)?");
                        char escolha = sc.next().charAt(0);
                        sc.nextLine();

                        if (escolha == 'N' || escolha == 'n') {
                            projetoDesejado.adicionarTarefa(idTarefa, nomeTarefa, null, "Pendente");
                        } else if (escolha == 'S' || escolha == 's') {
                            System.out.print("Nome do membro: ");
                            String nomeMembro = sc.nextLine();
                            System.out.print("Cargo: ");
                            String cargo = sc.nextLine();
                            Membro membro = new Membro(nomeMembro, cargo);

                            System.out.print("Status da tarefa: ");
                            String status = sc.nextLine();

                            projetoDesejado.adicionarTarefa(idTarefa, nomeTarefa, membro, status);
                        }
                    } else {
                        System.out.println("Projeto nao encontrado");
                    }

                    break;

                case 3:
                    for (Projeto proj : projetos) {
                        System.out.println(proj.print());
                    }

                    System.out.print("Id do projeto: ");
                    idProjeto = sc.nextInt();
                    sc.nextLine();

                    projetoDesejado = null;
                    for (Projeto proj : projetos) {
                        if (proj.getId() == idProjeto) {
                            projetoDesejado = proj;
                            break;
                        }
                    }

                    if (projetoDesejado != null) {
                        System.out.println("\nTarefas do projeto:");
                        projetoDesejado.listarTarefas();

                        System.out.print("\nId da tarefa: ");
                        int idTarefa = sc.nextInt();
                        sc.nextLine();

                        Tarefa tarefaDesejada = null;
                        for (Tarefa t : projetoDesejado.getTarefas()) {
                            if (t.getId() == idTarefa) {
                                tarefaDesejada = t;
                                break;
                            }
                        }

                        if (tarefaDesejada != null) {
                            System.out.print("Nome do membro: ");
                            String nomeMembro = sc.nextLine();
                            System.out.print("Cargo: ");
                            String cargo = sc.nextLine();
                            Membro membro = new Membro(nomeMembro, cargo);

                            tarefaDesejada.setMembroResponsavel(membro);

                            System.out.println("Membro adicionado");
                        } else {
                            System.out.println("Tarefa nao encontrada");
                        }
                    } else {
                        System.out.println("Projeto nao encontrado");
                    }

                    break;

                case 4:
                    for (Projeto proj : projetos) {
                        System.out.println(proj.print());
                    }
                    break;

                case 5:
                    System.out.print("Id do projeto: ");
                    idProjeto = sc.nextInt();
                    sc.nextLine();

                    projetoDesejado = null;
                    for (Projeto p : projetos) {
                        if (p.getId() == idProjeto) {
                            projetoDesejado = p;
                            break;
                        }
                    }

                    if (projetoDesejado != null) {
                        System.out.println(projetoDesejado.print());
                    } else {
                        System.out.println("Projeto nao encontrado");
                    }

                    break;
            }
        } while (op != 6);
    }

}
