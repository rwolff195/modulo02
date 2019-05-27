package estruturas_condicionais.exercicios;

import java.util.Scanner;

public class ExecEnquantoFaca1 {

	public static void main(String[] args) {
		/*
		﻿Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
		cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
		menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma). 
		*/
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com o Valor de X: ");
		int x = sc.nextInt();
		System.out.print("Entre com o Valor de Y: ");
		int y = sc.nextInt();
		
		while (x != 0 && y != 0) {
			
			if (x > 0 && y > 0) {
				System.out.println("Primeiro Quadrante");
			}
			else if (x < 0 && y > 0) {
				System.out.println("Segundo Quadrante");
			}
			else if (x < 0 && y < 0) {
				System.out.println("Terceiro Quadrante");
			}
			else {
				System.out.println("Quarto Quadrante");
			}//fim if
			
			System.out.print("Entre com o Valor de X: ");
			x = sc.nextInt();
			System.out.print("Entre com o Valor de Y: ");
			y = sc.nextInt();
			
		}//fim while
		
		System.out.print("FIM !!!");
		sc.close();
	}

}
