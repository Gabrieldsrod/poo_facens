package aula_10_tarefa;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class mainFuncionario {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        
        int op;
        do {
            
            op = Integer.parseInt(JOptionPane.showInputDialog("\n1 - Criar funcionario"
                    + "\n2 - Mostrar"
                    + "\n3 - Sair"));

            switch (op) {
                case 1:
                    int numeroCracha = Integer.parseInt(JOptionPane.showInputDialog("Numero do Crachá"));
                    String nome = JOptionPane.showInputDialog("Nome");
                    String setor = JOptionPane.showInputDialog("Setor");
                    String funcao = JOptionPane.showInputDialog("Função");
                    
                    int tipoFuncionario = Integer.parseInt(JOptionPane.showInputDialog("\n1 - Horista"
                    + "\n2 - Mensalista"));;
                    
                    switch (tipoFuncionario) {
                        case 1:
                            int qtdeHoras = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de horas"));
                            double valorHora = Double.parseDouble(JOptionPane.showInputDialog("Quantidade de horas"));
                            funcionarios.add(new FuncionarioHorista(qtdeHoras, valorHora, numeroCracha, nome, setor, funcao));
                            
                            break;
                            
                        case 2:
                            double salario = Integer.parseInt(JOptionPane.showInputDialog("Salario"));
                            double desconto =Double.parseDouble(JOptionPane.showInputDialog("Desconto"));
                            funcionarios.add(new FuncionarioMensalista(salario, desconto, numeroCracha, nome, setor, funcao));
                            
                            break;
                        default:
                            System.out.println("Tipo de funcionario inexistente");
                            throw new AssertionError();
                    }
                    
                    break;
                case 2:
                    for(Funcionario funcionario : funcionarios) {
                        JOptionPane.showMessageDialog(null, funcionario.toString(), "Funcionarios" , JOptionPane.PLAIN_MESSAGE);
                    }    
                    
                    break;
                case 3:
                    
                    break;
             
            }
        } while (op != 3);
    }
    

}
