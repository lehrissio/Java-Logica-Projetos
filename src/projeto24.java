/*
Programa para ler um número inteiro positivo N. O programa mostra na tela N linhas,
começando de 1 até N. Para cada linha, mostra o número da linha, depois o quadrado e o cubo do valor.
 */

import java.util.Scanner;

public class projeto24 {
	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);

			int n = sc.nextInt();
			
			for (int i=1; i<=n; i++) {

				int primeiro = i;
				int segundo = i * i;
				int terceiro = i * i * i;
				System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);
			}
			
			sc.close();
		}
}
