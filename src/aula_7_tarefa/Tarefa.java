package aula_7_tarefa;

public class Tarefa {
    private int id;
    private String descricao;
    private Membro membroResponsavel;
    private String status;

    public Tarefa(int id, String descricao, Membro membroResponsavel, String status) {
        this.id = id;
        this.descricao = descricao;
        this.membroResponsavel = membroResponsavel;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Membro getMembroResponsavel() {
        return membroResponsavel;
    }

    public void setMembroResponsavel(Membro membroResponsavel) {
        this.membroResponsavel = membroResponsavel;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public String print() { 
        return id + " - " + descricao
                + "\nMembro responsavel: " + membroResponsavel.print() 
                + "\nStatus: " + status;
    }
}
