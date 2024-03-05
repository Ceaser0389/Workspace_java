package com.devJava.J_interfaces.ex04.application;

import com.devJava.J_interfaces.ex04.services.MGDeductionService;
import com.devJava.J_interfaces.ex04.services.PayService;

public class Program {

    public static void main(String[] args) {
	
	PayService payService = new PayService( new MGDeductionService());
	
	double tax = payService.tax(1000.0);
	
	System.out.println(tax);

    }

}
