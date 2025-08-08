package Inputoutput;
import java.io.*;
//import java.io.File;
//import java.io.IOException;

public class FileCreation {

	public static void main(String[] args) 
	{
    try	
    {
    	File file=new File("text.pdf");
    	if(file.createNewFile())
    	
    		System.out.println("File Created: " + file.getName());
    		else
    		System.out.println("File already exists");
   }
	catch(IOException e)
    {
		e.printStackTrace();
    }

	}

}
