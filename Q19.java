import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        while (true) {
            System.out.print("\u001b[32mNome do atleta (ou ENTER para encerrar): ");
            String nome = read.nextLine().trim();

            if (nome.isEmpty()) {
                System.out.println("\nPrograma encerrado.");
                break;
            }

            double[] saltos = new double[5];
            String[] ordens = {"Primeiro", "Segundo", "Terceiro", "Quarto", "Quinto"};

            for (int i = 0; i < 5; i++) {
                System.out.print(ordens[i] + " salto: ");
                saltos[i] = read.nextDouble();
            }
            read.nextLine();
            System.out.println("\u001b[33m\nAtleta: " + nome);
            for (int i = 0; i < 5; i++) {
                System.out.printf("%s Salto: %.1f m%n%n", ordens[i], saltos[i]);
            }

            double soma = 0;
            for (double s : saltos) soma += s;
            double media = soma / saltos.length;

           System.out.println("\u001b[31m\nResultado:");
            System.out.println("Atleta: " + nome);

            System.out.print("Saltos: ");
            for (int i = 0; i < 5; i++) {
                System.out.print(saltos[i]);
                if (i < 4) System.out.print(" - ");
            }

            System.out.printf("%nMédia dos saltos: %.1f metros%n\u001b[0m", media);
        }

        read.close();
    }
}
