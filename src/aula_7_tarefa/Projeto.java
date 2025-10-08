package aula_7_tarefa;

import java.util.ArrayList;
import javax.xml.transform.Source;

public class Projeto {
    private int id;
    private String nome;
    private ArrayList<Tarefa> tarefas;

    public Projeto(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.tarefas = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Tarefa> getTarefas() {
        return tarefas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void adicionarTarefa(int id, String descricao, Membro membro, String Status) {
        Tarefa tarTemp = new Tarefa(id, descricao, membro, Status);
        tarefas.add(tarTemp);
    }
    
    public void removeTarefa(int id) {
        tarefas.remove(id);
    }
    
    public void listarTarefas() {
        System.out.println("Tarefas: ");
        for (Tarefa tar : tarefas) {
            System.out.println(tar.print());
        }
    }
    
    public String print() {
        return id + " - " + nome;
    }
}
