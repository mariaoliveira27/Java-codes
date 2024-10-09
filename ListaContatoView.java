public class ListaContatoController  {
    private ContatoDAO contatoDAO;
    public ListarContatoController(ContatoDAO contatoDAO){
        this.contatoDAO = contatoDAO;
    }
    public void listarContratos(){
        for(Contato contato : contatoDAO.getContatos()){
            System.out.println("Nome: " + contato.getNome() + ", Telefone: " + contato.getTelefone());

        }
    }
    // sempre o que tiver em parenteses e o que ele vai receber
    public void BuscarContatoPornome(String nome){
        Contato contato = contatoDAO.findContatoByNome(nome);
        if(contato != null){
            System.out.println("Contato encontrado: Nome: " + contato.getNome + ",Telefone: " + contato.getTelefone());
        }else{
            System.out.println("Contato não encontrado.");
        }
    }
}