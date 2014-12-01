package e10;

public class MobilePhone extends OldPhone {

	private String[] lastCalls = new String[10];
	
	public void ringAlarm() {System.out.println ("Get up!");}
	public void playGame(String game) {System.out.println("You are playing " + game);}
	
	@Override
	public void call(String number)
	{
		for (int i = 0; i < 9; i++)
		{
			lastCalls[9-i] = lastCalls[8 - i];
		}
		
		lastCalls[0] = number;
		
		super.call(number);
	}
	
	public void printLastNumbers()
	{
		if (lastCalls[0] == null) {System.out.println("No calls made.");}
		else 
		{
			System.out.println("Last calls made:");
			for (String s: lastCalls)
			{
				if (s != null) System.out.println(s);
			}
		}
	}
}
