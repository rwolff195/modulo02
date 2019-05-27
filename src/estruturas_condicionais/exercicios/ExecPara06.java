package estruturas_condicionais.exercicios;

import java.util.Scanner;

public class ExecPara06 {

	public static void main(String[] args) {
		/*
		Ler um número inteiro N e calcular todos os seus divisores 
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Entre com um Numero: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++){
			if (n % i == 0){
				System.out.println("Divisores: " + i);
			}
		}
		sc.close();
	}

}
