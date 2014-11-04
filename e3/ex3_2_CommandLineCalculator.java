// Write a program that reads a text representing a mathematical op
// eration (one of the four basic ones) with two
// operands, and then execute it. For example, if the user enters “3
// /5” the program outputs “0.6”; if the user
// enters “23 * 4” the program outputs “92”.
package e3;
import java.util.Scanner;

public class ex3_2_CommandLineCalculator{

    public static void main (String[] args){
        
        Scanner kb = new Scanner(System.in);
        
        //assume good input
        System.out.println("Input calculation:");
        String input = kb.nextLine();
        
        //first, find where the calculation is
    
        int opLocation =0;
        char operator =' ';
        
        for (int i=0; i < input.length(); i++)
        {
        if (input.charAt(i) == '+')
            {
                opLocation = i;
                operator = '+';
            }
        else if (input.charAt(i) == '-')
            {
                opLocation = i;
                operator = '-';
            }
        else if (input.charAt(i) == '*')
            {
                opLocation = i;
                operator = '*';
            }
        else if (input.charAt(i) == '/')
            {
                opLocation = i;
                operator = '/';
            }
        }
            
        if (operator != ' ')
            {
            
                String firstNumS = getStringNoSpace(input, 0, opLocation - 1);
                String secondNumS = getStringNoSpace(input, opLocation + 1, input.length() - 1);
                
                double firstNum = Double.parseDouble(firstNumS);
                double secondNum = Double.parseDouble(secondNumS);
            
            if (operator == '+')
            {
                System.out.println(firstNum + secondNum);
            }
            else if (operator == '-')
            {
                System.out.println(firstNum - secondNum);
            }
            else if (operator == '*')
            {
                System.out.println(firstNum * secondNum);
            }
            else if (operator == '/')
            {
                System.out.println(firstNum / secondNum);
            }
                
            }


    }
            
    private static String getStringNoSpace(String input, int start, int end)
        {
            String output ="";
            
            for (int i = start; i <= end; i++)
            {
                
            if (input.charAt(i) != ' ')
            {
                output += input.charAt(i);
            }
                
            }
            
            return output;
        }

            
            
            
            }