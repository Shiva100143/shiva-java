package BankAccount;
import java.util.HashMap;
import java.util.Map;

public class BankServiceImpl implements BankService {
	private Map<Integer, BankAccount> accounts = new HashMap<>();

    
    public void createAccount(BankAccount account) {
        accounts.put(account.getAccountNumber(), account);
        System.out.println("✅ Account created for: " + account.getAccountHolder());
    }

    
    public void showAccountDetails(int accountNumber) {
        BankAccount acc = accounts.get(accountNumber);
        if (acc != null) {
            System.out.println(" Account Details ");
            System.out.println("Account No: " + acc.getAccountNumber());
            System.out.println("Holder    : " + acc.getAccountHolder());
            System.out.println("Balance   : ₹" + acc.getBalance());
        } else {
            System.out.println("❌ Account not found.");
        }
    }

    
    public BankAccount getAccount(int accountNumber) {
        return accounts.get(accountNumber);


}
}
