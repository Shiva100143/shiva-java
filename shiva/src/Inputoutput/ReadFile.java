package Inputoutput;

import java.io.*;

public class ReadFile {

	public static void main(String[] args)
 {
		BufferedReader reader=null;
 
try {
	reader=new BufferedReader(new FileReader("text.pdf"));
	String line;
	while((line=reader.readLine()) !=null)
	{
		 System.out.println(line);
	}
} 
catch (FileNotFoundException e) {
	
	System.out.println("File not Found :" + e.getMessage());
}
catch(IOException e)
{
	System.out.println("An I/O error occured" + e.getMessage());
}
finally
{
	try {
		if(reader !=null)
			reader.close();
	}
	catch(IOException e)
	{
		System.out.println("Error closing the reader :" + e.getMessage());
	}
}

	}

}
