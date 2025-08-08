package com.kka;
import java.util.HashMap;
import java.util.Scanner;

class Patient {
    private String id;
    private String name;

    public Patient(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void display() {
        System.out.println("ID: " + id + "  Name: " + name);
    }
}

public class HospitalRegistration {
    public static void main(String[] args) {
        HashMap<String, Patient> patientMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Hospital Registration System ---");
            System.out.println("1. Register New Patient");
            System.out.println("2. View Registered Patients");
            System.out.println("3. Search Patient by ID");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter Patient ID: ");
                    String id = scanner.nextLine();

                    if (patientMap.containsKey(id)) {
                        System.out.println("Patient with ID " + id + " is already registered.");
                    } else {
                        System.out.print("Enter Patient Name: ");
                        String name = scanner.nextLine();
                        Patient newPatient = new Patient(id, name);
                        patientMap.put(id, newPatient);
                        System.out.println("Patient registered successfully.");
                    }
                    break;

                case 2:
                    System.out.println("\n List of Registered Patients:");
                    if (patientMap.isEmpty()) {
                        System.out.println("No patients registered yet.");
                    } else {
                        for (Patient p : patientMap.values()) {
                            p.display();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Patient ID to search: ");
                    String searchId = scanner.nextLine();
                    Patient foundPatient = patientMap.get(searchId);
                    if (foundPatient != null) {
                        System.out.println("Patient Name: " + foundPatient.getName());
                    } else {
                        System.out.println("No patient found with ID " + searchId);
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}