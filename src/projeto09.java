/*Programa que lê 2 valores inteiros (A e B). Após, o programa mostra uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos são múltiplos entre si. Os números podem ser digitados em
ordem crescente ou decrescente */

import java.util.Scanner;

public class projeto09 {
    public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if (A % B == 0 || B % A == 0) {
			System.out.println("Sao Multiplos");
		}
		else {
			System.out.println("Nao sao Multiplos");
		}
		
		sc.close();
	}
}
