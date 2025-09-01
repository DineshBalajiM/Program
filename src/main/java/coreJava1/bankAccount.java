package coreJava1;

public class bankAccount {
	public static void main(String [] args) {
	bankOperations bnkOp = new bankOperations("Dinesh", "123456", 1000, 5);
	
	bnkOp.checkBalance();
	bnkOp.deposit(1000);
	bnkOp.withdrawl(500);
	bnkOp.interestRate(10);
	bnkOp.withdrawl(600000);
	}
}
