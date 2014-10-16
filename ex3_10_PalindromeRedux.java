//A strict palindrome is difficult to see in every day language. A relaxed pa
//lindrome, a text that is a palindrome if
//you ignore punctuation marks such as commas or spaces, is easier t
//o see. Examples include “A man, a plan, a canal
//- Panama!”, “Was it a car or a cat I saw?”, and “Rise to vote, sir”.
//Write a program that reads a text from the user and then says whe
//ther the text is a relaxed palindrome. Note
//that all strict palindromes are relaxed palindromes by definition

import java.util.Scanner;

public class ex3_10_PalindromeRedux{

    public static void main(String[] args)
    {
    
        
        System.out.println("Please insert your line");
        Scanner kb = new Scanner (System.in);
        String line = kb.nextLine();
    
        boolean checkedAll = false, isPalindrome = true;
        int i=0, j=0;
        
        while (!checkedAll)
        {
        
            while (!Character.isLetter(line.charAt(i))) {i++;}
            while (!Character.isLetter(line.charAt(line.length() - 1 - j))) {j++;};
            
            if (i >= line.length() - 1 - j)
                   {
                       checkedAll= true;
                   }
            else if (Character.toLowerCase(line.charAt(i)) != Character.toLowerCase(line.charAt(line.length() - 1 - j)))
                    {
                        isPalindrome = false;
                    }
        
            i++;
            j++;
        }
    
                     System.out.println("That is " + (isPalindrome ? "" : "not ") + "a relaxed palindrome");
    
    
    
    }




}