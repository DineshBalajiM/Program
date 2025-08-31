package coreJava;

public class SavingsAccount extends BankAccount {
	private double interestRate;

	public SavingsAccount(String name, int accNo, double balance, double interestRate) {
		super(name, accNo, balance);
		this.interestRate = interestRate;
	}

	public void addInterest() {
		double interest = getBalance() * (interestRate / 100);
		deposit(interest); // Reuse method from parent
		System.out.println("Interest of ₹" + interest + " added.");
	}

	// Method Overriding (Polymorphism)
	@Override
	public void withdraw(double amount) {
		if (amount > 50000) {
			System.out.println("Withdrawal limit exceeded for Savings Account!");
		} else {
			super.withdraw(amount);
		}
	}
}
