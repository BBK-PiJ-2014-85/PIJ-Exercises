//Write a program that reads a text from the user and then enter a lo
//op of requesting letters and counting them.
//The program stops if the user asks for the same letter twice. This is
//an example of the output of such a program
//(with a rather short and boring text):
package e3;
import java.util.Scanner;

public class ex3_7_CountingLettersRedux {

    public static void main(String[] args){
        
        System.out.println("Please insert your line");
        Scanner kb = new Scanner (System.in);
        String line = kb.nextLine();
        boolean repeat = false;
        String soFar = "";
        
        while (!repeat)
        {
            System.out.println("Please insert the letter to check: ");
            char input = kb.next().charAt(0);
            
            if (howManyTimes(soFar, input) == 1)
            {
                System.out.println("This leter has already been chosen. Quitting.");
                repeat = true;
            }
            else
            {
                System.out.println("The letter " + input + " features " + howManyTimes(line, input) + " times");
                soFar += input;
            }
            
        
        
        }
        
        
        
    }

    private static int howManyTimes(String line, char letter)
    {
        int c =0;
        
        for (int i=0; i < line.length(); i++)
        {
            if (Character.toLowerCase(line.charAt(i)) == Character.toLowerCase(letter) )
            {
                c++;
            }
        }
    
        return c;
    }


}