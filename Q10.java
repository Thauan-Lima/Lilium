import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double tamanho, velocidade, segundos, minutos;

        System.out.println("\u001B[33mInforme o tamanho do arquivo (Em MB): ");
        tamanho = read.nextDouble();
        
        System.out.println("\u001B[32mInforme a velocidade do link (Em Mbps): ");
        velocidade = read.nextDouble();
        
        segundos = (tamanho * 8) / velocidade;
        minutos = segundos / 60;

        System.out.printf("\u001B[31mO tempo aproximado do download é de %.0f minutos\u001b[0m", minutos);
        read.close();
    }
}
