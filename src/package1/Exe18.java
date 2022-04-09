package package1;

import java.util.*;

public class Exe18 {

    public static void main(String[] args){
    /*18. Leia 3 números decimais A, B e C e ordene-os em ordem decrescente, de modo que o lado A representa o 
maior dos 3 lados. A seguir, determine o tipo de triângulo que estes três lados formam, com base nos 
seguintes casos, sempre escrevendo uma mensagem adequada:
● se A ≥ B+C, apresente a mensagem: NAO FORMA TRIÂNGULO
● se A2 = B2 + C2
, apresente a mensagem: TRIÂNGULO RETÂNGULO
● se A2 > B2 + C2
, apresente a mensagem: TRIÂNGULO OBTUSÂNGULO
● se A2 < B2 + C2
, apresente a mensagem: TRIÂNGULO ACUTÂNGULO
● se os três lados forem iguais, apresente a mensagem: TRIÂNGULO EQUILÁTERO
● se apenas dois dos lados forem iguais, apresente a mensagem: TRIÂNGULO ISÓSCELES
Veja abaixo alguns exemplos. Não fixe esses valores no código. Você pode usá-los para TESTAR seu algoritmo:*/

        double a, b, c, aux;
        Scanner grava = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        a = grava.nextDouble();
        System.out.println("Digite o valor de B: ");
        b = grava.nextDouble();
        System.out.println("Digite o valor de C: ");
        c = grava.nextDouble();


        if(b > a){
            aux = a;
            a = b;
            b = aux;
        }
        if(c > a){
            aux = a;
            a = c;
            c = aux;
        }
        if(c > b){
            aux = b;
            b = c;
            c = aux;
        }

        System.out.println(" " + a + " " + b + " " + c);


if(a>= b+c){
   System.out.println("NAO FORMA TRIANGULO");

}else if((a*a) == (b*b)+(c*c)){
    System.out.println("TRIANGULO RETANGULO");

}else if((a*a)>(b*b)+(c*c)){
    System.out.println("TRIANGULO OBTUSANGULO");

}else if((a*a)<(b*b)+(c*c)){
    System.out.println("TRIANGULO ACUTANGULO"); 

}

if(a >= b+c){

}else if( a == b && a == c){
    System.out.println("TRIANGULO EQUILATERO");

}else if(a == b || b == c || c == a){
    System.out.println("TRIANGULO ISOSCELES");
}else{
    System.out.println("");
}
    
    } 
}
