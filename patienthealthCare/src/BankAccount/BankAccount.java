package BankAccount;

public class BankAccount {
	 private int accountNumber;
	 private String accountHolder;
	 private double Balance;
	 public BankAccount(int accountNumber, String accountHolder, double initialBalance, double Balance) {
	 this.accountNumber = accountNumber;
	 this.accountHolder = accountHolder;
	 this.Balance = Balance;
	     }

	 public int getAccountNumber() { return accountNumber; }
	 public String getAccountHolder() { return accountHolder; }
	 public double getBalance() { return Balance; }

	 public void deposit(double amount) {
	  if (amount > 0) {
	 Balance += amount;
	 System.out.println("Deposited ₹" + amount + " to " + accountHolder + "'s account.");
	  } else {
	  System.out.println("Invalid deposit amount.");
	         }
	     }

	 public void withdraw(double amount) {
	 if (amount > 0 && amount <= Balance) {
	 Balance -= amount;
	 System.out.println("Withdrawn ₹" + amount + " from " + accountHolder + "'s account.");
	  } else {
	  System.out.println("Insufficient funds or invalid amount for " + accountHolder + ".");


}
}
}
