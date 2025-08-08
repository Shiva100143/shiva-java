package shiv;
class PatientRecord {
    private String PatientName;
    private int Age;
    private String HealthCondition;

   
    public PatientRecord(String name, int age, String condition) {
        this.PatientName = name;
        this.Age = age;
        this.HealthCondition = condition;
    }

   
    public String getPatientName() {
        return PatientName;
    }

    public void setPatientName(String patientName) {
        this.PatientName = patientName;
    }

    
    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        this.Age = age;
    }

    
    public String getHealthCondition() {
        return HealthCondition;
    }

    public void setHealthCondition(String condition) {
        this.HealthCondition = condition;
    }

    
    public void displayInfo() {
        System.out.println("Patient Name: " + PatientName);
        System.out.println("Age: " + Age);
        System.out.println("Health Condition: " + HealthCondition);
    }
}

public class patient {

	public static void main(String[] args) {
		 PatientRecord patient1 = new PatientRecord("kamal", 35, "Diabetes");

	       
	        patient1.displayInfo();

	        
	        patient1.setHealthCondition("Improved");
	        System.out.println("\nAfter Update:");
	        patient1.displayInfo();
		
}
}
