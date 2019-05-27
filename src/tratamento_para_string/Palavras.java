package tratamento_para_string;

public class Palavras {

	public static void main(String[] args) {
		
		String original = "abcde FGHIJ ABC abc DEFG    ";
		
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();// tira os espaços no inicio e fim
		String s04 = original.substring(2);
		String s05 = original.substring(2, 9);
		String s06 = original.replace('a', 'x');
		String s07 = original.replace("abc", "xy");
		int i = original.indexOf("bc");// posição deste trecho no string
		int j = original.lastIndexOf("bc"); // posição deste trecho no final string
		
		System.out.println("Original: -"+original+"-");
		System.out.println("ToLowerCase: -"+s01+"-");
		System.out.println("ToUpperCase: -"+s02+"-");
		System.out.println("Trim: -"+s03+"-");
		System.out.println("substring(2): -"+s04+"-");
		System.out.println("substring(2, 9): -"+s05+"-");
		System.out.println("replace('a', 'x'): -"+s06+"-");
		System.out.println("replace(\"abc\", \"xy\"): -"+s07+"-");
		System.out.println("indexOf(\"bc\"): -"+i+"-");
		System.out.println("lastIndexOf(\"bc\"): -"+j+"-");
		
		// Operação split
		
		String s = "potato apple lemon orange";
		
		String[] vect = s.split(" ");
		
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		System.out.println(vect[3]);
		
	}

}
