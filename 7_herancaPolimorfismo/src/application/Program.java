package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;




public class Program {

	public static void main(String[] args) {
		
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);

	
	Account acc = new Account(1001,"alex",0.0);
	BusinessAccount bacc = new BusinessAccount(1002,"cesar",0.0,500);
	
	acc.deposit(200);
	
	//UPCASTING
	 Account acc1 = bacc;
	 acc1.getBalance();
	 
	 Account acc2 = new BusinessAccount(1003,"bob",0.0,200.0);
	 
	 Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
	
	//DOWNCASTING
	 
	 BusinessAccount  acc4 =(BusinessAccount) acc2;
	 acc4.loan(100.0);
	
	// BusinessAccount  acc5 =(BusinessAccount) acc3;
	   if(acc3 instanceof BusinessAccount) {
		   BusinessAccount  acc5 =(BusinessAccount) acc3;
		   acc5.loan(200);
		   System.out.println("Loan!");
	   }
	
	   if(acc3 instanceof SavingsAccount) {
		   SavingsAccount  acc5 = (SavingsAccount)acc3;
		   acc5.updateBalance();
		   System.out.println("Update!");
	   }
	
	
	   Account ac1 = new Account(1000,"cesar",1000);
	   ac1.withdraw(200);
	
	   System.out.println(ac1.getBalance());
	
	   Account ac2 = new SavingsAccount(1002,"maria",1000,0.01);
	   ac2.withdraw(200);
	   System.out.println(ac2.getBalance());
	   
	   
	   Account ac3 = new BusinessAccount(1003,"Bob",1000.0,500.0);
	   ac3.withdraw(200.0);
	   System.out.println(acc3.getBalance());
	
	   
	   Account x = new Account(1020,"alex",1000);
	   Account y = new SavingsAccount(1020, "kiko", 1000, 0.01);
	   
	   
	   System.out.println(x.getBalance());
	   System.out.println(y.getBalance());
	   
	   
	   
	   
	   
	   
	   
	   
	  sc.close();
	}

}
