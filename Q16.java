import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int idade;

        System.out.println("\u001B[33m\u001b[1mDê a sua idade: ");
        idade = read.nextInt();

        if(idade >= 0 && idade <= 25){
            System.out.println("\u001b[35mJovem.\nNa flor da idade.\u001b[0m");
        } else if(idade >= 26 && idade <= 60){
            System.out.println("\u001b[35mAdulto.\nParece tão abatida...\u001b[0m");
        } else {
            System.out.println("\u001b[35mIdoso.\nNão levanta a mão que Deus puxa!\u001b[0m");
        }
        read.close();
    }
}
