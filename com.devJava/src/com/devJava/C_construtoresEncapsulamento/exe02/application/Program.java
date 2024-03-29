package com.devJava.C_construtoresEncapsulamento.exe02.application;

import java.util.Locale;
import java.util.Scanner;

import com.devJava.C_construtoresEncapsulamento.exe02.entities.Account;

public class Program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Account account;
		
		System.out.print("Enter with account number:");
		int number = sc.nextInt();
		System.out.print("Enter account holder:");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.println("Is there  an initial deposit (y/n):");
		char response = sc.next().charAt(0);
		
		if (response == 'y') {
			System.out.println("Enter initial deposit value:");
			double initialDeposit = sc.nextDouble();
			account = new Account(number,holder,initialDeposit);
		}else {
			account = new Account(number, holder);
		}
		
		System.out.println();
		
		System.out.println("Account data:");
		System.out.println(account);
		
		System.out.println();
		
		System.out.println("Enter with deposit value:");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Update account data:");
		System.out.println(account);
		
		
		System.out.println();
		
		System.out.println("Enter with withdraw value:");
		double withdraw = sc.nextDouble();
		account.deposit(withdraw);
		System.out.println("Update account data:");
		System.out.println(account);
		
		
		sc.close();
			
	}

}
