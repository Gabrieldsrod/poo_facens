package aula_8;

public class Professor extends Pessoa{
    private String cracha;
    private char tipoVinculo;
    private double Salario;

    public Professor() {
    }

    public Professor(String cracha, char tipoVinculo, double Salario, String nome, String cpf) {
        super(nome, cpf);
        this.cracha = cracha;
        this.tipoVinculo = tipoVinculo;
        this.Salario = Salario;
    }

    public String getCracha() {
        return cracha;
    }

    public void setCracha(String cracha) {
        this.cracha = cracha;
    }

    public char getTipoVinculo() {
        return tipoVinculo;
    }

    public void setTipoVinculo(char tipoVinculo) {
        this.tipoVinculo = tipoVinculo;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }

    public String imprimir() {
        String msg = "\n\n================"
                + "Nome: " + getNome()
                + "CPF: " + getCpf()
                + "Cracha: " + getCracha()
                + "Tipo de Vinculo: " + getTipoVinculo()
                + "Salario: R$" + getSalario();
        
        return msg;
    }
    
}
