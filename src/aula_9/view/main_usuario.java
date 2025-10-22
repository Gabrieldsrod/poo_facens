package aula_9.view;

import aula_9.dao.UsuarioDAO;
import aula_9.entity.Usuario;
import java.util.ArrayList;

public class main_Usuario {

    public static void main(String[] args) {
        Usuario user1 = new Usuario("Otavio", "1236");
        Usuario user2 = new Usuario("jao cleber", "1234");
        Usuario user3 = new Usuario("Fabini Colombini", "123");
        Usuario user4 = new Usuario("Pimpom", "126");
        
        UsuarioDAO dao = new UsuarioDAO();
        
//        dao.inserir(user1);
//        dao.inserir(user2);
//        dao.inserir(user3);
//        dao.inserir(user4);

        ArrayList<Usuario> list = new ArrayList<>();
        
        list = dao.getAllUsuarios();
        
        for (Usuario user : list) {
            System.out.println(user.getLogin());
        }
    }

}
