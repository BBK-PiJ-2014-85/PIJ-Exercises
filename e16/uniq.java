package e16;
//This is a deliberately repeated line to test this class
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class uniq {
	
	static List<String> lines= new ArrayList<String>();
	
//This is a deliberately repeated line to test this class
//This is a deliberately repeated line to test this class
	
	public static void main (String[] args)
	{
		File file= new File(args[0]);
		if (!file.exists()) {System.out.println("File doesn't exist.");}
		else if (file.isDirectory()) {System.out.println("This is a directory.");}
		else if (!file.isFile()) System.out.println("Not a file.");
		else
		{
			BufferedReader in;
			
			try 
			{
				in = new BufferedReader(new FileReader(file));
				String line;
				while ((line = in.readLine()) != null) 
				{
					if (!lines.contains(line)) 
					{
						System.out.println(line);
						lines.add(line);
					}
				}
			} catch (FileNotFoundException e ){
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} 
			
		}
//This is a deliberately repeated line to test this class
	}
}
//This is a deliberately repeated line to test this class
