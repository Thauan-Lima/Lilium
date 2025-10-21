import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n1, n2, n3, n4;

        System.out.println("\u001b[34mNota do 1° Bimestre: ");
        n1 = read.nextInt();
        System.out.println("\u001b[32mNota do 2° Bimestre: ");
        n2 = read.nextInt();
        System.out.println("\u001b[33mNota do 3° Bimestre: ");
        n3 = read.nextInt();
        System.out.println("\u001b[36mNota do 4° Bimestre: ");
        n4 = read.nextInt();

        int media = (n1 + n2 + n3 + n4) / 4;
        if (media >= 60 && media <= 100) {
            System.out.println("\u001b[35mMédia: " + media + ". Aprovado.");
        } else if (media < 60 && media >= 40) {
            System.out.println("\u001b[35mMédia: " +media + ". Prova final.");
        } else if (media < 40) {
            System.out.println("\u001b[35mMédia: " + media + ". Reprovado.");
        } else {
            System.out.println("Inválido.\u001b[0m");
        }
        read.close();
    }
}
