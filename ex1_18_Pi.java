import java.util.Scanner;

public class ex1_18_Pi {
    public static void main(String[] args) {
        
        Scanner kb = new Scanner(System.in);
        System.out.println("How many terms to calculate Pi to?");
        int numTerms = kb.nextInt();
        kb.close();
        double Pi=0;
        
        for (int i=0; i < numTerms; i++)
        {
            Pi += getPiNthTerm(i);
        }
        
        System.out.println("Pi calculated to " + numTerms + " terms is " + Pi);
        
        int numTo3Digits = 0;
        int numTo10Digits = 0;
        double currentPi =0;
        int terms =1;
        
        while (numTo10Digits == 0)
        {
            currentPi += getPiNthTerm(terms-1);
            
            if (numTo3Digits == 0 && currentPi >=3.14 && currentPi < 3.15)
            {
                numTo3Digits = terms;
            }
            
            if (numTo10Digits == 0 && currentPi >=3.14159265358 && currentPi < 3.14159265359)
            {
                numTo10Digits = terms;
            }
            terms++;
        }
        
        System.out.println("It takes " + numTo3Digits + " terms to get the first 3 digits right");
        System.out.println("It takes " + numTo10Digits + " terms to get the first 10 digits right");
        
        /* Answer to digits question, the program provided this output when run:
         * 
         * 	It takes 119 terms to get the first 3 digits right
         *	It takes 1608612770 terms to get the first 10 digits right
         * 
         */
        
    }
    
    public static double getPiNthTerm(int k)
    {
        return 4 * Math.pow(-1, k) / (2 * k + 1);
    }
    
}
