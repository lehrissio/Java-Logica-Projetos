/*
Programa que lê dois vetores A e B, contendo N elementos cada. Em seguida, gera um
terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprime
o vetor C gerado.
 */

import java.util.Locale;
import java.util.Scanner;

public class projeto30 {
    public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;

	    System.out.print("Quantos valores vai ter cada vetor? ");
	    n = sc.nextInt();

	    int[] a = new int[n];
	    int[] b = new int[n];
	    int[] c = new int[n];

	    System.out.println("Digite os valores do vetor A:");

	    for (int i=0; i<n; i++) {
			a[i] = sc.nextInt();
	    }

	    System.out.println("Digite os valores do vetor B:");

	    for (int i=0; i<n; i++) {
	        b[i] = sc.nextInt();
	    }

	    for (int i=0; i<n; i++) {
	        c[i] = a[i] + b[i];
	    }

	    System.out.println("VETOR RESULTANTE:");

	    for (int i=0; i<n; i++) {
	    	System.out.printf("%d\n", c[i]);
	    }

		sc.close();
	}
}
