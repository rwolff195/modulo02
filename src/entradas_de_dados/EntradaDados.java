package entradas_de_dados;

import java.util.Scanner;

public class EntradaDados {

	public static void main(String[] args) {
		// Ctrl + Shift + o - insere o imput da classe scanner
		Scanner sc = new Scanner(System.in);
		
		String sentence = sc.nextLine();
		String x,y,z;
		
		x = sc.next();
		y = sc.next();
		z = sc.next();
	
		System.out.println(sentence);
		System.out.println("---------------------");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println("---------------------");
		// ler as entradas em um linha separadas por espaço
		x = sc.next();
		y = sc.next();
		z = sc.next();
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		sc.close();
	}

}
