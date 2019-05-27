package estruturas_condicionais.exercicios;

import java.util.Scanner;

public class ExecFacaEnquanrto {

	public static void main(String[] args) {
		/*
		﻿Leia números inteiros até que um 0 (zero) seja lido. Para cada valor lido, o programa deve mostrar o quadrado do valor.
		*/
		
		Scanner sc = new Scanner(System.in);

		int n;
		
		do {
		
			System.out.print("Entre com um numero inteiro: ");
			n = sc.nextInt();
			
			if (n != 0) {
				int quadrado = n;
				quadrado *= n;
				System.out.println("Quadrado: " + quadrado);
			}
			
		} while (n != 0);
		
		System.out.println("FIM !!!");
		
		sc.close();
	}
}
