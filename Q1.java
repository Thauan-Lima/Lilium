import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n1, n2, n3, n4;

        System.out.println("Nota do 1° Bimestre: ");
        n1 = read.nextInt();
        System.out.println("Nota do 2° Bimestre: ");
        n2 = read.nextInt();
        System.out.println("Nota do 3° Bimestre: ");
        n3 = read.nextInt();
        System.out.println("Nota do 4° Bimestre: ");
        n4 = read.nextInt();

        int media = (n1 + n2 + n3 + n4) / 4;

        if (media >= 60 && media <= 100) {
            System.out.println(media + ". Aprovado.");
        } else if (media < 60 && media >= 40) {
            System.out.println(media + ". Prova final.");
        } else if (media < 40) {
            System.out.println(media + ". Reprovado.");
        } else {
            System.out.println("Inválido.");
        }
        read.close();
    }
}
