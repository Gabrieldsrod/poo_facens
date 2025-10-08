package aula_7;

import java.util.ArrayList;

public class Socio {
    String nome;
    ArrayList<Dependente> dependentes;

    public Socio(String nome) {
        this.nome = nome;
        this.dependentes = new ArrayList<>();    
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Dependente> getDependentes() {
        return dependentes;
    }
    
    public void addDependente(Dependente dep) {
        dependentes.add(dep);
    }
}
