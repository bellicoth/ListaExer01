package package1;

import java.util.Scanner;

public class Exe08 {

	public static void main(String[] args) {
		/* Fazer um algoritmo que leia quatro números
		 e imprime a média aritmética dos quatro números.*/

		Scanner sc = new Scanner(System.in);
		double[] num;
		num = new double[4];
		System.out.println("Digite o número 1: ");		
		num[0] = sc.nextDouble();
		System.out.println("Digite o número 2: ");
		num[1] = sc.nextDouble();
		System.out.println("Digite o número 3: ");
		num[2] = sc.nextDouble();
		System.out.println("Digite o número 4: ");
		num[3] = sc.nextDouble();
		
		double res = (num[0] + num[1] + num[2] + num[3]) / num.length;
		System.out.println("A media é " + res);
				
	}

}
	