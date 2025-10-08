package aula_7;

public class main_func {

    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Ana");
        Funcionario f2 = new Funcionario("Antonio");
        Funcionario f3 = new Funcionario("Adamastor");
        
        f1.setChefe(f3);
        f2.setChefe(f3);
        
        f3.addFuncionario(f1);
        f3.addFuncionario(f2);
        
        f3.imprimir();
        f3.imprimirFuncionarios();
    }
}
