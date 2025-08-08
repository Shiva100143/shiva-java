package shiv;
import java.util.Scanner;

abstract class Remote {
 abstract void turnOn();
 abstract void turnOff();
}

class TvRemote extends Remote {
 void turnOn() {
     System.out.println("TV is now ON.");
 }

 void turnOff() {
     System.out.println("TV is now OFF.");
 }
}

public class RemoteControl {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     Remote myRemote = new TvRemote();

     System.out.println("Remote Control Device");
     System.out.println("1. Turn ON");
     System.out.println("2. Turn OFF");
     System.out.print("Enter your choice: ");

     int choice = scanner.nextInt();

     switch (choice) {
         case 1:
             myRemote.turnOn();
             break;
         case 2:
             myRemote.turnOff();
             break;
         default:
             System.out.println("Invalid choice.");
     }

     scanner.close();
 }
}


