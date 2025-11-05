package aula_10_tarefa;

public class FuncionarioMensalista extends Funcionario{
    private double salario;
    private double desconto;

    public FuncionarioMensalista() {
    }

    public FuncionarioMensalista(double salario, double desconto, int numeroCracha, String nome, String setor, String funcao) {
        super(numeroCracha, nome, setor, funcao);
        this.salario = salario;
        this.desconto = desconto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    @Override
    public String toString() {
        return "NumeroCracha: " + getNumeroCracha()
                + "\nNome: " + getNome()
                + "\nSetor: " + getSetor()
                + "\nFuncao: " + getFuncao()
                + "\nSalario: R$" + calcularSalario();
    }

    @Override
    public double calcularSalario() {
        return salario - desconto;
    }
}
