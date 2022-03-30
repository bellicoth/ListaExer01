package package1;

import java.util.Scanner;

public class Exe13 {

	public static void main(String[] args) {
		/* Fazer um algoritmo que leia três números e imprime o maior deles.*/
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor 1: ");
		double a =  sc.nextDouble();
		System.out.println("Digite o valor 2: ");
		double b =  sc.nextDouble();
		System.out.println("Digite o valor 3: ");
		double c =  sc.nextDouble();
		
		if (a>b && a>c) {
			System.out.println("O maior é: " + a);
		}else if (b>c && b>a) {
			System.out.println("O maior é: " + b);
		}else if (c>a && c>b) {
			System.out.println("O maior é: " + c);
		}else {
			System.out.println("Os valores sao iguais");
		}
	
	}

}
