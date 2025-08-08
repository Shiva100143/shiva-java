package Collection1;
import java.util.TreeSet;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Appointment implements Comparable<Appointment> {
    private String patientName;
    private LocalDateTime dateTime;

    public Appointment(String patientName, String dateTimeStr) {
        this.patientName = patientName;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        this.dateTime = LocalDateTime.parse(dateTimeStr, formatter);
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public String getPatientName() {
        return patientName;
    }

    @Override
    public int compareTo(Appointment other) {
        return this.dateTime.compareTo(other.dateTime); 
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Appointment)) return false;
        Appointment other = (Appointment) obj;
        return this.dateTime.equals(other.dateTime);
    }

    @Override
    public int hashCode() {
        return dateTime.hashCode();
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        return "Appointment{patient='" + patientName + "', dateTime=" + dateTime.format(formatter) + "}";
    }
}

public class AppointmentManager {
    public static void main(String[] args) {
        TreeSet<Appointment> appointments = new TreeSet<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of appointments to schedule: ");
        int count = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < count; i++) {
            System.out.println("\nEnter details for appointment " + (i + 1) + ":");
            System.out.print("Patient Name: ");
            String name = sc.nextLine();

            System.out.print("Appointment Date & Time (yyyy-MM-dd HH:mm): ");
            String dateTime = sc.nextLine();

            try {
                Appointment appt = new Appointment(name, dateTime);
                if (!appointments.add(appt)) {
                    System.out.println("⚠ An appointment already exists at this time. Skipped.");
                }
            } catch (Exception e) {
                System.out.println("❌ Invalid date format. Please try again.");
                i--; // Repeat this iteration
            }
        }

        System.out.println("\n📅 Scheduled Appointments (Chronological):");
        for (Appointment appt : appointments) {
            System.out.println(appt);
        }

        sc.close();
    }
}