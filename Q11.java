import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salario, percentual, aumento, novoSalario;
        
        System.out.print("\u001b[31mInforme o salário atual do colaborador:\nR$ ");
        salario = input.nextDouble();

        if (salario <= 280.00) {
            percentual = 20.0;
        } else if (salario <= 700.00) {
            percentual = 15.0;
        } else if (salario <= 1500.00) {
            percentual = 10.0;
        } else {
            percentual = 5.0;
        }

        aumento = salario * (percentual / 100);
        novoSalario = salario + aumento;

        System.out.println("\u001b[1m\u001b[35mResultado do Reajuste");
        System.out.printf("Salário antes do reajuste: R$ %.2f%n", salario);
        System.out.printf("Percentual de aumento aplicado: %.0f%%%n", percentual);
        System.out.printf("Valor do aumento: R$ %.2f%n", aumento);
        System.out.printf("Novo salário após o aumento: R$ %.2f%n\u001b[0m", novoSalario);

        input.close();
    }
}
