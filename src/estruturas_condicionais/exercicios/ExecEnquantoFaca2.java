package estruturas_condicionais.exercicios;

import java.util.Scanner;

public class ExecEnquantoFaca2 {

	public static void main(String[] args) {
		
		/*
		﻿Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
	um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
	4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
	que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
	mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
	exemplo. 
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o combustível de sua preferência");
		System.out.println("1 = Álcool");
		System.out.println("2 = Gasolina");
		System.out.println("3 = Diesel");
		System.out.println("4 = SAIR");
		
		System.out.print("Opção: ");
		int opcao = sc.nextInt();
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		while (opcao != 4) {
			
			switch (opcao) {
			case 1:
				alcool ++;
				break;
			case 2:
				gasolina ++;
				break;
			case 3 :
				diesel ++;
				break;
			default :
				System.out.println("Codigo Invalido!!!");
			}//fim caso
			
			System.out.print("Opção: ");
			opcao = sc.nextInt();
			
		}// fim while
		
		System.out.println("MUITO OBRIGADO!!!");
		System.out.println("Álcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		
		sc.close();

	}//fim main

}
