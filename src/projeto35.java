/*
Programa que calcula e escreve a maior e a menor altura do grupo, a média de altura das mulheres, e o número
de homens.

Obs.: Considerando gênero com M ou F.
 */

import java.util.Locale;
import java.util.Scanner;


public class projeto35 {
    public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, qtdhomens, qtdmulheres;
	    double menoraltura, maioraltura, alturafemMedia, alturafemtotal;

	    System.out.print("Quantas pessoas serao digitadas? ");
	    n = sc.nextInt();

	    double[] alturas = new double[n];
	    char[] generos = new char[n];

	    for (int i=0; i<n; i++) {
	    	System.out.printf("Altura da %da pessoa: ", i + 1);
	        alturas[i] = sc.nextDouble();
	        System.out.printf("Genero da %da pessoa: ", i + 1);
	        generos[i] = sc.next().charAt(0);
	    }

	    menoraltura = alturas[0];
	    maioraltura = alturas[0];

	    for (int i=1; i<n; i++) {
	        if (alturas[i] > maioraltura) {
	            maioraltura = alturas[i];
	        }
	        if (alturas[i] < menoraltura) {
	            menoraltura = alturas[i];
	        }
	    }

		qtdhomens = 0;
		qtdmulheres = 0;
		alturafemtotal = 0;
	    for (int i=0; i<n; i++) {
	        if (generos[i]=='M'|| generos[i]=='m') {
	            qtdhomens++;
	        }
	        else {
	            qtdmulheres++;
	            alturafemtotal = alturafemtotal + alturas[i];
	        }
	    }

	    alturafemMedia = alturafemtotal / qtdmulheres;

	    System.out.printf("Menor altura = %.2f\n", menoraltura);
	    System.out.printf("Maior altura = %.2f\n", maioraltura);
	    System.out.printf("Media das alturas das mulheres = %.2f\n", alturafemMedia);
	    System.out.printf("Numero de homens = %d\n", qtdhomens);

		sc.close();
	}
}
