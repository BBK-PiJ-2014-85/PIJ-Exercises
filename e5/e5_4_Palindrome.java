/*Create a program with a (recursive) method that takes a String pa
remeter and returns true if the String is a
palindrome and false otherwise. Compare this recursive version with
the iterative version you wrote in past weeks.
Which one seems clearer to you?*/


public class e5_4_Palindrome{

    public static void main (String[] args)
    {
        System.out.println(isPalindrome("boo"));
        System.out.println(isPalindrome("racecar"));
        System.out.println(isPalindrome("o"));
        
    }

    static boolean isPalindrome(String input)
    {
       return  isPalindromeRec((int)(input.length() / 2) - 1, input);
    
    }

    static boolean isPalindromeRec(int n, String input)
    {
    
        if (n==-1)
        {
            return true;
        }
        else
        {
            return (input.charAt(n) == input.charAt(input.length() - n - 1)) && isPalindromeRec(n-1, input);
        }
        
    }

}