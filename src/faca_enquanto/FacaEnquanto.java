package faca_enquanto;

import java.util.Locale;
import java.util.Scanner;

public class FacaEnquanto {

	public static void main(String[] args) {
		/*
		﻿Digitar um número e mostrar sua raiz quadrada, depois perguntar ao
		usuário se ele deseja repetir o procedimento (y/n). Caso ele responda
		'y', repetir o procedimento. 
		*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char resp;
		do {
			System.out.println("------------------");
			System.out.print("Digite um numero: ");
			double n = sc.nextDouble();
			double sq = Math.sqrt(n);
			System.out.printf("Raiz Quadrada: %.3f%n", sq);
			System.out.println("------------------");
			System.out.print("Repetir (s / n): ");
			resp = sc.next().charAt(0);
		} while (resp != 'n'); // fim do while
		
		sc.close();
		
	}// fim main

}
