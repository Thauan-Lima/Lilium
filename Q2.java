import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int raio;

        System.out.println("\u001B[33mDê o raio de um círculo: ");
        raio = read.nextInt();

        int diam = 2*raio;
        double area = Math.PI*raio*raio;

        System.out.println("\u001B[31mDiâmetro: "+ diam);
        System.out.println("\u001B[32mÁrea: %d\u001b[0m", area);
        read.close();
    }
}
