/*Programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa.*/ 

import java.util.Scanner;

public class projeto01 {
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int A, B, soma;

		A = sc.nextInt();
		B = sc.nextInt();

		soma = A + B;

		System.out.println("SOMA = " + soma);

		sc.close();
	}
}
