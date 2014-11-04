
//A palindrome is a word, phrase, number, or other sequence of units
//that may be read the same way in either
//direction. Examples of strict palindromes include “ABBA”, “madam”,
//“radar”, “kayak”, and “step on no pets”.
//Write a program that reads a text and detects whether the text is
//a strict palindrome
package e3;
import java.util.Scanner;

public class ex3_8_Palindrome {
    
    public static void main(String[] args){
        
        boolean isPalindrome    =    true;
        
        System.out.println("Please provide an expression:");
        
        Scanner kb = new Scanner(System.in);
        String input = kb.nextLine();
        
        //assumed capitals are not the same as lower case
        
        for (int i = 1; i <= Math.floor(input.length() / 2); i++)
        {
        if (isPalindrome && input.charAt(i-1) != input.charAt(input.length() - i))
            {
                isPalindrome = false;
            }
        }
        
        System.out.println("This is" + (isPalindrome ? " " : " not ") + "a Palindrome");
        
    }


}