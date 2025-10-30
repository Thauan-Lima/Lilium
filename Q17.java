import java.util.Scanner;

public class Lanchonete {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        double total = 0.0;
        int codigo, quantidade;

        System.out.println("===== CARDÁPIO =====");
        System.out.println("100 - Cachorro-quente   R$ 1,20");
        System.out.println("101 - Bauru simples     R$ 1,30");
        System.out.println("102 - Bauru com ovo     R$ 1,50");
        System.out.println("103 - Hambúrguer        R$ 1,20");
        System.out.println("104 - Cheeseburguer     R$ 1,30");
        System.out.println("105 - Refrigerante      R$ 1,00");
        System.out.println("======================");
        System.out.println("Digite 0 para encerrar o pedido.\n");

        while (true) {
            System.out.print("Digite o código do produto: ");
            codigo = read.nextInt();

            if (codigo == 0) {
                break;
            }

            System.out.print("Digite a quantidade: ");
            quantidade = read.nextInt();

            double preco = 0;

            switch (codigo) {
                case 100:
                    preco = 1.20;
                    break;
                case 101:
                    preco = 1.30;
                    break;
                case 102:
                    preco = 1.50;
                    break;
                case 103:
                    preco = 1.20;
                    break;
                case 104:
                    preco = 1.30;
                    break;
                case 105:
                    preco = 1.00;
                    break;
                default:
                    System.out.println("Código inválido! Tente novamente.");
                    continue;
            }

            total += preco * quantidade;
        }

        System.out.printf("\nValor total do pedido: R$ %.2f%n", total);

        read.close();
    }
}
