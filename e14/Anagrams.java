package e14;

import java.util.ArrayList;
import java.util.List;


public class Anagrams {

static int wordLength;
	
public static List<String> Anagram(String input)
{
	List<String> thisList = new ArrayList<String>();

	wordLength = input.length();
	
	if (wordLength == 0) return null;

	thisList.add("" + input.charAt(0));
	
	if (wordLength == 1) return thisList;

	return createAnagram(thisList, input.substring(1));

}

private static List<String> createAnagram( List<String> listSoFar, String inputRemaining)
{
	List<String> nextList = new ArrayList<String>();
	char letter = inputRemaining.charAt(0);

	for (String word : listSoFar)
	{

		for (int i = 0; i <= word.length() ; i++)
		{
			nextList.add(addToWord(i,0,letter, word, ""));
		}	
	}
	
	if (inputRemaining.length() == 1) return nextList;

	return createAnagram(nextList,inputRemaining.substring(1));

}

private static String addToWord(int i, int added, char letter,String word, String wordSoFar)
{
	if (wordSoFar.length() == i) wordSoFar += letter;
	if (wordSoFar.length() < (word.length() + 1)) wordSoFar += word.charAt(added);
	added++;
	
	if (wordSoFar.length() < (word.length() + 1)) return addToWord(i,added,letter,word,wordSoFar);
	
	return wordSoFar;
	
}

public static void main (String[]args)
{
	System.out.println(addToWord(2,0,'w', "ord", ""));
}
	
	
	
	
	
}
