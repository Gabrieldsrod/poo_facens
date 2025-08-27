package aula_3;

public class main_escola {

    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.setRA("123456");
        a1.setCurso("Computacao");
        a1.setNome("Gabriel");
        
        Aluno a2 = new Aluno();
        a2.setRA("333333");
        a2.setCurso("Medicina");
        a2.setNome("Joao");
        
        System.out.println(a1.getNome());
    }

}
