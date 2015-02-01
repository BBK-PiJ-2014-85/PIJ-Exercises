package e15;

import java.util.Scanner;

public class Ex6_YourFirstException {

	public static void main(String[] args) throws checkException
	{
		Ex6_YourFirstException ex = new Ex6_YourFirstException();
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Input:");
		System.out.println("1 to throw runtime in a try block");
		System.out.println("2 to throw runtime out a try block");
		System.out.println("3 to throw checked in a try block");
		System.out.println("4 to throw checked out a try block");
		int num = kb.nextInt();
		
		ex.launch(num);
	}
	
	public void launch(int num) throws checkException
	{
		if (num == 1)
		{
			try {
				throw new runException("Runtime exception in a try block thrown");
			}
			catch (runException ex)
			{
				System.out.println(ex.getMessage());
			}
		}
		else if (num == 2)
		{
			throw new runException("Runtime exception out a try block thrown");
		}
		else if (num == 3)
		{
			try {
				throw new checkException("Checked exception in a try block thrown");
			}
			catch (checkException ex)
			{
				System.out.println(ex.getMessage());
			}
		}
		else if (num == 4)
		{
			throw new checkException("Checked exception out of try block thrown");
		}
	}

	class runException extends RuntimeException{
		
		public runException(String msg)
		{
			super(msg);
		}
	}
	
	class checkException extends Exception{
		
		public checkException(String msg)
		{
			super(msg);
		}
	}
}





