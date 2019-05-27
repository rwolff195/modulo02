package conversao_implicita_casting;

public class ConversaoCasting {

	public static void main(String[] args) {
		// ﻿Casting: conversão explícita entre tipos COMPATÍVEIS
		
		double a;
		float b;
		a = 5.0;
		b = (float) a;
		System.out.println(b);
		
		double c;
		int d;
		
		c = 5.5;
		d = (int) c;
		System.out.println(d);
		
		int e, f;
		e = 5;
		f = 2;
		double result; 
		result = (double) e / f;
		
		System.out.println(result);
		
		
		int g;
		//e = 5;
		//f = 2;
		double result1;
		String i = "33";
		
		g = Integer.parseInt(i);
		
		result1 = Double.parseDouble(i);
		
		System.out.println(g);
		System.out.println(result1);
		
	}

}
