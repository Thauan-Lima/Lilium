import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n1, n2, a;
        double n3, b, c;

        System.out.println("\u001B[33mDigite o primeiro número (inteiro): ");
        n1 = read.nextInt();
        System.out.println("\u001B[32mDigite o segundo número (inteiro): ");
        n2 = read.nextInt();
         System.out.println("\u001B[34mDigite o terceiro número (real): ");
        n3 = read.nextDouble();

        a = (2*n1)*(n2/2);
        b = 3*n1 + n3;
        c = n3*n3*n3;
        System.out.println("\u001b[35mO produto do dobro do primeiro com metade do segundo é: " + a);
        System.out.println("\u001b[35mA soma do triplo do primeiro com o terceiro é: " + b);
        System.out.println("\u001b[35mO terceiro elevado ao cubo é: " + c + "\u001b[0m");
        read.close();
    }
}
