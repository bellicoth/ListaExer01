package package1;

import java.util.Scanner;

public class Exe08 {

	public static void main(String[] args) {
		/* Fazer um algoritmo que leia quatro números
		 e imprime a média aritmética dos quatro números.*/

		Scanner sc = new Scanner(System.in);
		double val1, val2, val3, val4;
	
		System.out.println("Digite o número 1: ");		
		val1 = sc.nextDouble();
		System.out.println("Digite o número 2: ");
		val2 = sc.nextDouble();
		System.out.println("Digite o número 3: ");
		val3 = sc.nextDouble();
		System.out.println("Digite o número 4: ");
		val4 = sc.nextDouble();
		
		double res = (val1 + val2 + val3 + val4) / 4;
		System.out.println("A media é " + res);
				
	}

}
	