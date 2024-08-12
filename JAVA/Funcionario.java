import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

class Funcionario {
    private String nome;
    private String sexo;
    private LocalDate dataDeNascimento;

    public  Funcionario (String nome, String sexo, LocalDate dataDeNascimento){
        this.nome = nome;
        this.sexo = sexo;
        this.dataDeNascimento = dataDeNascimento;
    }
    public String getNome(){
        return nome;
    }
    public String getSexo(){
        return sexo;
    }
    public LocalDate getDataNascimento(){
        return dataDeNascimento;
    }
    public String toString(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "Nome: " + nome + ", Sexo: " + sexo +", Data de Nascimento: " + dataDeNascimento.format(formatter)
    }
    public void add(Object funcionario) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }
    public class Empresa {
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            ArrayList<Funcionario> Funcionarios = new ArrayList<>();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
            for(int i = 0; i < 10; i++){
                System.out.println("Digite as informações do fucionário " + (i + 1) + ":");
    
                System.out.print("Nome:");
                String nome = scanner.nextLine();
    
                System.out.print("Sexo (M/F):");
                String sexo = scanner.nextLine();
    
                System.out.print("Data de Nascimento (dd/MM/yyyy):");
                String dataDeNascimentoStr = scanner.nextLine();
                LocalDate dataDeNascimento = LocalDate.parse(dataDeNascimentoStr, formatter);
    
                //Cria um novo funvionario e adiciona a lista
                Funcionario funcionarios = new Funcionario(nome, sexo, dataDeNascimento);
                Object funcionario;
                funcionarios.add(funcionario);
    
                System.out.println();
    
            }
            System.out.println("Lista de funcionarios:");
            for(Informacoes informacoes : in)
            System.out.println(); // Para melhor visualização
        }
    
        // Apresenta os resultados
        System.out.println("Lista de Funcionários:");
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }
    
        scanner.close();
    }
}


    