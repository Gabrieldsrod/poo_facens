package aula_11;

public class Carro extends Automovel{

    @Override
    public void acelera() {
        System.out.println("Vrum vrum");
    }

    @Override
    public void freia() {
        System.out.println("*Carro freia*");
    }

    public void abrirCapo() {
        System.out.println("*Abre capo do carro*");
    }
}
