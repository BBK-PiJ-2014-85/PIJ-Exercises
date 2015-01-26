package e15;


import java.util.Scanner;

public class Ex3bErrorHandlingOnInput {

	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		

		System.out.println("Please input the number of numbers to add: ");
		int[] values = new int[getInt(kb)];
		
		for (int i = 0; i < values.length; i++) 
		{
			System.out.print("Please input a number: ");
			values[i] = getInt(kb);
		}
			
		
		System.out.print("You entered values: ");
		
		for (int value : values) System.out.print(value + ", ");
		
		kb.close();
		
	}
	
	private static int getInt(Scanner scan)
	{
		boolean errorFound = true;
		int rtn = 0;
		while (errorFound) 
			{
			Num n = getIntAttempt(scan);
			errorFound = n.error;
			rtn = n.num;
			}
		
		return rtn;
	}
	
	private static Num getIntAttempt(Scanner scan)
	{		
		try{
			System.out.println("Please input a number:");
			String nextIntString = scan.next();
			int i = (int) Integer.parseInt(nextIntString);
			return new Num(false, i);
			}
		catch (NumberFormatException e)
		{
			System.out.println("Not a valid integer. Please try again.");
			return new Num(true, 0);
		}
	}
	
}

class Num{
	int num;
	boolean error;
	
	public Num(boolean err, int i)
	{
		error = err;
		num = i;
	}
	
}