package estruturas_condicionais.exercicios;

import java.util.Scanner;

public class ExecEnquantoPara {

	public static void main(String[] args) {
		/*
		Fazer um programa para ler um numero N(se for digitado um valor não positivo, mostrar uma mensagem e ler novamente).
		Em seguida, N valores inteiros. Mostra o maior detre os N numeros digitados. 
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com um numero +: ");
		int n = sc.nextInt();
		int maior = Integer.MIN_VALUE;
		
		while (n <= 0) {
			System.out.print("Entre com um numero +: ");
			n = sc.nextInt();
		}//fim while
		
		for (int i = 1; i <= n; i++) {
			System.out.print("Valor N" + i + " : ");
			int x = sc.nextInt();
			if (x > maior) {
				maior = x;
			}
			
		}// fim for
		
		System.out.println("Valor Maior: " + maior);
		
		sc.close();
	}

}
