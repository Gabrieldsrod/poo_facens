package aula_8;

public class Aluno extends Pessoa{
    private String ra;
    private double nota1;
    private double nota2;

    public Aluno(String ra, double nota1, double nota2) {
        super();
        this.ra = ra;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    
    public double media() {
        double media = (nota1 + nota2) / 2;
        return media;
    }
    
    public String imprimir() {
        String msg = "\n\n================"
                + "Nome: " + getNome()
                + "CPF: " + getCpf()
                + "RA: " + getRa()
                + "Nota 1: " + getNota1()
                + "Nota 2: " + getNota2()
                + "Media: " + media();
        
        return msg;
    }
}
