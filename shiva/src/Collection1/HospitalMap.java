package Collection1;
import java.util.HashMap;
class patients
{
	private int id;
	private String name;
	private String disease;
	
	public patients(int id, String name, String disease)
	{
		this.id=id;
		this.name=name;
		this.disease=disease;
	}
  public int getID()
  {
	  return id;
  }
  public String Name()
  {
	  return name;
  }
  public String getDisease()
  {
	  return disease;
  }


  public String toString()
  {
	  return"Patient{ID:\" +id +\" , Name :\" + name +\" , Disease: \"+ disease}";
  }
}
public class HospitalMap {
	

	public static void main(String[] args) {
		HashMap<Integer, Patient> patientMap=new HashMap<>();
		patientMap.put(101, new Patient(101, "shiva", "Cold"));
		patientMap.put(102, new Patient(102, "jakkam", "Fever"));
		patientMap.put(103, new Patient(103, "shiva", "heartbreak"));
		
		
	
		System.out.println("\n Get Patient With ID 102 :");
		
		
		System.out.println(patientMap.get(102));
		
		System.out.println("\n? Does Patient With ID 102 exist :");
		System.out.println(patientMap.containsKey(101));
		
		
		System.out.println("\n? Contains a Paticular value(jakkam)?");
		System.out.println(patientMap.containsValue(new Patient (102,"jakkam","Fever")));
		
		System.out.println("\n Remove Patient with ID 103:");
		System.out.println(patientMap.remove(103));
		
		System.out.println("\n All Paitents");
		
		for (Patient patient : patientMap.values());{
		char[] patient = null;
		System.out.println(patient);
		}
		
		
		 
		 
		

	}

}
