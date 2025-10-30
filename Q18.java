import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();

        while (true) {
            System.out.print("\u001b[34mInforme uma nota (-1 para encerrar): ");
            double nota = read.nextDouble();
            if (nota == -1) break;
            notas.add(nota);
        }
        System.out.println("\u001b[36\nQuantidade de notas lidas: " + notas.size());

        // b) Exibir todos os valores na ordem em que foram informados
        System.out.print("\u001b[31mNotas na ordem informada: ");
        for (double n : notas) {
            System.out.print(n + " ");
        }

        System.out.println("\n\nNotas na ordem inversa:");
        for (int i = notas.size() - 1; i >= 0; i--) {
            System.out.println(notas.get(i));
        }
        
        double soma = 0;
        for (double n : notas) soma += n;
        double media = (notas.size() > 0) ? soma / notas.size() : 0;
        System.out.printf("\u001b[32m%nMédia das notas: %.2f%n", media);
      
        int acima = 0;
        int abaixo = 0;
        for (double n : notas) {
            if (n > media) acima++;
            else if (n < media) abaixo++;
        }

        System.out.println("\u001b[35mQuantidade de notas acima da média: " + acima);
        System.out.printf("Quantidade de notas abaixo da média: %d\u001b[0m", abaixo);

        read.close();
    }
}
