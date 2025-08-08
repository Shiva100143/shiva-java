package Collection1;
import java.util.HashSet;
import java.util.Scanner;

class Patient
{
	 int id;
	 String name;
	 String disease;
	 
	 public Patient (int id, String name, String disease)
	 {
		 this.id=id;
		 this.name=name;
		 this.disease=disease;
	 }
	 public boolean equals(Object o)
	 {
		 if(this==o)return true;
		 if(!(o instanceof Patient)) return false;
		 Patient other= (Patient) o;
		 return this.id==other.id;
	 }
	 public int hashcode()
	 {
		 return Integer.hashCode(id);
	 }
	 
	 public String toString()
	 {
		 return "Patient ID:" +id +" , Name :" + name +" , Disease: "+ disease;
 	 }
     }


public class HospitalRegistration {

	public static void main(String[] args) {
		Scanner SC=new Scanner(System.in);
		HashSet<Patient> patientset=new HashSet<>();
		
		while(true)
		{
			System.out.println(" ospital Registration System");
			System.out.println("1. Register Patient");
			System.out.println("2. View All Regitered Patients");
			System.out.println("3. Exit");
			System.out.println("Enter choice :");
			int choice =SC.nextInt();
			SC.nextLine();
			
			switch(choice)
			{
			
			case 1:
				System.out.println("Enter Paitent ID :");
				int id= SC.nextInt();
				SC.nextLine();
				
				System.out.println("Enter Patient Name :");
				String name=SC.nextLine();
				
				System.out.print("Enter Disease");
				String disease=SC.nextLine();
				
				Patient newPatient=new Patient(id, name , disease);
				
				if(patientset.add(newPatient))
				{
					
					System.out.print("Patient Registration sucessfully!");
					
				}
				else {
					System.out.println("Patient with ID " + id + " is alredy registered");
				}
				break;
			case 2:
				System.out.println("REgistered Patients : ");
				for ( Patient p: patientset)
				{
					System.out.println(p);
				}
				break;
				
			case 3:
				System.out.println("Exiting...");
				SC.close();
				return;
				
				
				default:
					System.out.println("Invalid choice");
			}
			
		}
		

	}

}

