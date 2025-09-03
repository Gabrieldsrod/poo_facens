package aula_4;

public class Pessoa {
    private String CPF;
    private String nome;
    private String carteiraMotorista;

    public Pessoa(String CPF, String nome) {
        this.CPF = CPF;
        this.nome = nome;
    }

    public String getCarteiraMotorista() {
        return carteiraMotorista;
    }

    public void setCarteiraMotorista(String carteiraMotorista) {
        this.carteiraMotorista = carteiraMotorista;
    }
    
//    public String imprimir() {
//        String string = "\nNome: " + nome
//                + "\nCPF: " + CPF 
//                + "\nCarteira de motorista: " + carteiraMotorista;
//        return string;
//    }

    @Override
    public String toString() {
        return "Nome: " + nome
                + "\nCPF: " + CPF 
                + "\nCarteira de motorista: " + carteiraMotorista;
    }
    
    
}
