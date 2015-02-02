package e16;

import java.io.BufferedReader;
import java.io.File;	
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class cp {

	public static void main (String[] args)
	{
		boolean overwrite=false;

		File file1= new File(args[0]);
		File file2= new File(args[1]);
		if (!file1.exists()) {System.out.println("File doesn't exist.");}
		else
		{
			if (file2.exists()) 
			{
				System.out.println("Second file exists, would you like to overwrite (y or n)?");
				
				Scanner kb = new Scanner(System.in);
				String value;
				value = kb.next();
				while (!value.equals("y") && !value.equals("n"))
				{
					System.out.println("Invalid input. Please input y or n.");
					kb.next();
				}
				
				kb.close();
				
				if (value.equals("y")) overwrite = true;
				
			}
				Path p1 = file1.toPath();
				Path p2 = file2.toPath();
				
				try
				{
				if (overwrite) Files.copy(p1, p2, StandardCopyOption.REPLACE_EXISTING);
				else if (!file2.exists()) Files.copy(p1, p2);
				} catch (IOException e)
				{
					e.printStackTrace();
				}
		}		
		
	}

}
	

