package e1;

import java.util.Scanner;

public class ex1_17_ClosestPrime {
    // uses isPrime for determining a prime number from within the functions class
    
    public static void main(String[] args) {
        
        Scanner kb = new Scanner(System.in);
        System.out.println("Insert a number to find the nearest prime:");
        int num = kb.nextInt();
        kb.close();
        
        if (num <=2)
        {
            System.out.println("The nearest prime to " + num + " is 2.");
        }
        else if (isPrime(num))
        {
            System.out.println("The number given, " + num + ", is prime.");
        }
        else
        {
            boolean primeFound = false;
            int distance = 1;
            
            while (!primeFound)
            {
                if (isPrime(num + distance) || isPrime(num - distance))
                {
                    primeFound = true;
                }
                else
                {
                    distance++;
                }
            }
            
            if (isPrime(num + distance) && isPrime(num - distance))
            {
                System.out.println("There are two primes both " + distance + " from " + num + ": " + (num + distance) + " and " + (num - distance) + "." );
            }
            else if (isPrime(num + distance))
            {
                System.out.println("The nearest prime to " + num + " is " + (num + distance));
            }
            else
            {
                System.out.println("The nearest prime to " + num + " is " + (num - distance));
            }
        }
        
    }
    public static boolean isPrime(int checkInt)
    {
        boolean found = false;
        int i = checkInt -1;
        
        
        while (!found && i > 1)
        {
            if (checkInt % i == 0)
            {
                found = true;
            }	
            i--;
        }
        
        return !found;
    }
}
