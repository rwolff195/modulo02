package estruturas_condicionais.exercicios;

import java.util.Scanner;

public class ExecPara02 {

	public static void main(String[] args) {
		/*
		﻿Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
		Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
		essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o numero de de tentativas: ");
		int n = sc.nextInt();
		int dentro = 0;
		int fora = 0;
		for (int i = 1; i <= n; i++) {
			System.out.print("Entre com um numero: ");
			int x = sc.nextInt();			
			if (x >= 10 && x <= 20) {
				dentro++;
			}
			else {
				fora++;
			}//fim if
		}//fim for
		
		System.out.println("Numeros dentro do intervalo: " + dentro);
		System.out.println("Numeros fora do intervalo: " + fora);
		
		sc.close();
		
	}

}
