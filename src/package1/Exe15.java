package package1;

import java.util.*;

public class Exe15 {

    public static void main(String[] args) {
    /* 15. Leia 3 números decimais A, B e C e efetue o cálculo das raízes da equação de Bhaskara.
−𝐵 ± √𝐵2 − 4 ∗ 𝐴 ∗ 𝐶
2 ∗ 𝐴
Se não for possível calcular as raízes, ou seja, caso haja uma divisão por 0 ou raiz de número negativo, mostre 
a mensagem correspondente “Impossível calcular”. */

        Scanner grava = new Scanner(System.in);
        double a, b, c, delta, x1, x2;

        System.out.println("Digite o valor de A: ");
        a = grava.nextDouble();
        System.out.println("Digite o valor de B: ");
        b = grava.nextDouble();
        System.out.println("Digite o valor de C: ");
        c = grava.nextDouble();

        delta = ((b*b) - (4 * a * c));
        System.out.println("O valor de delta é " + delta);

        if(delta < 0){
            System.out.println("A equação não possui raiz real");
        } else if(delta >= 0){
            x1 = (-(b) + Math.sqrt(delta)) / (2*a);
            x2 = (-(b) - Math.sqrt(delta)) / (2*a);

            System.out.println("O valor de x1 é " + x1);
            System.out.println("O valor de x2 é " + x2);
        }



    }
}
