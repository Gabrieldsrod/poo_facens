package aula_7;

import java.util.ArrayList;

public class Tutor {
    private String nome;
    private String cpf;
    private ArrayList<Pet> pets;

    public Tutor(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.pets = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public ArrayList<Pet> getPets() {
        return pets;
    }
    
    public void addPet(Pet pet) {
        pets.add(pet);
    }
    
    public void imprimir() {
        System.out.println("Nome: " + nome
                            + "\nCPF: " + cpf
                            + "\nPets: ");
        imprimirPets();
    }

    private void imprimirPets() {
        for (Pet p : pets) {
             p.imprimir();
        }
    }

    @Override
    public String toString() {
        return "Nome: " + nome
                + "\nCPF: " + cpf;
    }
}
