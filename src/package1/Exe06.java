package package1;

import java.util.Scanner;

public class Exe06 {

	public static void main(String[] args) {
		/* Escreva um algoritmo que leia três números decimais: A, B e C. Em seguida, calcule e mostre: 
a) a área do triângulo retângulo que tem A por base e C por altura. 
b) a área do círculo de raio C. (π = 3.14159) 
c) a área do trapézio que tem A e B por bases e C por altura. 
d) a área do quadrado que tem lado B. 
e) a área do retângulo que tem lados A e B.
f) o perímetro do retângulo que tem lados A e B.*/

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o número 1: ");
		double a = sc.nextDouble();
		System.out.println("Digite o número 2: ");
		double b = sc.nextDouble();
		System.out.println("Digite o número 3 ");
		double c = sc.nextDouble();
		System.out.print("Escolha: "
				+ "\nA) Triangulo area"
				+ "\nB) Circulo area"
				+ "\nC) Trapezio area"
				+ "\nD) Quadrado area"
				+ "\nE) Retangulo area"
				+ "\nF) Retangulo perimetro"
				+ "\nSua escolha: ");
		String escolha = sc.next().toUpperCase();
		
		switch (escolha) {
		case "A":
			//Triangle
			double triangulo = (a * c) / 2;
			System.out.println("Triangulo area: " + triangulo);
			break;
		case "B":
			double circulo = (c * c) * Math.PI;
			System.out.println("Circulo area: " + circulo);
			break;
		case "C":
			double trapezio = ((a + b) * c)/2;
			System.out.println("Trapezio area: " + trapezio);
			break;
		case"D":
			double quadrado = b * b;
			System.out.println("Quadrado area: " + quadrado);
			break;
		case "E":
			double retangulo = a * b;
			System.out.println("Retangulo area:" + retangulo);
			break;
		case "F":
			double retanguloPeri = (a + a) + (b + b);
			System.out.println("Retangulo perimetro: " + retanguloPeri);
			break;
		default:
			System.out.println("Entrada invalida!");
			break;
		}
			
		}
	}

