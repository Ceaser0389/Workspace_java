package com.java8.cap3;

public class Program02 {

    public static void main(String[] args) {
	
	Runnable o = () -> {
	   System.out.println("O que sou eu? Que lambda?");  
	};
	
	//System.out.println(o);
	//System.out.println(o.getClass());
	
	final int numero= 5;
	new Thread(()-> {
	    System.out.println(numero);
	}).start();
	
    }

}
