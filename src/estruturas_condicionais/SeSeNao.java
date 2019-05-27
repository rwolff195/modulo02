package estruturas_condicionais;

import java.util.Scanner;

public class SeSeNao {

	public static void main(String[] args) {
		// Verificar se o numero é impar ou par
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an integer number:");//Digite um numero inteiro
		int n = sc.nextInt();
		
		if(n % 2 == 0) {
			System.out.println("Even!!!");// Even = par
		}
		else {
			System.out.println("Odd!!!");// odd = impar
		}
		// fim par/impar
		// estrutura composta
		
		System.out.println("what time is it????");
		int time = sc.nextInt();
		
		if (time < 12 ) {
			System.out.println("Good morning!!!");
		}
		else if(time < 18) {
			System.out.println("Good afternoon!!!");
		}
		else {
			System.out.println("Good evening!!!");
		}
		
		sc.close();
		
	}

}
