package e19;

import java.util.Arrays;
import java.util.Comparator;

public class Lambda1 {


	
	public static void main (String[] args)
	{
		String [] array = new String[] {"First","Second","Third","Fourth","eBegin","Sixth"};
		
		Comparator<String> lengthIncreasing = (s,t) -> (s.length() - t.length());
		Comparator<String> lengthDecreasing = (s,t) -> (t.length() - s.length());
		Comparator<String> firstChar = (s,t) -> Character.compare(s.charAt(0),t.charAt(0));
		Comparator<String> eFirst = (s,t) -> {if (s.charAt(0) != 'e' && t.charAt(0) == 'e') return 1; else return 0;};
		Comparator<String> eFirstMethod = StringUtils::eChecker;

		sortArray(array,lengthIncreasing);
		System.out.println("Length order increasing: " + Arrays.asList(array));
		sortArray(array,lengthDecreasing);
		System.out.println("Length order decreasing: " + Arrays.asList(array));
		sortArray(array,firstChar);
		System.out.println("Sorted by first character: " + Arrays.asList(array));
		sortArray(array,eFirst);
		System.out.println("'e' first, then everything else: " + Arrays.asList(array));
		
		sortArray(array,lengthIncreasing);
		sortArray(array,eFirstMethod);
		System.out.println("'e' first by method: " + Arrays.asList(array));
	
	}
	
	private static void sortArray(String[] array, Comparator<String> cp)
	{
		boolean sorted = false;
		
		while (!sorted)
		{
			sorted = true;
			
			for (int i = 0; i < (array.length - 1); i++)
			{
				if (cp.compare(array[i],array[i+1]) > 0)
				{
					String temp = array[i+1];
					array[i+1] = array[i];
					array[i] = temp;
					sorted = false;
				}
			}
		}
	}
	
	
	
}
