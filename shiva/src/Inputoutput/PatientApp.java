package Inputoutput;
import java.io.*;
import java.util.*;

class Patient implements Serializable {
   
	private static final long serialVersionUID = 1L;
	int id;
    String name;
    String disease;
    int age;

    public Patient(int id, String name, String disease, int age) {
        this.id = id;
        this.name = name;
        this.disease = disease;
        this.age = age;
    }

    public String toString() {
        return id + " - " + name + " - " + disease + " - " + age;
    }
}

public class PatientApp {
    static final String FILE_NAME = "patients.dat";

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			List<Patient> patientList = loadPatients();

			System.out.println("1. Add Patient");
			System.out.println("2. Update Patient");
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();
			sc.nextLine();

			if (choice == 1) {
			    
			    System.out.println("Enter ID:");
			    int id = sc.nextInt();
			    sc.nextLine();

			    System.out.println("Enter Name:");
			    String name = sc.nextLine();

			    System.out.println("Enter Disease:");
			    String disease = sc.nextLine();

			    System.out.println("Enter Age:");
			    int age = sc.nextInt();
			    sc.nextLine();

			    patientList.add(new Patient(id, name, disease, age));
			    savePatients(patientList);
			    System.out.println("Patient added.");
			} else if (choice == 2) {
			   
			    System.out.println("Enter Patient ID to update:");
			    int updateId = sc.nextInt();
			    sc.nextLine();

			    boolean found = false;
			    for (Patient p : patientList) {
			        if (p.id == updateId) {
			            System.out.println("Existing: " + p);

			            System.out.print("Enter new Name: ");
			            p.name = sc.nextLine();

			            System.out.print("Enter new Disease: ");
			            p.disease = sc.nextLine();

			            System.out.print("Enter new Age: ");
			            p.age = sc.nextInt();
			            sc.nextLine();

			            found = true;
			            break;
			        }
			    }

			    if (found) {
			        savePatients(patientList);
			        System.out.println("Patient details updated.");
			    } else {
			        System.out.println("Patient not found.");
			    }
			}

      
			System.out.println("\n--- All Patients ---");
			for (Patient p : patientList) {
			    System.out.println(p);
			}
		}
    }

 
     static List<Patient> loadPatients() {
        List<Patient> list = new ArrayList<>();
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            list = (List<Patient>) in.readObject();
        } catch (Exception e) {
            
        }
        return list;
    }

    
     static void savePatients(List<Patient> list) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            out.writeObject(list);
        } catch (IOException e) {
            System.out.println("Error saving patients.");
        }
    }
}