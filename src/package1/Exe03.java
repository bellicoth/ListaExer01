package package1;

import java.util.Scanner;

public class Exe03 {

	public static void main(String[] args) {
		/* Fazer um algoritmo que lê dois números e imprime a soma dos quadrados dos dois números. O quadrado 
de um número A é representado por A2 = A * A. */


		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o numero 1:  ");
		double a = sc.nextDouble();
		System.out.println("Digite o numero 2:  ");
		double b = sc.nextDouble();
		
		double c = (a*a) + (b*b);
		
		System.out.println("Resultado: " + c);
	}

}
