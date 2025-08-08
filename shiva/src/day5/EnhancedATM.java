package day5;
import java.util.Scanner;

public class EnhancedATM {
    static class InvalidPinException extends Exception {
        public InvalidPinException(String message) {
            super(message);
        }
    }

    static class InsufficientBalanceException extends Exception {
        public InsufficientBalanceException(String message) {
            super(message);
        }
    }

    static final int CORRECT_PIN = 1234;
    static double balance = 5000.0; 

    static void validatePin(int enteredPin) throws InvalidPinException {
        if (enteredPin != CORRECT_PIN) {
            throw new InvalidPinException("Invalid PIN entered!");
        }
    }

   static void showMenu(Scanner sc) {
        while (true) {
            System.out.println("\n===== ATM Menu =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Current Balance: ₹" + balance);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ₹");
                    double withdrawAmt = sc.nextDouble();
                    try {
                        withdraw(withdrawAmt);
                    } catch (InsufficientBalanceException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 3:
                    System.out.print("Enter amount to deposit: ₹");
                    double depositAmt = sc.nextDouble();
                    deposit(depositAmt);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM.");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    
    static void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient Balance!");
        }
        balance -= amount;
        System.out.println("Withdrawal successful! New balance: ₹" + balance);
    }

   
    static void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful! New balance: ₹" + balance);
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int attempts = 0;
        final int MAX_ATTEMPTS = 3;

        try {
            System.out.println("Insert ATM Card...");
            while (attempts < MAX_ATTEMPTS) {
                System.out.print("Enter your 4-digit PIN: ");
                int pin = sc.nextInt();
                try {
                    validatePin(pin);
                    System.out.println("PIN verified! Access granted.");
                    System.out.println("Welcome, User1.");
                    showMenu(sc);
                    break;
                } catch (InvalidPinException e) {
                    attempts++;
                    System.out.println("Attempt " + attempts + "/" + MAX_ATTEMPTS + ": " + e.getMessage());
                    if (attempts == MAX_ATTEMPTS) {
                        System.out.println("Too many failed attempts. Card blocked.");
                        return;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        } finally {
            System.out.println("Transaction session ended. Please remove your card.");
            sc.close(); 
        }
    }
}


