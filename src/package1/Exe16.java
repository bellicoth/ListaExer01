package package1;

import java.util.*;

public class Exe16 {

	public static void main(String[] args) {
		/* 16. Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode 
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas. Veja 
abaixo alguns exemplos. Não fixe esses valores no código. Você pode usá-los para TESTAR seu algoritmo: */

	double horaInicial, horaFinal, duracao;
	Scanner grava = new Scanner(System.in);

	System.out.println("Digite que horas o jogo começa: ");
	horaInicial = grava.nextDouble();
	System.out.println("Digite que horas o jogo terminou: ");
	horaFinal = grava.nextDouble();

	duracao = 24 - (24 + horaInicial - horaFinal) % 24;

	if(horaInicial == horaFinal){

		System.out.println("O jogou durou 24horas");
	} else{

		System.out.println("O jogo durou: " + duracao);
	}

}}
