/*Programa que repite a leitura de uma senha até que ela seja válida. Para cada leitura de senha
incorreta informada, a mensagem "Senha Invalida" é impressa. Quando a senha for informada corretamente é impressa a mensagem "Acesso Permitido" e o algoritmo encerra. A senha correta é o valor 2002. */

import java.util.Scanner;

public class projeto15 {
    public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int senha = sc.nextInt();
		
		while (senha != 2002) {
			System.out.println("Senha Invalida");
			senha = sc.nextInt();
		}
		
		System.out.println("Acesso Permitido");
		
		sc.close();
	}
}
