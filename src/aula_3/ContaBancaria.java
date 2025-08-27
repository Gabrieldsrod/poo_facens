package aula_3;

public class ContaBancaria {
    private String id;
    private double saldo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Depositado: R$" + valor);
    }
    
    public void sacar(double valor) {
        if (saldo > 0)
            this.saldo -= valor;
        else 
            System.out.println("Saldo insuficiente");
    }
    
    public void imprimir() {
        System.out.println("Saldo: " + saldo);
    }
}
