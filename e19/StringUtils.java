package e19;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

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
	
	public static List<String> allMatches(List<String> input, Predicate<String> p)
	{
		List<String> matches = 
						input.stream()
						.filter(x -> p.test(x))
						.collect(Collectors.toList())
						;
		
//		for (String s : input) if (p.test(s)) matches.add(s);
		
		return matches;

	}
	
}
