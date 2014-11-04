// Write a program that reads some text from the user and then says
// how many letters ’e’ are there in that text.
// Then modify the program so that it reads the text from the user an
// d then asks for a letter. The program should
// then say how many times you can find the letter in the text.
package e3;
import java.util.Scanner;

public class ex3_5_CountingLetters {
    
    public static void main(String[] args) {
        
        System.out.println("Please insert your line");
        Scanner kb = new Scanner (System.in);
        String line = kb.nextLine();
        
        System.out.println("Please insert the letter to check for (first charcter will be taken)");
        String letter = kb.next();
        
        char letterChar = Character.toLowerCase(letter.charAt(0));
        
        int c=0;
        
        for (int i=0; i < line.length(); i++)
        {
            if (Character.toLowerCase(line.charAt(i)) == letterChar )
            {
                c++;
            }
        }

        
        System.out.println("There are " + c + " " + letterChar + "'s in that line.");
        
    }
    
}