package coreJava;

public class BankAccount implements BankOperations {
	private String accountHolderName;
	private int accountNumber;
	private double balance;

	public BankAccount(String name, int accNo, double initialBalance) {
		this.accountHolderName = name;
		this.accountNumber = accNo;
		this.balance = initialBalance;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	@Override
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("₹" + amount + " deposited successfully.");
		} else {
			System.out.println("Invalid deposit amount.");
		}
	}

	@Override
	public void withdraw(double amount) {
		if (amount <= balance) {
			balance -= amount;
			System.out.println("₹" + amount + " withdrawn successfully.");
		} else {
			System.out.println("Insufficient balance!");
		}
	}

	@Override
	public void checkBalance() {
		System.out.println("Available Balance: ₹" + balance);
	}
}
