import java.util.Scanner;

public class Q7
{
	public static void main(String[] args) {
	    Scanner read = new Scanner(System.in);
	    int pesoPeixe, multa;
	    
		System.out.println("Digite o peso de peixes: ");
		pesoPeixe = read.nextInt();
		
		if (pesoPeixe > 50) {
		    multa = (pesoPeixe - 50)*4;
		    System.out.println("Peso excedente. Multa: " + multa);
		}
		read.close();
	}
}