package com.devJava.J_interfaces.ex04.services;

public class PayService {

    
    private DeductionService deductionService;  //declarou a dependencia
    
    /*
     *  o deductionService atributo recebe o deductionservice no construtor //
     * oque contitui uma injeça dependecia via construtor
     */    
   
    public PayService(DeductionService deductionService) {
	this.deductionService = deductionService;
    }

    public double tax(double amount) {
	
	amount = amount - deductionService.deduction(amount);
	return amount * 0.2;
    }
    
}
