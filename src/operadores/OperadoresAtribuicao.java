package operadores;

public class OperadoresAtribuicao {

	public static void main(String[] args) {
		
		double n1 =10;
		double n2 = 30;
		String s = "ABC";
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(s);
		System.out.println("----------------------------");
		
		n1 *= 2; // vale 20
		n2 += n1; // vai valer 50
		s += "DEF";
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(s);
		System.out.println("----------------------------");
		int a =10;
		a++;
		System.out.println(a);
		System.out.println("----------------------------");
		int b = 10;
		int c = b++;
		System.out.println(b);
		System.out.println(c);
		System.out.println("----------------------------");
		int d = 10;
		int e = ++d;
		System.out.println(d);
		System.out.println(e);
		
	}

}
