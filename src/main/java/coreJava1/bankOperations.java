package coreJava1;

public class bankOperations extends bankSystems{
	
	private double interest;
	
	public bankOperations(String userName, String accountNumber, double balance, double interest) {
		super(userName, accountNumber, balance);
		this.interest = interest;
	}
	
	public void interestRate(double interest) {
		double interestRt = getBalance() *(interest/100);
		deposit(interestRt);
		System.out.println("interest rate of "+interestRt+"deposited succesfullys");
	}
	
	@Override
	public void withdrawl(double amount) {
		if(amount > 50000) {
			System.out.println("Withdrawl limit exceed for the savings account!!");
		}
		else {
			super.withdrawl(amount);
		}
	}

}
