package Collection1;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

class Patients {
    private int id;
    private String name;

    public Patients(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() { return id; }

    public String getName() { return name; }

   
    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }
}

public class AppointmentScheduler {
    public static void main(String[] args) {
        TreeMap<LocalDateTime, Patients> appointmentMap = new TreeMap<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        appointmentMap.put(LocalDateTime.of(2025, 8, 1, 10, 30), new Patients(102, "Shiva"));
        appointmentMap.put(LocalDateTime.of(2025, 8, 1, 11, 00), new Patients(101, "Bharath"));
        appointmentMap.put(LocalDateTime.of(2025, 8, 1, 12, 15), new Patients(104, "Sai"));
        appointmentMap.put(LocalDateTime.of(2025, 8, 1, 9, 45), new Patients(103, "Kamal"));
        
        
        System.out.println(" Scheduled Appointments:");
        for (Map.Entry<LocalDateTime, Patients> entry : appointmentMap.entrySet()) {
            System.out.println("Time " + entry.getKey().format(formatter) + " → Patient: " + entry.getValue());
        }
        
        LocalDateTime oldTime = LocalDateTime.of(2025, 8, 1, 12, 15);
        LocalDateTime newTime = LocalDateTime.of(2025, 8, 1, 13, 0);

        System.out.println("\n Rescheduling Kamal's appointment...");
        if (appointmentMap.containsKey(oldTime)) {
            Patients kamal = appointmentMap.remove(oldTime);
            appointmentMap.put(newTime, kamal);
            System.out.println(" Rescheduled to: " + newTime.format(formatter));
        } else {
            System.out.println(" Original appointment not found.");
        }
        
        System.out.println("\n Updated Appointment List:");
        for (Map.Entry<LocalDateTime, Patients> entry : appointmentMap.entrySet()) {
            System.out.println("Time " + entry.getKey().format(formatter) + " → Patient: " + entry.getValue());
        }

    }
}


