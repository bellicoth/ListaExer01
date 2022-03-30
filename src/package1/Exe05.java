package package1;

import java.util.Scanner;

public class Exe05 {

	public static void main(String[] args) {
		/* Fazer um algoritmo que leia um valor L e calcula a área de um quadrado de lado L. */
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		double a = sc.nextDouble();
		
		a = a * a;
		System.out.println("Area do quadrado: " + a);
	}

}
