import java.util.Scanner;
public class AreaDoCirculo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        final double n = 3.14159;
        double raio, area;
        raio = scanner.nextDouble();
        area = n * raio * raio;
         //Sempre que for printf separa por , e quando println +

         System.out.printf("A=%.4f%n",area);

         scanner.close();
    }
}
