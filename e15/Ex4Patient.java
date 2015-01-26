package e15;

import java.util.Scanner;

public class Ex4Patient {
	
	public static void main (String[] args)
	{
		String name;
		int age;
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please input your name: ");
		name = kb.next();
		
		System.out.println("Please input your age: ");
		age = getInt(kb);
		
		System.out.println("Your name is " + name + " and you are " + age + " years old");
		
	}
	
	
	private static int getInt(Scanner scan)
	{
		boolean errorFound = true;
		int rtn = 0;
		while (errorFound) 
			{
			ex4Num n = getIntAttempt(scan);
			errorFound = n.error;
			rtn = n.num;
			}
		
		return rtn;
	}
	
	private static ex4Num getIntAttempt(Scanner scan)
	{		
		try{
			System.out.print("Please input a number:");
			String nextIntString = scan.next();
			int i = (int) Integer.parseInt(nextIntString);
			if (i < 0 || i > 100) throw new IllegalArgumentException();
			return new ex4Num(false, i);
			}
		catch (NumberFormatException e)
		{
			System.out.println("Not a valid integer. Please try again.");
			return new ex4Num(true, 0);
		}
		catch (IllegalArgumentException e)
		{
			System.out.println("Age too high (>100) or low (<0), please try again.");
			return new ex4Num(true,0);
		}
		
	}
	
}

class ex4Num{
	int num;
	boolean error;
	
	public ex4Num(boolean err, int i)
	{
		error = err;
		num = i;
	}
	
}
