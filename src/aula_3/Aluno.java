package aula_3;

public class Aluno {
    private String nome;
    private String RA;
    private String curso;

    public Aluno() {
    }

    public Aluno(String nome, String RA, String curso) {
        this.nome = nome;
        this.RA = RA;
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRA() {
        return RA;
    }

    public void setRA(String RA) {
        this.RA = RA;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", RA=" + RA + ", curso=" + curso + '}';
    }
   
    
}
