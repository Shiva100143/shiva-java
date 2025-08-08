package shiv;

import java.util.Scanner;

public class chatBot {
	String userMessage;
	 void getUserMessage() {
		 java.util.Scanner sc = new Scanner(System.in);
		 System.out.println("you: ");
		 userMessage = sc.nextLine();
		 
	 }
	 void respond() {
		 if (userMessage.equals("hi")) {
			 System.out.println("Bot: Hello😎!");
		 } 
		 else if (userMessage.equals("bye")) {
			 System.out.println("Bot: Have a nice day");
		 }
	 }
	 
	public static void main(String[] args) {
		

	}

}
