import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        String[] meses = {
            "janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"
        };

        while (true) {
            System.out.print("\u001b[1m\u001b[36mDigite uma data (DD/MM/AAAA) ou 'sair' para encerrar: ");
            String data = read.nextLine();

            if (data.equalsIgnoreCase("sair")) {
                System.out.println("Programa encerrado.");
                break;
            }

            String[] partes = data.split("/");
            int dia = Integer.parseInt(partes[0]);
            int mes = Integer.parseInt(partes[1]);
            int ano = Integer.parseInt(partes[2]);

            System.out.println(dia + " de " + meses[mes - 1] + " de " + ano + "\n");
        }

        read.close();
    }
}
