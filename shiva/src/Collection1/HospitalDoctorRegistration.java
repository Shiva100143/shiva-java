package Collection1;
import java.util.HashSet;
import java.util.Scanner;

class Doctor {
    private String licenseNumber;
    private String name;
    private String department;

    public Doctor(String licenseNumber, String name, String department) {
        this.licenseNumber = licenseNumber;
        this.name = name;
        this.department = department;
    }
    
   public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Doctor)) return false;
        Doctor other = (Doctor) o;
        return this.licenseNumber.equals(other.licenseNumber);
    }
  
    public int hashCode() {
        return licenseNumber.hashCode();
    }

    
    public String toString() {
        return "Doctor License No: " + licenseNumber + ", Name: " + name + ", Department: " + department;
    }
}

public class HospitalDoctorRegistration {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        HashSet<Doctor> doctorSet = new HashSet<>();

        while (true) {
            System.out.println(" Doctor Registration System");
            System.out.println("1. Register Doctor");
            System.out.println("2. View All Registered Doctors");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = SC.nextInt();
            SC.nextLine();  

            switch (choice) {
                case 1:
                    System.out.print("Enter Doctor License Number: ");
                    String license = SC.nextLine();

                    System.out.print("Enter Doctor Name: ");
                    String name = SC.nextLine();

                    System.out.print("Enter Department: ");
                    String department = SC.nextLine();

                    Doctor newDoctor = new Doctor(license, name, department);
                    if (doctorSet.add(newDoctor)) {
                        System.out.println("Doctor registered successfully!");
                    } else {
                        System.out.println("Doctor with License No. " + license + " is already registered.");
                    }
                    break;

                case 2:
                    System.out.println("Registered Doctors:");
                    for (Doctor d : doctorSet) {
                        System.out.println(d);
                    }
                    break;

                case 3:
                    System.out.println("Exiting Doctor Registration System...");
                    SC.close();
                    return;
                    
               
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}

