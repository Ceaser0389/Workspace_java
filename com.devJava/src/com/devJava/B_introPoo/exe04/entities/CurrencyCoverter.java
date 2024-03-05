package com.devJava.B_introPoo.exe04.entities;

public class CurrencyCoverter {

public static double IOF = 0.06;
	
	
	public static double dollarToReal(double amount, double dollarToPrice) {
		return amount * dollarToPrice * (1.0 + IOF);
	}
	
	
	
	
	
}
