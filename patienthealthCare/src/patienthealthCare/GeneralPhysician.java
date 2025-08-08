package patienthealthCare;

public class GeneralPhysician extends Doctor {
	  public GeneralPhysician(String name) {
	        super(name, "General Physician");
	    }

	    
	    public void diagnose(Patient patient) {
	        System.out.println("Dr. " + name + " (General Physician) diagnosing " + patient.getName() +
	                           " with " + patient.getIllness() + ":");
	        System.out.println("Basic treatment prescribed.");
	    }
	}

	



