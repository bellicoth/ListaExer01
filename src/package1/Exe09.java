package package1;

import java.util.Scanner;

public class Exe09 {

	public static void main(String[] args) {
		/* Escreva um programa que leia o número de cadastro de um funcionário, seu número de horas trabalhadas, 
o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre na tela o número e o 
salário do funcionário.*/

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu numero de cadastro: ");
		int a =  sc.nextInt();
		System.out.println("Digite quantas horas trabalhadas no mes: ");
		double b =  sc.nextDouble();
		System.out.println("Valor por hora: ");
		double c =  sc.nextDouble();
		
		double res = b * c;
		System.out.println("Seu cadastro é:" + a +
				"\nSeu salario é R$" + res);
	}

}
