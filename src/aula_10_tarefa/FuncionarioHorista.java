package aula_10_tarefa;

public class FuncionarioHorista extends Funcionario{
    private int qtdeHoras;
    private double valorHora;

    public FuncionarioHorista() {
    }

    public FuncionarioHorista(int qtdeHoras, double valorHora, int numeroCracha, String nome, String setor, String funcao) {
        super(numeroCracha, nome, setor, funcao);
        this.qtdeHoras = qtdeHoras;
        this.valorHora = valorHora;
    }

    public int getQtdeHoras() {
        return qtdeHoras;
    }

    public void setQtdeHoras(int qtdeHoras) {
        this.qtdeHoras = qtdeHoras;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public String toString() {
        return "\nNumeroCracha: " + getNumeroCracha()
                + "\nNome: " + getNome()
                + "\nSetor: " + getSetor()
                + "\nFuncao: " + getFuncao()
                + "\nQuantidade de horas: " + qtdeHoras
                + "\nValor hora: R$" + valorHora
                + "\nPagamento: R$" + calcularSalario();
    }
    
    @Override
    public double calcularSalario() {
        return qtdeHoras * valorHora;
    }
    
}
