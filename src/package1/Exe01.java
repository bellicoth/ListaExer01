package package1;

import java.util.Scanner;

public class Exe01 {

	public static void main(String[] args) {
		/* 1. Fazer um algoritmo que leia dois números e imprima na tela o produto (multiplicação) dos dois números. */

		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.print("Digite o numero 1:  ");
		a = sc.nextInt();
		System.out.print("Digite o numero 2: : ");
		b = sc.nextInt();
		
		a = a * b;
		
		System.out.println("O produto é: " + a);
	}

}
