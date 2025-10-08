package aula_7;

import java.util.ArrayList;

public class Funcionario {
    private String nome;
    private ArrayList<Funcionario> lstFuncionario;
    private Funcionario chefe;

    public Funcionario(String nome) {
        this.nome = nome;
        this.lstFuncionario = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Funcionario> getLstFuncionario() {
        return lstFuncionario;
    }

    public void setLstFuncionario(ArrayList<Funcionario> lstFuncionario) {
        this.lstFuncionario = lstFuncionario;
    }

    public Funcionario getChefe() {
        return chefe;
    }

    public void setChefe(Funcionario chefe) {
        this.chefe = chefe;
    }
    
    public void addFuncionario(Funcionario func) {
        lstFuncionario.add(func);
    }
    
    public void imprimirFuncionarios() {
        for (Funcionario func : lstFuncionario) {
            System.out.println(func.getNome());
        }
    }
    
    public void imprimir() {
        System.out.println("Nome: " + nome);
    }
    
}
