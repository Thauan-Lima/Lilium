import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double area, litros, latas, preco;

        System.out.println("\u001B[33mInforme a área a ser pintada: ");
        area = read.nextDouble();
        
        litros = area/3;
        latas = litros/18;
        preco = latas * 80;

        System.out.println("\u001B[31mLatas de tinta necessárias: " + latas);
        System.out.printf("\u001B[31mValor total: R$ %.2f\u001b[0m", preco);
        read.close();
    }
}
