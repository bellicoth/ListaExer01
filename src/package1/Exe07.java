package package1;

import java.util.Scanner;

public class Exe07 {

	public static void main(String[] args) {
		/*  Fazer um algoritmo que leia os dois lados A e B de um triângulo retângulo e calcula a hipotenusa do triângulo. 
Para esse caso, considere que ℎ𝑖𝑝𝑜𝑡𝑒𝑛𝑢𝑠𝑎 = √𝐴
2 + 𝐵
2
. Dica: nesse programa, você deve usar a 
função matemática Math.sqrt(). Por exemplo, a raiz de 121 ficaria Math.sqrt(121).
*/
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o número 1: ");
		double a =  sc.nextDouble();
		System.out.println("Digite o número 2: ");
		double b =  sc.nextDouble();
		
		double res = (a*a) + (b*b);
		System.out.println("Hipotenus é: " + Math.sqrt(res));
	}

}
