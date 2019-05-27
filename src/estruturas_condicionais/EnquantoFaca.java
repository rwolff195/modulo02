package estruturas_condicionais;

import java.util.Scanner;

public class EnquantoFaca {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite sua senha: ");
		int senha =sc.nextInt();
		
		while (senha != 2002) {
			System.out.println("Senha Invalida!!!");
			System.out.println("********************");
			System.out.print("Digite sua senha novamente: ");
			senha = sc.nextInt();
		}
		
		System.out.println("********************");
		System.out.print("Acesso Permitido!!!");

		sc.close();
	}

}
