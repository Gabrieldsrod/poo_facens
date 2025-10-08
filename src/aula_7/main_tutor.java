package aula_7;

public class main_tutor {

    public static void main(String[] args) {
        Pet p1 = new Pet("Jake", "Cachorr0", 13);
        Pet p2 = new Pet("Humberto", "Gato", 10);
        
        Tutor t1 = new Tutor("Gabriel", "123.345.654-5");
        
        t1.addPet(p1);
        t1.addPet(p2);
        
        t1.imprimir();
        System.out.println(t1.toString());
    }

}
