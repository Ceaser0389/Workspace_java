package com.devJava.J_interfaces.ex01.model.services;

public class BrasilTaxService implements TaxService {

	@Override
	public double tax(double amount) {
		if(amount <= 100.0) {
			return amount * 0.2;
		}
		else {
			return amount * 0.15;
		}
	}

}
