package e1;
import java.util.Scanner;

public class ex1_15_GuessMyNumber {

	public static void main(String[] args)
	{
		int numberToGuess = (int) Math.abs(1000 * Math.random());
		boolean found = false;
		int attempts = 0;
		
		Scanner kb = new Scanner(System.in);
		
		while (!found)
		{
			System.out.print("Please enter your guess (or q to quit): ");
			String input = kb.nextLine();
			
			if (input.length() > 0 && input.charAt(0) == 'q') 
			{
				System.out.println("Goodbye");
				break;
			}
			else
			{
				int inputInt = Integer.parseInt(input);
				attempts++;
				if (inputInt == numberToGuess)
				{
					found = true;
					System.out.println("Congrats, you've found the number");
					System.out.println("You took " + attempts + " attempts.");
				}
				else if (inputInt > numberToGuess) System.out.println("Lower!");
				else System.out.println("Higher!");
					
			}
		}
		
		
	}
	
}
