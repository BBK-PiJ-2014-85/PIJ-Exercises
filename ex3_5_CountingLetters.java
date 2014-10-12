// Write a program that reads some text from the user and then says
// how many letters ’e’ are there in that text.
// Then modify the program so that it reads the text from the user an
// d then asks for a letter. The program should
// then say how many times you can find the letter in the text.

import java.util.Scanner;

public class ex3_5_CountingLetters {
    
    public static void main(String[] args) {
        
        System.out.println("Please insert your line");
        Scanner kb = new Scanner (System.in);
        String input = kb.nextLine();
        
        int c=0;
        
        for (int i=0; i < input.length(); i++)
        {
            if (input.charAt(i) == 'e' || input.charAt(i) == 'E')
            {
                c++;
            }
        }

        
        System.out.println("There are " + c + " e's in that line.");
        
    }
    
}