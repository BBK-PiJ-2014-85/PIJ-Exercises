
public class ex1_14_To1000Primes {
    
    public static void main(String[] args) {
        int c = 0, i=1;
        
        while (c < 1000)
        {
            if (isPrime(i))
            {
                System.out.println(i);
                c++;
            }
            i++;
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
