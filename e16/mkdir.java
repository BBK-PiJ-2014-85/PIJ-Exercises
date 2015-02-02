package e16;

import java.io.File;

public class mkdir {

	public static void main(String[] args)
	{
		for (String f : args)
		{
			File newDir = new File(f);
			newDir.mkdir();
		}
		
		
	}
	
}
