import java.util.Scanner;

public class Q22{
    public static boolean validarIP(String ip) {
        String[] partes = ip.split("\\.");

        if (partes.length != 4) return false;

        for (String p : partes) {
            int num;
            try {
                num = Integer.parseInt(p);
            } catch (NumberFormatException e) {
                return false;
            }

            if (num < 0 || num > 255) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        while (true) {
            System.out.print("\u001b[36mDigite um IP (ou 'sair' para encerrar): ");
            String ip = read.nextLine();

            if (ip.equalsIgnoreCase("sair")) {
                System.out.println("Programa encerrado.\u001b[0m");
                break;
            }

            if (validarIP(ip))
                System.out.println("\u001b[32mIP válido!\n");
            else
                System.out.println("\u001b[31mIP inválido!\n");
        }

        read.close();
    }
}
