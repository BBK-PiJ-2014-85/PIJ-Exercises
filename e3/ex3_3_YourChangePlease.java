// Write a program that reads the total cost of a purchase and an am
// ount of money that is paid to buy it. Your
// program should output the correct change specifying the amount
// of notes (50, 20, 10, 5) and coins (2, 1, 0.50, 0.20,
// 0.10, 0.05, 0.02, 0.01) needed

// ASK: Best ways of dealing with floating arithmetic and the double being a little out
// BUG: Has big floating point issues

package e3;
import java.util.Scanner;

public class ex3_3_YourChangePlease {

    public static void main(String[] args) {
        
        double cost=0;
        double paid=0;
        boolean validCost = false, validPaid = false, quit = false;
        
        Scanner kb = new Scanner(System.in);
        
        while (!validCost && !quit)
        {
            System.out.println("Please input cost: ");
            String input = kb.nextLine();
            if (checkDouble(input))
            {
                cost = Double.parseDouble(input);
                validCost = true;
            }
            else if (input.equals("q"))
            {
                quit = true;
            }
            else
            {
                System.out.println("Invalid input. Please try again");
            }
        }

        while (!validPaid && !quit)
        {
            System.out.println("Please input paid amount: ");
            String input = kb.nextLine();
            if (checkDouble(input))
            {
                paid = Double.parseDouble(input);
                validPaid = true;
            }
            else if (input.equals("q"))
            {
                quit = true;
            }
            else
            {
                System.out.println("Invalid input. Please try again");
            }
        }

        if (!quit)
        {
            double change = paid - cost, toBePaid = change;
            
            if (change == 0)
            {
                System.out.println("Exact money provided.");
            }
            else if (change < 0)
            {
                System.out.println("Not enough money provided. Cheapskate!");
            }
            else
            {
                System.out.println("You are owed £" + change);
                int num;
                
                System.out.println("Notes:");
                toBePaid = getNumberCoins(toBePaid,50);
                toBePaid = getNumberCoins(toBePaid,20);
                toBePaid = getNumberCoins(toBePaid,10);
                toBePaid = getNumberCoins(toBePaid,5);
                
                System.out.println("");
                
                System.out.println("Coins:");
                toBePaid = getNumberCoins(toBePaid,1);
                toBePaid = getNumberCoins(toBePaid,0.5);
                toBePaid = getNumberCoins(toBePaid,0.2);
                toBePaid = getNumberCoins(toBePaid,0.1);
                toBePaid = getNumberCoins(toBePaid,0.05);
                toBePaid = getNumberCoins(toBePaid,0.02);
                toBePaid = getNumberCoins(toBePaid,0.01);
            
            }
        
        
        }
        
        
    }
    
    public static double getNumberCoins(double changeDue, double denomination)
    {
        int c=0;
        
    while (changeDue >= denomination)
    {
        changeDue -= denomination;
        c++;
    }
        System.out.println("      £" + denomination + ": " + c);
        
        return changeDue;
    }
    
    
    
    public static boolean checkDouble(String input)
    {
        int dotCount = 0;
        boolean validChars   =   true;
        boolean leastOneNum=false;
        
        for (int i = 0; i < input.length(); i++)
        {
            if (input.substring(i,i+1).equals("."))
            {
                dotCount++;
            }
            else if (! (input.substring(i,i+1).equals("1") || input.substring(i,i+1).equals("2") || input.substring(i,i+1).equals("3")
                        || input.substring(i,i+1).equals("4") || input.substring(i,i+1).equals("5") || input.substring(i,i+1).equals("6")
                        || input.substring(i,i+1).equals("7") || input.substring(i,i+1).equals("8") || input.substring(i,i+1).equals("9")
                        || input.substring(i,i+1).equals("0")) )
            {
                validChars = false;
            }
            else
            {
                leastOneNum  =   true;
            }
            
        }
        
        return ( validChars && leastOneNum && dotCount < 2 ? true : false);
    }


}