package aula_9.entity;

public class Produto {

    private int id;
    private String nome;
    private int quantidade;
    private double valorUnitario;

    public Produto() {
    }

    public Produto(String nome, int quantidade, double valorUnitario) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
    }

    public Produto(int id, String nome, int quantidade, double valorUnitario) {
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(float valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    @Override
    public String toString() {
        return String.format(
                "ID: %d\n"
                + "Nome: %s\n"
                + "Quantidade: %d\n"
                + "Valor Unitario: R$ %.2f",
                id,
                nome,
                quantidade,
                valorUnitario 
        );
    }

}
