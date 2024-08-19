import java.util.Scanner;

public class Inversao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        System.out.print("Digite um frase: ");
        String frase = scanner.nextLine();

        scanner.close();
        String[]palavra = new String[1000];
        int contador = 0;
        int comeco = 0;

        for(int i = 0; i < frase.length(); i++ ){
            if(frase.charAt(i) == ' '|| i == frase.length() - 1){
                if(i == frase.length()-1 && frase.charAt(i)!= ' '){
                    i++;
                }
                palavra[contador]= frase.substring(comeco,i).trim();
                contador ++;
                comeco = i + 1;
            }
        }
        StringBuilder resultado = new StringBuilder();
        for(int i = contador - 1; i >= 0; i--){
            resultado.append(palavra[i]).append(" ");
        }
        System.out.println(resultado.toString().trim());

        
    }
}
