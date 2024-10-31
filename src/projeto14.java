/*Programa que lê um valor com duas casas decimais, equivalente ao salário de uma pessoa em umpaís fictício. Em seguida, calcula e mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo. 
---------------------------------------
|   RENDA    |    IMPOSTO DE RENDA    |
---------------------------------------
|    De 0.00 a R$2000.00     | Isento |
| De R$2000.01 até R$3000.00 |   8%   |
| De R$3000.01 até R$4500.00 |  18%   |
|    Acima de R$4500.00      |  28%   |
---------------------------------------

OBS.: Se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de
salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda.*/

import java.util.Locale;
import java.util.Scanner;

public class projeto14 {
    public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double salario = sc.nextDouble();
		
		double imposto;
		if (salario <= 2000.0) {
			imposto = 0.0;
		}
		else if (salario <= 3000.0) {
			imposto = (salario - 2000.0) * 0.08;
		}
		else if (salario <= 4500.0) {
			imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
		}
		else {
			imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}

		if (imposto == 0.0) {
			System.out.println("Isento");
		}
		else {
			System.out.printf("R$ %.2f%n", imposto);
		}
		
		sc.close();
	}
}
