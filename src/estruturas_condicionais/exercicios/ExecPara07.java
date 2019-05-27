package estruturas_condicionais.exercicios;

import java.util.Scanner;

public class ExecPara07 {

	public static void main(String[] args) {
		/*
		Fazer um programa para ler um n�mero inteiro positivo N. O programa deve ent�o mostrar na tela N linhas,
		come�ando de 1 at� N. Para cada linha, mostrar o n�mero da linha, depois o quadrado e o cubo do valor, conforme
		exemplo. 
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um numero: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++){
			int n1 = i;
			int n2 = i * i;
			int n3 = i * i * i;
			
			System.out.printf("Valor: %d - Dobro: %d - Cubo: %d%n", n1, n2, n3);
		}
		sc.close();
	}

}
