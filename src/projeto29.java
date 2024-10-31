/*
Programa que lê N números reais e armazena-os em um vetor. Em seguida, mostra na tela
o maior número do vetor (supor não haver empates). Mostra também a posição do maior elemento,
considerando a primeira posição como 0 (zero). 
 */

import java.util.Locale;
import java.util.Scanner;

public class projeto29 {
    public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, posmaior;
	    double maior;

	    System.out.print("Quantos numeros voce vai digitar? ");
	    n = sc.nextInt();

	    double[] vetor = new double[n];

	    for (int i=0; i<n; i++) {
	    	System.out.print("Digite um numero: ");
	        vetor[i] = sc.nextDouble();
	    }

	    maior = vetor[0];
	    posmaior = 0;

	    for (int i=1; i<n; i++) {
	        if (vetor[i] > maior) {
	            maior = vetor[i];
	            posmaior = i;
	        }
	    }
		
	    System.out.printf("MAIOR VALOR = %.1f\n", maior);
	    System.out.printf("POSICAO DO MAIOR VALOR = %d\n", posmaior);

		sc.close();
	}
}