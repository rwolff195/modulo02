package estruturas_condicionais.exercicios;

import java.util.Scanner;

public class ExecPara01 {

	public static void main(String[] args) {
		// ﻿Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o X, se for o caso.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com um numero: ");
		int n = sc.nextInt();
		int cont = 0;
		for (int i = 1; i <= n; i++){
			if (i % 2 != 0) {
				cont++;
				System.out.println("N #" + cont + " : " + i);
			}// fim if
		}// fim for
		
		sc.close();
		
	}// fim main

}
