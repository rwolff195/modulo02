package estruturas_condicionais.exercicios;

import java.util.Scanner;

public class ExecPara05 {

	public static void main(String[] args) {
		/*
		Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
		Lembrando que, por defini��o, fatorial de 0 � 1.
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Entre com um numero: ");
		int n = sc.nextInt();
		
		int fat = 1;
		
		for (int i = 1; i <= n; i++){
			fat = fat * i;
		}
		
		System.out.println("Fatorial = " + fat);
		
		sc.close();
	}

}
