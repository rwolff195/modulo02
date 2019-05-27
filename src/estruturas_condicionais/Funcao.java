package estruturas_condicionais;

import java.util.Scanner;

public class Funcao {

	public static void main(String[] args) {
		
		//fun��o ou metodo
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com tr�s numeros:");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int maior = max(a, b, c);
		
		showResult(maior);
		
		sc.close();
		}
	
		public static int max(int x, int y, int z) {
			int aux;
			if (x > y && x > z) {
				aux = x;
			} else  if (y > z) {
				aux = y;
			} else  {
				aux = z;
			}
			return  aux;
		}
		
		public static void showResult(int valor) {
			System.out.println("Maior numero = " + valor);
		}

}
