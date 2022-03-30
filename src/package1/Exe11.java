package package1;

import java.util.Scanner;

public class Exe11 {

	public static void main(String[] args) {
		/* 11. Fazer um algoritmo que lê um número e verifica se ele é negativo. Se for negativo, imprimir na tela a 
mensagem "Numero negativo".*/
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor: ");
		double valor = sc.nextDouble();
		
		if (valor < 0) {
			System.out.println("Numero negativo");
		}else{
			System.out.println("Numero positivo");
		}

	}

}
