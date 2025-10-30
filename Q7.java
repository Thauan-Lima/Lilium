import java.util.Scanner;

public class Q7 {
	public static void main(String[] args) {
	    Scanner read = new Scanner(System.in);
	    int pesoPeixe, multa;
	    
		System.out.println("Digite o peso de peixes: ");
		pesoPeixe = read.nextInt();
		
		if (pesoPeixe > 50) {
		    multa = (pesoPeixe - 50)*4;
		    System.out.printf("\u001b[34mPeso excedente.%nMulta: %d\u001b[0m", multa);
		} else {
            System.out.println("\u001b[31mSeja feliz com seus peixes. <3\u001b[0m");
        }
		read.close();
	}
}
