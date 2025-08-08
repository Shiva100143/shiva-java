package shiv;

public class array {

	public static void main(String[] args)
	{
		
		int [] scores= {10, 20, 30, 40};
		System.out.println("Students Score");
		for (int i=0; i<scores.length; i++)
		{
			
			System.out.println("Student" +(i+1) + ":"+ scores[i]);
		}
		
	}

}
