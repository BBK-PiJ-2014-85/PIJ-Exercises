package e8;

public class HashUtilities {

	public static int shortHash(int input)
	{
		return Math.abs(input) % 1000;
	}
	
}
