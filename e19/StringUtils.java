package e19;

public class StringUtils {

	public static int eChecker(String s1, String s2)
	{
		if (s1.charAt(0) != 'e' && s2.charAt(0) == 'e') return 1; 
		else return 0;
	}
	
	public static String betterString(String s1, String s2, TwoStringsPredicate l)
	{
		return (l.better(s1, s2) ? s1 : s2);
	}
	
	public static <T> T betterEntry(T e1, T e2, TwoElementsPredicate<T> l)
	{
		return (l.better(e1,e2) ? e1 : e2);
	}
	
}
