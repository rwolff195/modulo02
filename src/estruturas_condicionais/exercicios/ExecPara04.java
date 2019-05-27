package estruturas_condicionais.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExecPara04 {

	public static void main(String[] args) {
		/*
		Fazer um programa para ler um n�mero N. Depois leia N pares de n�meros e mostre a divis�o do primeiro pelo
		segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
		*/
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Entre com o numero de testes: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++){
			System.out.println("----------------");
			System.out.print("Entre com o N1: ");
			int n1 = sc.nextInt();
			System.out.print("Entre com o N2: ");
			int n2 = sc.nextInt();
			
			if (n2 != 0){
				double div = (double) n1 / n2;
				System.out.println("Divis�o: " + div);
			}
			else{
				System.out.println("Divis�o imposs�vel");
			}
			
			sc.close();
			
		}//fim for
		
	}// fim main

}
