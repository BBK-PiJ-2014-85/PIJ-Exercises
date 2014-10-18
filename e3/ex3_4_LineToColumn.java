// Write a program that reads some text from the user and then write
// s the same text on screen, but each letter on a
// different line.
// Now modify your program to write each word (as defined by spaces)
// rather than letter on a different line

import java.util.Scanner;

public class ex3_4_LineToColumn {

 public static void main(String[] args) {

     System.out.println("Please insert your line");
     Scanner kb = new Scanner (System.in);
     String input = kb.nextLine();
     
     for (int i=0; i < input.length(); i++)
     {
         if (input.charAt(i) == ' ')
             {
             System.out.println();
            }
            else
             {
         System.out.print(input.charAt(i));
             }
    }


}

}