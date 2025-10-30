import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        String nome;
        int idade;
        double salario;
        char sexo, estadoCivil;

        System.out.println("\u001b[1m\u001b[35mFaça tudo certinho, por favor!")
        do {
            System.out.print("Digite o nome (mais de 3 caracteres): ");
            nome = read.nextLine();
        } while (nome.length() <= 3);

        do {
            System.out.print("Digite a idade (0 a 150): ");
            idade = read.nextInt();
        } while (idade < 0 || idade > 150);
      
        do {
            System.out.print("Digite o salário (maior que 0): ");
            salario = read.nextDouble();
        } while (salario <= 0);
      
        do {
            System.out.print("Digite o sexo ('f' ou 'm'): ");
            sexo = read.next().toLowerCase().charAt(0);
        } while (sexo != 'f' && sexo != 'm');
      
        do {
            System.out.print("Digite o estado civil ('s', 'c', 'v' ou 'd'): ");
            estadoCivil = read.next().toLowerCase().charAt(0);
        } while (estadoCivil != 's' && estadoCivil != 'c' &&
                 estadoCivil != 'v' && estadoCivil != 'd');

        System.out.println("\n\u001b[31mDados válidos");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.printf("Salário: R$ %.2f%n", salario);
        System.out.println("Sexo: " + sexo);
        System.out.printf("Estado Civil: %c\u001b[0m", estadoCivil);

        read.close();
    }
}
