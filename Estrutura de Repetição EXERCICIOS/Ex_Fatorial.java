import java.util.Scanner;

/**
 * Faça um programa que calcule o fatorial de um número
 * inteiro fornecido pelo usuário.
 * Ex.: 5!= 120 (5x4x3x2x1)
 */
public class Ex_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int fatorial = scan.nextInt();

        int multiplicacao = 1;

        for(int i = fatorial; i >= 1; i--){
            multiplicacao = multiplicacao * i;
        }
        System.out.println(fatorial + "! = " + multiplicacao);
    }
}
