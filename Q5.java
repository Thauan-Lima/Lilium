import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n1, n2, a;
        double n3, b, c;

        System.out.println("\u001B[33mDigite o primeiro número (inteiro): ");
        n1 = read.nextInt();
        System.out.println("\u001B[33mDigite o segundo número (inteiro): ");
        n2 = read.nextInt();
         System.out.println("\u001B[33mDigite o terceiro número (real): ");
        n3 = read.nextDouble();

        a = (2*n1)*(n2/2);
        b = 3*n1 + n3;
        c = n3*n3*n3;


        read.close();
    }
}
