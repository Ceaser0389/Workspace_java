package fundamentos;

import java.util.Scanner;

public class Wrappers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Wrappers
		//              int                                char
		//Byte  Short  Integer Long  Float Double Boolean Character
		
		
		Byte b = 100;
		Short s = 1000;
		Integer i = 10000; // int
		Long l = 100000l;

		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(l *3);
		System.out.println(l/3);
		
		Float f = 1242f;
		System.out.println(f);
		
		Double d = 123.4586d;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Character  c = '#';
		System.out.println(c + "......");
		
		
		
		sc.close();
	}

}
