import DAO.ContatoDAO;
import controller.AddContatoController;
import controller.ListaContatoController;
import view.AddContatoView;
import view.ListaContatoView;

public class Main {
    public static void main(String[] args) {
        ContatoDAO contatoDAO = new ContatoDAO();
        
        AddContatoController addController = new AddContatoController(contatoDAO);
        ListaContatoController listController = new ListaContatoController(contatoDAO);

        AddContatoView addView = new AddContatoView(addController);
        ListaContatoView listView = new ListaContatoView(listController);

        // Example of adding a contact
        addView.mostrar();

        // Example of listing contacts
        listView.mostrar();

        // Example of searching for a contact
        listView.buscar();
    }
}
