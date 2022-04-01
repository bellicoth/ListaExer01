package package1;

import java.util.Scanner;

public class Exe10 {

	public static void main(String[] args) {
		/*10. Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele 
		no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, 
		calcular e imprimir o total a receber no final do mês.*/

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String nome =  sc.next();
		System.out.println("Digite seu salario fixo: ");
		double salarioFixo =  sc.nextDouble();
		System.out.println("Digite o total de vendas efetuadas: ");
		double total =  sc.nextDouble();
		
		double add = salarioFixo + (0.15 * total);
		System.out.println(nome + "Seu salario final é " +  add);
	}

}
