package e19;

public class StringUtils {

	public static int eChecker(String s1, String s2)
	{
		if (s1.charAt(0) != 'e' && s2.charAt(0) == 'e') return 1; 
		else return 0;
	}
	
}
