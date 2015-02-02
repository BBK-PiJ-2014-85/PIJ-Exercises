package e16;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class catb {
	public static void main (String[] args)
	{
		File file;
		BufferedReader in;
		
		for (String f : args)
		{
		file= new File(f);
		if (!file.exists()) {System.out.println("File " + f+  " doesn't exist.");}
		else if (file.isDirectory()) {System.out.println(f + " is a directory.");}
		else if (!file.isFile()) System.out.println(f + "is not a file.");
		else
		{	
			System.out.println("Printing file: " + f);
	
			try 
			{
				in = new BufferedReader(new FileReader(file));
				String line;
				while ((line = in.readLine()) != null) System.out.println(line);
			} catch (FileNotFoundException e ){
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} 
			
		}
		}

	}
}
