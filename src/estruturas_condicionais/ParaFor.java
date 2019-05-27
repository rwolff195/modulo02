package estruturas_condicionais;

import java.util.Scanner;

public class ParaFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros vc vai digitar:");
		int n = sc.nextInt();
		
		int soma = 0;
		
		for (int i = 1; i <= n; i++) {
			System.out.print("valor #" + i + " : ");
			int x = sc.nextInt();
			soma += x;
		}//fim for
		
		System.out.println("Soma = " + soma);
		
		sc.close();

	}

}
