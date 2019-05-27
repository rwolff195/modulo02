package operadores;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		
		int n1 = 3 + 4 * 2;
		int n2 = (3 + 4) * 2;
		int n3 = 17 % 3;
		double n4 = 10.0 / 8; //tem que colocar um .0 para entender que é um divisão que vai dar um numero quebrado 
		double n5 = (double) 10 / 8; // mesma coisa do de cima
		
		//Variaveis Formula de baskara
		
		double a= 1.0, b = -3.0, c = -4.0;
		
		double x1 = (-b + Math.sqrt(b*b - 4.0 * a * c)) / (2.0 * a);
		
		
		
		System.out.println("N1 = "+n1);
		System.out.println("N2 = "+n2);
		System.out.println("N3 = "+n3);
		System.out.println("N4 = "+n4);
		System.out.println("N5 = "+n5);
		
		System.out.println("Resultado Baskara = "+x1);
	}

}
