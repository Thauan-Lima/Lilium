import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double altura, pesoIdeal;

        System.out.println("\u001B[33mDigite sua altura: ");
        altura = read.nextDouble();

        pesoIdeal = 72.7 * altura - 58;

        System.out.println("\u001B[31mSeu peso ideal é: " + pesoIdeal);
        read.close();
    }
}
