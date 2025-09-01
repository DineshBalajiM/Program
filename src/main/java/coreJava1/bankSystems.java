package coreJava1;

public class bankSystems implements interfaceClass {
	
	private String userName;
	private String accountNumber;
	private double balance;
	
	public bankSystems(String userName, String accountNumber, double balance) {
		this.userName = userName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public double getBalance() {
		return balance;
	}

	@Override
	public void deposit(double amount) {
		if(amount > 0) {
			balance += amount;
			System.out.println("amount of "+amount+ "depsited succesfully!!");
		}
		else {
			System.out.println("invalid deposit amount");
		}
		
	}

	@Override
	public void withdrawl(double amount) {
		if(amount <= balance) {
			balance -= amount;
			System.out.println("amount of "+amount+"withdrawl succesfully!!");
		}
		else {
			System.out.println("invalid withdrawl amount");
		}
		
	}

	@Override
	public void checkBalance() {
		System.out.println("Balance amount: "+balance);
	}

}
