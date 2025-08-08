package BankAccount;

public interface BankService {
	void createAccount(BankAccount account);
	void showAccountDetails(int accountNumber);
	BankAccount getAccount(int accountNumber);


}
