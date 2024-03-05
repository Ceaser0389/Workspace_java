package com.java8.cap3;

public class Program03 {

    public static void main(String[] args) {
	
	int numero = 5;
	new Thread(() -> {
	
	//    System.out.println(numero); // não compila
	}).start();
	
	numero = 10; // por causa dessa linha!
	
    }
}
