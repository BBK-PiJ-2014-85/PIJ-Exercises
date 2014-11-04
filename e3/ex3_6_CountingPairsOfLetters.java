// Write a program that reads a short string and then some longer tex
// t. The program must say how many times you
// can find the short string in the text. You cannot use any method of
// String apart from
// charAt()
// and
// length()
package e3;
import java.util.Scanner;

public class ex3_6_CountingPairsOfLetters{

    public static void main(String[] args){
        
        System.out.println("Please insert your line");
        Scanner kb = new Scanner (System.in);
        String line = kb.nextLine();
        
        System.out.println("Please insert the string to check for");
        String letters = kb.next();
        
        int lettersLength = letters.length();
        
        int c=0;
        
        for (int i=0; i < line.length() - lettersLength + 1; i++)
        {
            boolean stringMatch = true;
            
            for (int j=0; j < lettersLength; j++)
            {
                if (Character.toLowerCase(line.charAt(i+j)) != Character.toLowerCase(letters.charAt(j)))
                {
                    stringMatch = false;
                }
                
            }
            
            if (stringMatch)
            {
                c++;
            }
        }
        
        
        System.out.println("There are " + c + " " + letters + "'s in that line.");
        

        
        
        
    }







}