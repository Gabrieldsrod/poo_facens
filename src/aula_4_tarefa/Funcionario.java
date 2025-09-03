package aula_4_tarefa;

public class Funcionario {

    private int cracha;
    private String nome;
    private char tipoVinculado;
    private float valorHora;
    private float qtdeHora;
    private float salario;
    private float valorDesconto;

    public Funcionario(int cracha, String nome, char tipoVinculado) {
        this.cracha = cracha;
        this.nome = nome;
        this.tipoVinculado = tipoVinculado;
    }

    public int getCracha() {
        return cracha;
    }

    public void setCracha(int cracha) {
        this.cracha = cracha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getTipoVinculado() {
        return tipoVinculado;
    }

    public void setTipoVinculado(char tipoVinculado) {
        this.tipoVinculado = tipoVinculado;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public float getQtdeHora() {
        return qtdeHora;
    }

    public void setQtdeHora(float qtdeHora) {
        this.qtdeHora = qtdeHora;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(float valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public float calcularSalario() {
        if (tipoVinculado == 'H') {
            return valorHora * qtdeHora;
        } else {
            return salario;
        }
    }

    public float calcularValorReceber() {
        return calcularSalario() - valorDesconto;
    }

    public String imprimir() {
        return "Cracha: " + cracha
                + "\nNome: " + nome
                + "\nTipoVinculo: " + tipoVinculado
                + "\nSalario: " + String.format("%.2f", calcularSalario())
                + "\nDesconto: " + String.format("%.2f", valorDesconto)
                + "\nValor Receber: " + String.format("%.2f", calcularValorReceber());
    }
}
