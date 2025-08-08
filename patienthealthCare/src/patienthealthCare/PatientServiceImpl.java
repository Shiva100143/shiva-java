package patienthealthCare;

import java.util.HashMap;
import java.util.Map;

abstract class PatientServiceImpl implements PatientService {
    private Map<Integer, Patient> patientMap = new HashMap<>();

    
    public void registerPatient(Patient patient) {
        patientMap.put(patient.getId(), patient);
        System.out.println("Patient registered: " + patient.getName());
    }

    
    public void showPatientDetails(int id) {
        Patient patient = patientMap.get(id);
        if (patient != null) {
            System.out.println("Patient ID: " + patient.getId());
            System.out.println("Name: " + patient.getName());
            System.out.println("Age: " + patient.getAge());
            System.out.println("Illness: " + patient.getIllness());
        } else {
            System.out.println("Patient not found!");
        }
    }
}

