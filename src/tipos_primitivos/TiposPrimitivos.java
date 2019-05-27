package tipos_primitivos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		// Tipos primitivos em Java (tipo valor)
		
		boolean completed = false;
		char gender = 'f';
		char letter ='\u0041';// código unicode
		byte n1 = 126;
		int n2 = 1000;
		int n3 = 2147483647; // último valor válido para o tipo int
		long n4 = 2147483648L; // Para o compilador entender que o tipo é long, tem que colocar o sufixo L
		float n5 = 4.5f;
		double n6 = 4.5;
		
		System.out.println(completed);
		System.out.println(gender);
		System.out.println(letter);
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
		System.out.println(n5);
		System.out.println(n6);
		
		//String e Object
		
		String name = "Maria Green";
		Object obj1 = "Alex Brown";
		Object obj2 = 4.5f;
		
		System.out.println(name);
		System.out.println(obj1);
		System.out.println(obj2);
		
	}

}
