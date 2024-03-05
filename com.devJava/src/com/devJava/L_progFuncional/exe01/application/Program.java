package com.devJava.L_progFuncional.exe01.application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.devJava.L_progFuncional.exe01.entities.Product;

public class Program {

	public static void main(String[] args) {
	
		 List<Product> list =new ArrayList<>();
			
		 list.add(new Product("Tv",900.00));
		 list.add(new Product("Notebook",1200.00));
		 list.add(new Product("Tablet",450.00));
		 
		
		 // 3 -> com Lambda
		 Comparator<Product> comp = (p1, p2) -> p1.getName().toUpperCase()
				 .compareTo(p2.getName().toUpperCase());
		 list.sort(comp);
		 
		 
		 
		 /// 2-> comparator tipo classe anonima
//		 Comparator<Product> comp = new Comparator<Product>() {
//			@Override
//			public int compare(Product p1, Product p2) {
//				return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
//			}
//		};
//		  list.sort(comp);
		
		 // 1-> exemplo usando uma classe externa 
		// list.sort(new MyComparator());
		 
		 for (Product p: list) {
			System.out.println(p);
		}
		
	}

}
