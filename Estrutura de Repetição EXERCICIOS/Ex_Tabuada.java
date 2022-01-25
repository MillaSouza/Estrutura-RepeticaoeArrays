import java.util.Scanner;

/**
 * Desenvolva um gerador de tabuada, capaz de gerar
 * a tabuada de qualquer número inteiro entre 1 e 10.
 * O usuário deve informar de qual número ele deseja ver a tabuada.
 */
public class Ex_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Escolha um valor a ser exibido entre 1 e 10: ");
        int tabuada = scan.nextInt();

        System.out.println("\nTabuada de: " + tabuada);

        for(int i =1; i <= 10; i++){
            System.out.println(tabuada + "x" + i + "=" + (tabuada*i));
        }
    }
}
