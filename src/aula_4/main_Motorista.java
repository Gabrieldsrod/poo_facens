package aula_4;

public class main_Motorista {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("123456", "Cleber");
        
        pessoa.setCarteiraMotorista("AB");
        
//        System.out.println(pessoa.imprimir());

        System.out.println(pessoa);
    }

}
