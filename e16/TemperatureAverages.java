package e16;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TemperatureAverages {

	int count=0, total=0, lineCount=0;
	
	public static void main(String[] args)
	{
		String fileString = "e16/temperatureExample.csv";
		File file = new File(fileString);
		
		BufferedReader in;
		
		TemperatureAverages ta = new TemperatureAverages();
		
		try 
		{
			in = new BufferedReader(new FileReader(file));
			String line;
			while ((line = in.readLine()) != null) ta.calculateAverage(line);;
		} catch (FileNotFoundException e ){
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		System.out.print("Overall average was " + ta.getAverage() + ".");
	}
	
	private double getAverage()
	{
		double overallAverage = (double)total/(double)count;
		return overallAverage;
	}
	
	private void calculateAverage(String line)
	{
		int countRow=0;
		int totalRow=0;
		
		String nextIntString = "";
		for (int i = 0; i <= line.length(); i++)
		{
			if (i== line.length() || line.charAt(i) == ',')
			{
				totalRow += Integer.parseInt(nextIntString);
				nextIntString="";
				countRow++;
			}
			else if (line.charAt(i) != ' ') nextIntString += line.charAt(i); 
		}
		
		count += countRow;
		total += totalRow;
		
		double averageRow = (double)totalRow / (double)countRow;

		System.out.println("Line " + lineCount + " average temperature was " + averageRow + ".");
		lineCount++;
	}
	
	
}
