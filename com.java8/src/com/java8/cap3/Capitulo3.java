package com.java8.cap3;

public class Capitulo3 {

    public static void main(String[] args) {
	
	 new Thread(() -> {
		for (int i = 0; i <= 1000; i++) {
		    System.out.println(i);    
	}
	}).start();
	
	
	
	
	
	
    }

}
