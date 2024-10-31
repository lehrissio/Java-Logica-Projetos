/*
Programa que lê um número inteiro positivo N (máximo = 10) e depois N números inteiros
e armazena em um vetor. Em seguida, mostra na tela todos os números negativos lidos. 
 */

import java.util.Locale;
import java.util.Scanner;

public class projeto25 {
    public static void main(String[] args) {

            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);
            
            int n;
            
            System.out.print("Quantos numeros voce vai digitar? ");
            n = sc.nextInt();

            int[] vetor = new int[n];

            for (int i=0; i<n; i++) {
                System.out.print("Digite um numero: ");
                vetor[i] = sc.nextInt();
            }

            System.out.println("NUMEROS NEGATIVOS:");

            for (int i=0; i<n; i++) {
                if (vetor[i] < 0) {
                    System.out.printf("%d\n", vetor[i]);
                }
            }

            sc.close();
        }
}
