package Collection;
import java.util.ArrayList;
import java.util.Scanner;

class Patient {
    private String name;
    private int age;
    private String disease;

    public Patient(String name, int age, String disease) {
        this.name = name;
        this.age = age;
        this.disease = disease;
    }

    public String getName() {
        return name;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Disease: " + disease);
    }

    
    public boolean equals(Object obj) {
        if (obj instanceof Patient) {
            Patient other = (Patient) obj;
            return this.name.equalsIgnoreCase(other.name);
        }
        return false;
    }
}

public class HospitalOPD {
    public static void main(String[] args) {
        ArrayList<Patient> patientList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int choice;

        do {
            System.out.println(" OPD Patient Management System ");
            System.out.println("1. Add New Patient");
            System.out.println("2. View All Patients");
            System.out.println("3. Update Patient Disease");
            System.out.println("4. Remove Patient by Name");
            System.out.println("5. Check if Patient Exists");
            System.out.println("6. Show Total Patients");
            System.out.println("7. Clear All Records");
            System.out.println("8. Check if List is Empty");
            System.out.println("9. Exit");
            System.out.print("Choose option: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Disease: ");
                    String disease = scanner.nextLine();

                    patientList.add(new Patient(name, age, disease));
                    System.out.println("Patient added successfully!");
                    break;

                case 2:
                    System.out.println("List of Patients:");
                    if (patientList.isEmpty()) {
                        System.out.println("No patients recorded.");
                    } else {
                        for (Patient p : patientList) {
                            p.displayInfo();
                        }
                    }
                    break;

                    
                case 3:
                    System.out.print("Enter name to update disease: ");
                    String updateName = scanner.nextLine();
                    boolean updated = false;
                    for (Patient p : patientList) {
                        if (p.getName().equalsIgnoreCase(updateName)) {
                            System.out.print("Enter new disease: ");
                            String newDisease = scanner.nextLine();
                            p.setDisease(newDisease);
                            System.out.println("Disease updated.");
                            updated = true;
                            break;
                        }
                    }
                    if (!updated) {
                        System.out.println("Patient not found.");
                    }
                    break;
                    
                case 4:
                    System.out.print("Enter name of patient to remove: ");
                    String removeName = scanner.nextLine();
                    Patient patientToRemove = null;
                    for (Patient p : patientList) {
                        if (p.getName().equalsIgnoreCase(removeName)) {
                            patientToRemove = p;
                            break;
                        }
                    }
                    if (patientToRemove != null) {
                        patientList.remove(patientToRemove);
                        System.out.println("Patient removed.");
                    } else {
                        System.out.println("Patient not found.");
                    }
                    break;

                case 5:
                    System.out.print("Enter name to search: ");
                    String searchName = scanner.nextLine();
                    Patient searchPatient = new Patient(searchName, 0, "");
                    if (patientList.contains(searchPatient)) {
                        System.out.println("Patient exists in the record.");
                    } else {
                        System.out.println("Patient not found.");
                    }
                    break;

                case 6:
                    System.out.println("Total Patients: " + patientList.size());
                    break;

                case 7:
                    patientList.clear();
                    System.out.println("All patient records cleared.");
                    break;

                case 8:
                    if (patientList.isEmpty()) {
                        System.out.println("Patient list is empty.");
                    } else {
                        System.out.println("Patient list is not empty.");
                    }
                    break;

                case 9:
                    System.out.println("Exiting system...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 9);

        scanner.close();
    }
}