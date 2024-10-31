/*Programa que lê um número N. Depois lê N pares de números e mostra a divisão do primeiro pelo
segundo. Se o denominador for igual a zero, mostra a mensagem "divisao impossivel".*/

import java.util.Scanner;

public class projeto21 {
	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);

			int n = sc.nextInt();
			
			for (int i=0; i<n; i++) {
				
				int x = sc.nextInt();
				int y = sc.nextInt();
				
				if (y == 0) {
					System.out.println("divisao impossivel");
				}
				else {
					double div = (double) x / y;
					System.out.printf("%.1f%n", div);
				}
			}
			
			sc.close();
		}
}
