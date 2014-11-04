
//Write a program that asks the user for the total amount borrowe
//d for a mortgage, the number of years to pay it
//back, and the interest rate (in this exercise, we assume it is a fixed r
//ate). The program can then calculate how
//much must be paid at the end
package e4;
import java.util.Scanner;

public class e4_3_PracticeDoubles{
    
    public static void main (String[] args){
        
        double borrowed, rate;
        int years;
        
        Scanner kb = new Scanner(System.in);
        
        System.out.print("How much was borrowed? ");
        borrowed = kb.nextDouble();
  
        System.out.print("Over how many years? ");
        years = kb.nextInt();

        System.out.print("Whats the interest rate? ");
        rate = kb.nextDouble();
        
        //Formulas doesnt appear to make sense, will need to give more thought
            // its crude and assumes interet rate provided is over full period, but is sufficient for this exercise
            // I've just rounded, rather than taking the extra penny if required and distributing over the years
            //  due to that not really being part of the exercise
        double total = borrowed * ( 1 + rate / 100);
        double yearlyPayment = total/years;
        
        System.out.printf("The total amount to be paid is: £%.2f, \n", total);
        System.out.printf("at a yearly amount of £%.2f,\n", total / years);
        System.out.println("and the interest will be paid off after " + Math.round(Math.ceil((total - borrowed ) / yearlyPayment)) + " years"  );
        //System.out.printf("%.2f", borrowed);
        
        
    }
    
    
    
}

