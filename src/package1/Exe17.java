package package1;

import java.util.Scanner;

public class Exe17 {

	public static void main(String[] args) {
		/* Leia 4 valores inteiros A, B, C e D. A seguir, se B for maior do que C e se D for maior do que A, e a soma de C 
com D for maior que a soma de A e B e se C e D, ambos, forem positivos e se a variável A for par escrever a 
mensagem "Valores aceitos", senão escrever "Valores não aceitos".
*/
		Scanner sc = new Scanner(System.in);
		
		double a,b,c,d;
		System.out.println("Digite o valor 1: ");		
		a = sc.nextDouble();
		System.out.println("Digite o valor 2: ");
		b = sc.nextDouble();
		System.out.println("Digite o valor 3: ");
		c = sc.nextDouble();
		System.out.println("Digite o valor 4: ");
		d = sc.nextDouble();
		
		if (b>c && d>a) {
			double res1, res2;
			res1 = c + d;
			res2 = a + b;
			if (res1>res2) {
				if (c>0 && d>0) {
					if (a%2 == 0) {
						System.out.println("Valores aceitos");
					}else{
						System.out.println("Valores nao aceitos");  
					}
				}else {
					System.out.println("Valores nao aceitos");
				}
			}else {
				System.out.println("Valores nao aceitos");
			}
		}else {
			System.out.println("Valores nao aceitos");
		}
	}

}
