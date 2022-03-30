package package1;

import java.util.Scanner;

public class Exe04 {

	public static void main(String[] args) {
		/*Fazer um algoritmo que lê dois números inteiros e imprime os números consecutivos desses números. (Por 
exemplo: se o usuário digitar 2 e -9, a saída deverá ser 3 e -8, porque 3 é consecutivo de 2. –8 é consecutivo 
de –9)*/


		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o numero 1: ");
		int a = sc.nextInt();
		System.out.println("Digite o numero 1: ");
		int b = sc.nextInt();
		
		a = a + 1;
		b = b + 1;
		
		System.out.println("Os numeros consecutivos sao " + a + " and " + b);
	}

}
