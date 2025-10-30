import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double valor;
        int horas;
        System.out.println("\u001B[34mValor por hora: ");
        valor = read.nextDouble();

        System.out.println("\u001B[32mHoras de trabalho no mês: ");
        horas = read.nextInt();

        double salarioBruto = valor * horas;
        double impostoRenda = (salarioBruto * 11)/100;
        double INSS = (salarioBruto * 8)/100;
        double sindicato = (salarioBruto * 5)/100;
        double salarioLiq = salarioBruto - (impostoRenda + INSS + sindicato);
        System.out.println("\u001B[35mSalário Bruto: R$ " + salarioBruto);
        System.out.println("\u001B[35mQuanto pagou ao INSS: R$ " + INSS);
        System.out.println("\u001B[35mQuanto pagou ao sindicato: R$" + sindicato);
        System.out.printf("\u001B[35mO salário líquido: R$ %.2f\u001b[0m", salarioLiq);
        read.close();
    }
}
