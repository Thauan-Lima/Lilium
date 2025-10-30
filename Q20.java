import java.util.Scanner;

public class Q20 {

    public static void imprimeNum(int n){
        for (int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("\u001b[31mDigite um número inteiro N: ");
        int N = read.nextInt();
        imprimeNum(N);

        read.close();
    }
}
