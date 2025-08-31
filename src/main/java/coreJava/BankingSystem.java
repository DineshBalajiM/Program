package coreJava;

public class BankingSystem {
	public static void main(String[] args) {
		SavingsAccount acc1 = new SavingsAccount("Dinesh", 123456, 10000.0, 5.0);

		acc1.checkBalance();
		acc1.deposit(5000);
		acc1.withdraw(2000);
		acc1.addInterest();
		acc1.withdraw(60000); // Limit check
		acc1.checkBalance();
	}
}
