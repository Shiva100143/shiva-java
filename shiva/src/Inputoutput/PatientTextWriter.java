package Inputoutput;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;

public class PatientTextWriter {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        try (
	            BufferedWriter bw = new BufferedWriter(new FileWriter("test.txt", true))
	        ) {
	            System.out.print("Enter Patient ID: ");
	            int id = sc.nextInt();
	            sc.nextLine(); 

	            System.out.print("Enter Name: ");
	            String name = sc.nextLine();

	            System.out.print("Enter Disease: ");
	            String disease = sc.nextLine();

	            System.out.print("Enter Age: ");
	            int age = sc.nextInt();

	            bw.write("ID: " + id + ", Name: " + name + ", Disease: " + disease + ", Age: " + age);
	            bw.newLine();
	            System.out.println("Patient record saved successfully.");

	        } catch (IOException e) {
	            System.out.println("An error occurred while writing to file: " + e.getMessage());
	        }

	        sc.close();
	}

}
