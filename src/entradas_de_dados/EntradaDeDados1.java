package entradas_de_dados;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite um numero: ");
		int n1 = sc.nextInt();
		System.out.printf("Digite um Texto: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.printf("Sexo: ");
		char gender = sc.next().charAt(0);
		//charAt função para pegar a primeira letra
		System.out.printf("Código: ");
		String s = sc.next();
		char letter = s.charAt(0);
		int digit = Integer.parseInt(s.substring(1)); 
		// substring - recorta uma string a partir de uma posição
		//Integer.parseInt - Transforma uma string em inteiro
		
		// double 4.32
		System.out.printf("Digite um numero double: ");
		double n2 = sc.nextDouble();
		
		// Rafael M 42 1.98
		System.out.printf("Digite seus dados: ");
		String name2 = sc.next();
		char ch = sc.next().charAt(0);
		int age = sc.nextInt();
		double height = sc.nextDouble();
		
		
		System.out.println("Numero Digitado: "+n1);
		System.out.println("Texto digitado: "+name);
		System.out.println("Sexo: "+gender);
		System.out.println("Caracter: "+letter);
		System.out.println("Digito: "+digit);
		System.out.println("Double: "+n2);
		System.out.println("Nome: "+name2);
		System.out.println("Sexo: "+ch);
		System.out.println("Idade: "+age);
		System.out.println("Altura: "+height);
		
		
		sc.close();

	}

}
