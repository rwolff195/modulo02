package entradas_de_dados;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioEntDados {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Nome Completo: ");
		String name = sc.nextLine();
		System.out.printf("Quantos quartos tem sua casa? ");
		int quartos = sc.nextInt();
		System.out.printf("Digite o preço do produto: ");
		double prod = sc.nextDouble();
		System.out.printf("Digite seu sobrenome, idade e altura (mesma linha): ");
		String sobrenome = sc.next();
		int age = sc.nextInt();
		double alt = sc.nextDouble();
		
		
		
		System.out.println("Nome completo: "+name);
		System.out.println("Numero de quartos: "+quartos);
		System.out.printf("Valor produto: %.2f%n",prod);
		System.out.println("Sobrenome: "+sobrenome);
		System.out.println("Idade: "+age);
		System.out.printf("Altura: %.2f%n",alt);
		
		
		sc.close();

	}

}
