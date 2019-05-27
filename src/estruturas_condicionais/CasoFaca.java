package estruturas_condicionais;

import java.util.Scanner;

public class CasoFaca {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Entre com o numero: ");
		int x = sc.nextInt();		
		String dias;
		
		switch (x) {
		case 1:
			dias = "Sunday";
		break;
		case 2:
			dias = "Monday";
		break;
		case 3:
			dias = "Tuesday";
		break;
		case 4:
			dias = "Wednesday";
		break;
		case 5:
			dias = "Thursday";
		break;
		case 6:
			dias = "Friday";
		break;
		case 7:
			dias = "Saturday";
		break;
		default:
			dias = "Invalid value";
		}
		
		System.out.println("Dias: " + dias);
		
		sc.close();
	}

}
