package com.devJava.k_generics.exe01.services;

import java.util.ArrayList;
import java.util.List;
                                 /// tipo generico sintaxe <T>
public class PrintService <T> {

	List<T> list = new ArrayList<>();
	
	
	public void addValue(T value) {
		list.add(value);
	}
	
	
	public T First() {
		if(list.isEmpty()){
			throw new IllegalStateException("List is null");
		}
		return list.get(0);
	}
	
	public  void print() {
		System.out.println("[");
		if(!list.isEmpty()) {
			System.out.println(list.get(0));
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.println(", " + list.get(i));
			
		}
		System.out.println("]");
	}
	
	
	
}
