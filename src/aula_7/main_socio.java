package aula_7;

public class main_socio {

    public static void main(String[] args) {
        Socio s1 = new Socio("Fabio");
        
        Dependente d1 = new Dependente("Igor");
        s1.addDependente(d1);
    }

}
