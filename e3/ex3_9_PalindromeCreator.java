
//Write a program that reads a text and then writes on the screen a p
//alindrome by writing the same text followed
//by the same text in reversed order. For example, if the user enter
//s the text “It was a dark and stormy night” the
//program must output “It was a dark and stormy nightthgin ymrots
//dna krad a saw tI”.
package e3;
import java.util.Scanner;

public class ex3_9_PalindromeCreator{

    public static void main(String[] args){
        
        System.out.println("Please provide an expression:");
        
        Scanner kb = new Scanner(System.in);
        String input = kb.nextLine();
        String output = input;
        
        for(int i=input.length() - 1; i >= 0; i--)
        {
            output += input.charAt(i);
        }
        
        System.out.println(output);
        
        
    }


}