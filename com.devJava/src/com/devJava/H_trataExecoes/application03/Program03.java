package com.devJava.H_trataExecoes.application03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import com.devJava.H_trataExecoes.application03.entities.Reservation;
import com.devJava.H_trataExecoes.application03.exceptions.DomainException;

public class Program03 {
   public static void main(String[] args) {
	
	   Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		
			try {
				System.out.println("Room number");
				int number = sc.nextInt();
				System.out.println("Check-in date (dd/mm/yyyy)");
				Date checkIn = sdf.parse(sc.next());
				System.out.println("Check-out date (dd/mm/yyyy) ");
				Date checkOut = sdf.parse(sc.next());
				
				
				Reservation reservation = new Reservation(number,checkIn,checkOut);
				System.out.println("Reservation:" + reservation);	
					
				System.out.println();
				System.out.println("Enter  data to update  the reservation:");
				System.out.print("Check-in date (dd/mm/yyyy)");
				checkIn  = sdf.parse(sc.next());
				System.out.print("Check-out date (dd/mm/yyyy)");
				checkOut = sdf.parse(sc.next());
				
				reservation.updateDates(checkIn, checkOut);
				
				System.out.println(" reservation" + reservation);
			
			} catch (ParseException e) {
				
				System.out.println("Invalid date format");
			}
			catch (DomainException e) {
				System.out.println("Error in reservation: " + e.getMessage());
			}
			
		
		
		sc.close();

	   
	   
 }
}
