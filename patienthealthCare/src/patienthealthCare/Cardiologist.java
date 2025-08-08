package patienthealthCare;

public class Cardiologist extends Doctor{
	 public Cardiologist(String name) {
	        super(name, "Cardiologist");
	    }

	    
	    public void diagnose(Patient patient) {
	        System.out.println("Dr. " + name + " (Cardiologist) diagnosing " + patient.getName() +
	                           " with " + patient.getIllness() + ":");
	        if (patient.getIllness().toLowerCase().contains("heart")) {
	            System.out.println("Specialized heart treatment prescribed.");
	        } else {
	            System.out.println("Consult appropriate specialist or provide basic advice.");
	        }
	    }


}
