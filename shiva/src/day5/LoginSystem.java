package day5;
import java.util.Scanner;
class InvalidLoginException extends Exception {
 public InvalidLoginException(String message) {
     super(message);
 }
}

public class LoginSystem {

 
 static final String VALID_USERNAME = "admin";
 static final String VALID_PASSWORD = "pass123";

 
 static void validateCredentials(String username, String password) throws InvalidLoginException {
     if (!username.equals(VALID_USERNAME) || !password.equals(VALID_PASSWORD)) {
         throw new InvalidLoginException("Invalid username or password!");
     }
 }

 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     try {
         System.out.println("Welcome to Secure Login Portal");
         System.out.print("Enter username: ");
         String username = sc.nextLine();

         System.out.print("Enter password: ");
         String password = sc.nextLine();

      
         validateCredentials(username, password);

         System.out.println("Login successful! Access granted.");
         System.out.println("You can now use the system features.");

     } catch (InvalidLoginException e) {
         System.out.println("Login Failed: " + e.getMessage());
     } finally {
         System.out.println("Session ended. Thank you for visiting.");
         sc.close();
     }
 }
}


