package devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

import devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

public class SmartPhoneListTest01 {

	public static void main(String[] args) {
		
		
		Smartphone s1 = new Smartphone("1ABC1", "iPhone");
		Smartphone s2 = new Smartphone("22222", "Pixel");
		Smartphone s3 = new Smartphone("33333", "Samsung");
		
		List<Smartphone> smarphones = new ArrayList<>(6);
		smarphones.add(s1);
		smarphones.add(s2);
		smarphones.add(s3);
		
		for (Smartphone smartphone : smarphones) {
			System.out.println(smartphone);
		}
		
		Smartphone s4 = new Smartphone("22222", "Pixel");
		System.out.println(smarphones.contains(s4));
		int  indexSmart4 = smarphones.indexOf(s4);
		System.out.println(indexSmart4);
		System.out.println(smarphones.get(indexSmart4));
	}

}
