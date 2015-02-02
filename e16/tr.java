package e16;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class tr {
	
	static int lenReplace=0;
	static int lenFind=0;
	static int lenDiff=0;
	static String find, replace;
	
	public static void main (String[] args)
	{
		File file= new File(args[0]);
		if (!file.exists()) {System.out.println("File doesn't exist.");}
		else if (file.isDirectory()) {System.out.println("This is a directory.");}
		else if (!file.isFile()) System.out.println("Not a file.");
		else
		{
			BufferedReader in;
			lenReplace = args[2].length();
			lenFind = args[1].length();
			//lenDiff = lenFind
			find = args[1];
			replace = args[2];
			String newLine="";
			
			try 
			{
				in = new BufferedReader(new FileReader(file));
				String line;
				while ((line = in.readLine()) != null) 
					{
					newLine = replace(line);
					System.out.println(newLine);
					}
			} catch (FileNotFoundException e ){
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} 
			
		}

	}
	
	private static String replace(String line)
	{
		int i=0;
		while (i < (line.length() - lenFind + 1))
		{
			if (line.substring(i, i + lenFind).equals(find))
			{
				line = (i != 0? line.substring(0,i): "") + replace + (i < (line.length() - lenFind) ? line.substring(i + lenFind) : "");
				i += lenReplace - lenFind;
			}
			
			i++;
		}
		return line;
	}
}
