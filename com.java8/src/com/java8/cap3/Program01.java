package com.java8.cap3;

public class Program01 {

    public static void main(String[] args) {
	
	Validator<String> validatorCEP =
		valor -> {
		    return valor.matches("[0-9]{5}-[0-9]{3}");
		};
	
	
	System.out.println(validatorCEP.valida("04101-300"));
    }

}
