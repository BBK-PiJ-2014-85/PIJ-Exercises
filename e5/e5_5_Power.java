/*Create a class with a static method
pow
that takes to integers (
base
and
exponent
) and calculates the power,
e.g.
pow(2,3)
calculates 2
3
.
Is it easy to do this both iteratively and recursively? */

public class e5_5_Power{

    public static void main (String[] args){
        
        System.out.println(PowerIt(2,3));
        System.out.println(PowerRec(2,3));
        System.out.println(PowerIt(10,5));
        System.out.println(PowerRec(10,5));
        
    }

    static int PowerIt(int base, int exp)
    {
        int output = 1;
        
        for (int i = 1; i <= exp; i++)
        {
            output *= base;
        }
        
        return output;
    }
    
    static int PowerRec(int base, int exp)
    {
    
        if (exp == 0)
        {
            return 1;
        }
        else
        {
            return base * PowerRec(base, exp - 1);
        }
    }

}