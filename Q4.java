import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int F;

        System.out.println("\u001B[35mTemperatura graus Farenheit: ");
        F = read.nextInt();

        int C = (5 *(F - 32))/9;

        System.out.println("\u001B[34mConversão para Celsius: " + C);
        read.close();
    }
}
