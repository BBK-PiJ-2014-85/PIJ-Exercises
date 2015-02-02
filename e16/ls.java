package e16;

import java.io.File;

public class ls {
	public static void main(String[] args)
	{
		String fileName = "./";
		File file = new File(fileName);
		File[] filesInDirectory = file.listFiles();
		for(File f : filesInDirectory) System.out.println(f);
		
	}
}
