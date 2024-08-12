import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Criação do veto A com 10 elementos
         int[] A = new int[10];

         System.out.println("Digite 10 numeros inteiros para o vetor A:");
         for(int i = 0; i< 10; i++){
            A[i] = scanner.nextInt();
         }
         //Vetor para armazenar a contagem de pares e impares
         int[] ParImpar = new int[2];
        
         for(int i = 0; i < 10; i++){
            if(A[i] % 2 == 0){
            ParImpar[0]++;
         } else {
            ParImpar[1]++;
         }
        }
        System.out.println("Quntidade de numeros pares: " + ParImpar[0]);
        System.out.println("Quantidade de numeros impares: " + ParImpar[1]);

        scanner.close();
    }
}
