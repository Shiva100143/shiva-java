package Inputoutput;
import java.io.*;

public class WriteFile {

	public static void main(String[] args){
		
		
		
		BufferedWriter writer=null;
		try {
			
		
		writer= new BufferedWriter(new FileWriter("text.pdf" ,true));
		writer.write("Hello frnds");
		writer.newLine();
		System.out.println("Sucessfully Written to file");
		}
		catch(IOException e)
		{
			System.out.println("An error occurred while writing to the file: " +e.getMessage());
		}
		finally
		{
			try {
				if(writer !=null)
					writer.close();
			}
			catch(IOException e)
			{
				System.out.println("Error closing the reader :" + e.getMessage());
			}
		}
		}

}
