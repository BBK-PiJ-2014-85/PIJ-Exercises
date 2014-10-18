
public class ex1_13_PrimesTo1000 {
    // Extra exercises number 1_13
    // Produces all the primes up to 1000
    
    public static void main(String[] args) {
        
        for (int i = 1; i <= 1000; i++)
        {
            if (isPrime(i))
            {
                System.out.println(i);
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
