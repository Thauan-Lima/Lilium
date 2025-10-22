import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double valor;
        int horas;

        System.out.println("\u001B[33mValor por hora: ");
        valor = read.nextDouble();

        System.out.println("\u001B[32mHoras de trabalho no mês: ");
        horas = read.nextInt();

        double salario = valor * horas;

        System.out.println("\u001B[35mSalário no final do mês: " + salario);
        read.close();
    }
}
