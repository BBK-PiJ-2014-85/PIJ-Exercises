package e15;


import java.util.Scanner;

public class Ex3aErrorHandlingOnInput {

	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		int numsInput = 0;
		int[] values = new int[10];
		
		while (numsInput < 10)
		{
		try{
			System.out.println("Please input a number:");
			String nextIntString = kb.next();
			values[numsInput] = (int) Integer.parseInt(nextIntString);
			numsInput++;
		}
		catch (NumberFormatException e)
		{
			System.out.println("Not a valid integer. Please try again.");
		}
		}
		
		System.out.print("You entered values: ");
		
		for (int value : values) System.out.print(value + ", ");
		
		kb.close();
		
	}
	
}
