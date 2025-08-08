package shiv;
import java.util.Scanner;


class MessageSender {
 public void sendMessage() {
     System.out.println("Sending a generic message...");
 }
}


class Email extends MessageSender {
 
 public void sendMessage() {
     System.out.println("Sending message via Email.");
 }
}


class SMS extends MessageSender {
 
 public void sendMessage() {
     System.out.println("Sending message via SMS.");
 }
}


 class MesssageSender {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     MessageSender sender;

     System.out.println("Choose message type:");
     System.out.println("1. Email");
     System.out.println("2. SMS");
     System.out.print("Enter choice: ");
     int choice = scanner.nextInt();

     if (choice == 1) {
         sender = new Email();  
     } else if (choice == 2) {
         sender = new SMS();    
     } else {
         System.out.println("Invalid choice.");
         scanner.close();
         return;
     }

   
     sender.sendMessage();

     scanner.close();
 }
}