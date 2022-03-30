package package1;

import java.util.Scanner;

public class Exe14 {

	public static void main(String[] args) {
		/* Fazer um algoritmo que leia dois números e imprime a divisão do maior pelo menor*/
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor 1: ");
		double a =  sc.nextDouble();
		System.out.println("Digite o valor 2: ");
		double b =  sc.nextDouble();
		
		if (a>b) {
			a = a/b;
			System.out.println("O resultado foi: " + a);
		}else {
			b = b/a;
			System.out.println("O resultado foi: " + b);
		}
	}

}
