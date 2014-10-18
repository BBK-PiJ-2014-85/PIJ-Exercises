
//Write a program that asks the user for the total amount borrowe
//d for a mortgage, the number of years to pay it
//back, and the interest rate (in this exercise, we assume it is a fixed r
//ate). The program can then calculate how
//much must be paid at the end

import java.util.Scanner;

public class e4_4_PracticeDoubles{
    
    public static void main (String[] args){
        
        double borrowed;
        int years, rate;
        
        Scanner kb = new Scanner(System.in);
        
        System.out.print("How much was borrowed? ");
        borrowed = kb.nextDouble();
  
        System.out.print("Over how many years? ");
        years = kb.nextInt();

        System.out.print("Whats the interest rate? ");
        rate = kb.nestDouble();
        
        
        
        
    }
    
    
    
}

