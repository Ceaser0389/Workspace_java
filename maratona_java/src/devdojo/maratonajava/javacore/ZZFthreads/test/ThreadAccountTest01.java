package devdojo.maratonajava.javacore.ZZFthreads.test;

import devdojo.maratonajava.javacore.ZZFthreads.modelo.Account;

public class ThreadAccountTest01 implements Runnable {

    private   Account account = new Account();
    
    
    public static void main(String[] args) {
	
	ThreadAccountTest01 threadAccountTest01  = new ThreadAccountTest01();
	Thread t1 = new Thread(threadAccountTest01, "Hestia");
	Thread t2 = new Thread(threadAccountTest01, "Bell Cranel");
	    
	 t1.start();
	 t2.start();
    }
    
    

    @Override
    public void run() {
	for (int i = 0; i  < 5; i++) {
	    withDrawl(10);
	    if (account.getBalance() < 0) {
		System.out.println("Fodeu");
	 }
	}
	
    }

    
    
    private synchronized  void withDrawl (int amount) {
	if(account.getBalance() >= amount) {
	    System.out.println( getThreadName() + 
		  " esta´ indo sacar"+ "dinherio ");
	    account.withDrawl(amount);
	    System.out.println(getThreadName() + "completou o saque, valor atual da conta: " 
	    + account.getBalance());
	}
	else {
	    System.out.println("Sem dinheiro par: "+ getThreadName() + " efetuar o saque:  "
		    + account.getBalance());
	}
    }
    
    private String getThreadName() {
	return  Thread.currentThread().getName();
	
    }









   
    
  
}
