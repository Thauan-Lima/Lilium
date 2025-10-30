import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double n1, n2, media;
        char conceito;
        String situacao;

        System.out.println("\u001b[34mNota do 1° Bimestre: ");
        n1 = read.nextInt();
        System.out.println("\u001b[32mNota do 2° Bimestre: ");
        n2 = read.nextInt();

        media = (n1 + n2) / 2;
        
        if (media >= 9.0 && media <= 10.0) {
            conceito = 'A';
            situacao = "Aprovado com Distinção";
        } else if (media >= 7.5 && media < 9.0) {
            conceito = 'B';
            situacao = "Aprovado";
        } else if (media >= 6.0 && media < 7.5) {
            conceito = 'C';
            situacao = "Aprovado";
        } else if (media >= 4.0 && media < 6.0) {
            conceito = 'D';
            situacao = "Reprovado";
        } else if(media >= 0.0 && media <= 4.0) {
            conceito = 'E';
            situacao = "Reprovado";
        } else {
            conceito = 'N';
            situacao = "Inválido";
            System.out.println("Inválido.\n");
        }

        System.out.println("\u001b[1m\u001b[35mResultado");
        System.out.printf("1ª Nota: %.1f%n", n1);
        System.out.printf("2ª Nota: %.1f%n", n2);
        System.out.printf("Média: %.1f%n", media);
        System.out.printf("Conceito: %c%n", conceito);
        System.out.printf("Situação: %s%n\u001b[0m", situacao);
        
        read.close();
    }
}
