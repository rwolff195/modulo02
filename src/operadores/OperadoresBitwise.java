package operadores;

import java.util.Scanner;

public class OperadoresBitwise {

	public static void main(String[] args) {
		
		int n1 = 89;
		int n2 = 60;
		
		System.out.println(n1 & n2);
		System.out.println(n1 | n2);
		System.out.println(n1 ^ n2);
		
		Scanner sc = new Scanner(System.in);
		
		int mask = 0b00100000; // 32 bin�rio - pode se colocar o numero
		System.out.printf("Entre com um numero: ");
		int n = sc.nextInt();
		
		if ((n & mask) != 0) {
			System.out.println("6th bit is true!");
		}
		else {
			System.out.println("6th bit is false!");
		}
		
		sc.close();

	}

}
