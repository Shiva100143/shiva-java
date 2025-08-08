package day8;
import java.util.Scanner;
public class FormValidation {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter your name: ");
	        java.lang.String name = sc.nextLine();

	        System.out.print("Enter your age: ");
	        java.lang.String ageStr = sc.nextLine();

	        System.out.print("Enter your marks: ");
	        java.lang.String marksStr = sc.nextLine();

	        try {
	              int age = Integer.parseInt(ageStr);
	            
	            double marks = Double.parseDouble(marksStr);

	            if (age < 0 || age > 150) {
	                System.out.println("Invalid age. Must be between 0 and 150.");
	            } else if (marks < 0.0 || marks > 100.0) {
	                System.out.println("Invalid marks. Must be between 0 and 100.");
	            } else {
	               
	                System.out.println(" Form Submitted ");
	                System.out.println("Name: " + name);
	                System.out.println("Age: " + age);
	                System.out.println("Marks: " + marks);
	            }

	        } catch (NumberFormatException e) {
	            System.out.println("Error: Age or marks must be numeric values.");
	        }

	        sc.close();
}

}
