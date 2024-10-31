/*
Programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
são armazenados em um vetor, e as idades em um outro vetor. Depois, mostra na tela o nome
da pessoa mais velha. 
 */

import java.util.Locale;
import java.util.Scanner;


public class projeto33 {
    public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, maioridade, posicaomaior;

	    System.out.print("Quantas pessoas voce vai digitar? ");
	    n = sc.nextInt();

	    String[] nomes = new String[n];
	    int[] idades = new int[n];

	    for (int i=0; i<n; i++) {
	    	System.out.printf("Dados da %da pessoa:\n", i + 1);
			System.out.print("Nome: ");
			nomes[i] = sc.next();
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
	    }

	    maioridade = idades[0];
	    posicaomaior = 0;

	    for (int i=1; i<n; i++) {
	        if (idades[i] > maioridade) {
	            maioridade = idades[i];
	            posicaomaior = i;
	        }
	    }

	    System.out.printf("PESSOA MAIS VELHA: %s\n", nomes[posicaomaior]);

		sc.close();
	}
}
