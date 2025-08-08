package shiv;


	import java.util.Scanner;
	public class cldw_ex {


	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	     
	        int[] denominations = {500, 200, 100, 50};
	        int[] count = new int[denominations.length];

	        
	        System.out.println("Enter number of notes for each denomination:");
	        for (int i = 0; i < denominations.length; i++) {
	            System.out.print("₹" + denominations[i] + ": ");
	            count[i] = sc.nextInt();
	        }

	        
	        int currentBalance = 0;
	        for (int i = 0; i < denominations.length; i++) {
	            currentBalance += denominations[i] * count[i];
	        }
	        System.out.println("\nCurrent ATM Balance: ₹" + currentBalance);

	       
	        System.out.print("Enter amount to debit: ₹");
	        int debit = sc.nextInt();

	        if (debit <= currentBalance) {
	            int finalBalance = currentBalance - debit;
	            System.out.println("Debited Amount: ₹" + debit);
	            System.out.println("Final Balance: ₹" + finalBalance);
	        } else {
	            System.out.println("Error: Insufficient funds in ATM!");
	        }

	        sc.close();
	    }

}
