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
		double a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o número 1: ");
		a = sc.nextDouble();
		System.out.println("Digite o número 2: ");
		b = sc.nextDouble();
		System.out.println("Digite o número 3 ");
		c = sc.nextDouble();
		
		//A) a área do triângulo retângulo que tem A por base e C por altura. 
		double triangulo = (a * c) / 2;
		System.out.println("Triangulo area: " + triangulo);

		//B) a área do círculo de raio C. (π = 3.14159) 
		double circulo = (c * c) * 3.14159;
		System.out.println("Circulo area: " + circulo);
		
		//C) a área do trapézio que tem A e B por bases e C por altura. 
		double trapezio = ((a + b) * c)/2;
		System.out.println("Trapezio area: " + trapezio);
		
		//D) a área do quadrado que tem lado B.
		double quadrado = b * b;
		System.out.println("Quadrado area: " + quadrado);
		
		//E) a área do retângulo que tem lados A e B.
		double retangulo = a * b;
		System.out.println("Retangulo area:" + retangulo);
		
		//F) o perímetro do retângulo que tem lados A e B.
		double retanguloPeri = (a + a) + (b + b);
		System.out.println("Retangulo perimetro: " + retanguloPeri);
			
		
			
		}
			
		}
	

