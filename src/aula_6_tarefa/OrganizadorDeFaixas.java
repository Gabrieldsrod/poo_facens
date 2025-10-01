package aula_6_tarefa;

import java.util.ArrayList;

public class OrganizadorDeFaixas {

    private ArrayList<Faixa> faixas = new ArrayList<>();

    public void adicionarFaixa(String titulo, String artista, int duracao) {
        faixas.add(new Faixa(titulo, artista, duracao));
    }

    public void adicionarFaixa(Faixa faixa) {
        faixas.add(faixa);
    }

    public void listarTodasAsFaixas() {
        for (Faixa faixa : faixas) {
            System.out.println(faixa.print());
            System.out.println("");
        }
    }

    public void reproduzirFaixa(int indice) {
        if (indice >= 0 && indice < faixas.size()) {
            faixas.get(indice).reproduzir();
        } else {
            System.out.println("Indice invalido");
        }
    }

    public void removerFaixa(int indice) {
        if (indice >= 0 && indice < faixas.size()) {
            faixas.remove(indice);
        } else {
            System.out.println("Indice invalido");
        }
    }
}
