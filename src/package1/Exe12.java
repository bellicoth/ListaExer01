package package1;

import java.util.Scanner;

public class Exe12 {

	public static void main(String[] args) {
		/*  Fazer um algoritmo que leia dois números L e R. O programa deve verificar a maior área entre um quadrado 
de lado L e um círculo de raio R. Imprimir na tela qual o maior: "Quadrado" ou "Círculo". */
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor do quadrado: ");
		double a =  sc.nextDouble();
		System.out.println("Digite o valor do circulo: ");
		double b =  sc.nextDouble();
		
		double resQua, resCir;
		resQua = a * a;
		resCir = (b * b) * Math.PI;
		
		if (resQua > resCir) {
			System.out.println("Quadrado maior");
		}else if(resQua < resCir){
			System.out.println("Circulo maior");
		}else{
			System.out.println("São iguais");
		}
	}

}
