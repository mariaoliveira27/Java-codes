import java.util.Scanner;

public class Vetor {
    public static int fatorial(int n){
        int fat = 1;
        for(int i = 2; i<=n;i++){
            fat *= i;
        }
        return fat;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[15];
        int[] B = new int [15];
        System.out.println("Digite 15 numeros para o vetor A:");
        for(int i =0; i<15;i++){
            A[i] = scanner.nextInt();
        }
        for(int i = 0; i<15;i++){
            B[i] = fatorial(A[i]);
        }
        System.out.println("Vetor A: ");
        for(int i = 0; i<15; i ++){
            System.out.print(A[i]+" ");
        }
        System.out.print("\n Vetor B:");
        for(int i = 0; i<15; i++){
            System.out.print(B[i]+"");
        }
    }
}
