import java.util.Scanner;

public class Q13 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        String resposta;
        int somatoria = 0;
        
        System.out.println("Responda apenas com S(Sim) ou N(Não)");
        
        System.out.println("\n\u001b[34mTelefonou para a vítima?");
        resposta = read.next();
        if(resposta.equals("S")) somatoria++;
        
        System.out.println("\u001b[33mEsteve no local do crime?");
        resposta = read.next();
        if(resposta.equals("S")) somatoria++;
        
        System.out.println("\u001b[32mMora perto da vítima?");
        resposta = read.next();
        if(resposta.equals("S")) somatoria++;
        
        System.out.println("\u001b[35mDevia para a vítima?");
        resposta = read.next();
        if(resposta.equals("S")) somatoria++;
        
        System.out.println("\u001b[36mJá trabalhou com a vítima?");
        resposta = read.next();
        if(resposta.equals("S")) somatoria++;
        
        System.out.println("\nAnálisando...\n");
        if (somatoria == 2) {
            System.out.println("\u001b[31mClassificação: Suspeita\u001b[0m");
        } else if (somatoria >= 3 && somatoria <= 4) {
            System.out.println("\u001b[31mClassificação: Cúmplice\u001b[0m");
        } else if (somatoria == 5) {
            System.out.println("\u001b[31mClassificação: Assassino\u001b[0m");
        } else {
            System.out.println("\u001b[31mClassificação: Inocente\u001b[0m");
        }
        
    }
}
