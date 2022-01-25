import java.util.Scanner;
/**
 * Faça um programa que leia 5 números e informe
 * o maior número e a média desses números.
 */
public class Ex_MaiorMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;
        int count = 0;

        do{
            System.out.println("\nDigite um número: ");
             numero = scan.nextInt();

             soma = soma + numero;

             if(numero > maior) maior = numero;

             count = count + 1;
        } while(count < 5);

        System.out.println("\nNúmero maior: " + maior);
        System.out.println("A média dos números é: " + (soma/5));
    }
}