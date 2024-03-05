package com.devJava.J_interfaces.ex01.model.services;

import com.devJava.J_interfaces.ex01.model.entities.CarRental;
import com.devJava.J_interfaces.ex01.model.entities.Invoice;

public class RentalService {
	
	private Double pricePerDay;
	private Double pricePerHour;
	
	// só recebe alguma classe que implementa a interface 
	private TaxService taxService; // tem uma dependencia com a minha interface 
	public RentalService(Double pricePerDay, Double pricePerHour,
		TaxService taxService) {
		
		this.pricePerDay = pricePerDay;
		this.pricePerHour = pricePerHour;
		this.taxService = taxService;
	}
	
	public void  processInvoice(CarRental carRental) {
		long t1 = carRental.getStart().getTime();
		long t2 = carRental.getFinish().getTime();
		double hours = (double) (t2 -t1) / 1000/ 60/60;
		
		double basicPayment;
		if (hours <= 12.0) {
			 basicPayment =   pricePerHour * Math.ceil(hours) ;
		} else {
			 basicPayment =   pricePerDay  * Math.ceil(hours/24);
		}
		
		double tax = taxService.tax(basicPayment);
		
		carRental.setInvoice(new Invoice(basicPayment,tax));
	}
	
}
