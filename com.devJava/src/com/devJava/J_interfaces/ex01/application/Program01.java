package com.devJava.J_interfaces.ex01.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import com.devJava.J_interfaces.ex01.model.entities.CarRental;
import com.devJava.J_interfaces.ex01.model.entities.Vehicle;
import com.devJava.J_interfaces.ex01.model.services.BrasilTaxService;
import com.devJava.J_interfaces.ex01.model.services.RentalService;

public class Program01 {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");
		
		System.out.println("Enter rental data:");
		System.out.print("Car Model");
		String carModel = sc.nextLine();
		
		System.out.print("Pickup (dd/MM/yyyy HH:ss)");
		Date start = sdf.parse(sc.nextLine());
		System.out.print("Return (dd/MM/yyyy HH:ss)");
		Date finish= sdf.parse(sc.nextLine());
		
		
		CarRental cr = new CarRental(start,finish, new Vehicle(carModel));
		
		System.out.print("Enter price per hour: ");
		double PricePerHour = sc.nextDouble();
		System.out.print("Enter price per day: ");
		double PricePerDay = sc.nextDouble();
		
		RentalService  rentalService = new RentalService(PricePerDay,PricePerHour,
				new BrasilTaxService()); /// quem instancia class cumpre o contrato da interface é o main, mais especifica e concreta 
		
		rentalService.processInvoice(cr);
		
		System.out.println("INVOICE");
		System.out.println("Basic payment: " + String.format("%.2f", 
		cr.getInvoice().getBasicPayment()));
		System.out.println("Tax: " + String.format("%.2f", 
		cr.getInvoice().getTax()));
		System.out.println("Total Payment: " + String.format("%.2f", 
		cr.getInvoice().getTotalPayment()));
		
		
		
		sc.close();


	}

}
