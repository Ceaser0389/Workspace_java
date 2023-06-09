package entities;

public class SavingsAccount extends Account {

	private double interestRace;
	
	@SuppressWarnings("unused")
	private SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, double balance, 
	    double interestRace)
	{
		super(number, holder, balance);
		this.interestRace = interestRace;
	}

	public double getInterestRace() {
		return interestRace;
	}

	public void setInterestRace(double interestRace) {
		this.interestRace = interestRace;
	}
	
	
	public void  updateBalance() {
		balance += balance + interestRace;
	}
	
	 @Override
	 public void withdraw(double amount) {
		  balance -= amount ;
	  }
	
	
	
}
