import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        double kgMorango, kgMaca, precoMorango, precoMaca;
        double total, desconto = 0;
        
        System.out.println("\u001b[1mFrutas\n");
        System.out.print("\u001b[42m\u001b[31mDigite a quantidade de morangos (kg): ");
        kgMorango = read.nextDouble();

        System.out.print("\u001b[41m\u001b[32mDigite a quantidade de maçãs (kg): ");
        kgMaca = read.nextDouble();

        if (kgMorango <= 5) {
            precoMorango = kgMorango * 2.50;
        } else {
            precoMorango = kgMorango * 2.20;
        }

        if (kgMaca <= 5) {
            precoMaca = kgMaca * 1.80;
        } else {
            precoMaca = kgMaca * 1.50;
        }

        total = precoMorango + precoMaca;

        if ((kgMorango + kgMaca) > 8 || total > 25.0) {
            desconto = total * 0.10;
            total -= desconto;
        }

        System.out.printf("\n\u001b[0mValor morangos: R$ %.2f%n", precoMorango);
        System.out.printf("Valor maçãs: R$ %.2f%n", precoMaca);
        if (desconto > 0) {
            System.out.printf("Desconto aplicado: R$ %.2f%n", desconto);
        }
        System.out.printf("Total a pagar: R$ %.2f%n", total);

        read.close();
    }
}
