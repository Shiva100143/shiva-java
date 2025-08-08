package patienthealthCare;

public class Main {

	public static void main(String[] args) {
		 PatientService Service = new PatientServiceImpl();

	        Patient patient1 = new Patient(1, "Shiva", 60, "Chest Pain");
	        Patient patient2 = new Patient(2, "kamal", 55, "Heart Attack");

	        Service.registerPatient(patient1);
	        Service.registerPatient(patient2);

	        System.out.println("\nPatient Details:");
	        Service.showPatientDetails(1);
	        Service.showPatientDetails(2);

	        Doctor gp = new GeneralPhysician("Smith");
	        Doctor cardiologist = new Cardiologist("Jones");

	        System.out.println("\nDiagnoses:");
	        gp.diagnose(patient1);
	        gp.diagnose(patient2);

	        cardiologist.diagnose(patient1);
	        cardiologist.diagnose(patient2);

		

	}

}
