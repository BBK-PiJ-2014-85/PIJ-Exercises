/*2.1 a) Factorial
Write a small program with a method that calculates the factorial of
an integer number as seen in the notes.
Is it easy to do this both iteratively and recursively? Try both ways a
nd see which is more natural for you. If
one takes too long, try the other way.
2.2 b) Fibonacci
Write a small program with a method that calculates the n
th
element of the Fibonacci sequence as seen in the notes.
Is it easy to do this both iteratively and recursively? Try both ways a
nd see which is more natural for you. If
one takes too long, try the other way.
When doing it recursively, do it with and without memoization. Compare
the time that is needed in each case
to find F(40) or F(45).
2.3 c) Hanoi towers
A legend says that, somewhere in the East, near Hanoi, there is a te
mple. In the temple, there are three posts. In
the posts, there are 64 discs of 64 different sizes. When the world w
as created, all the discs were in the first post;
when all the discs are moved to the last post, the world will end.
The monks in the temple move the discs between posts, but they mus
t obey two simple rules. First, only one
disc can be moved at a time, from one post to another post (it canno
t be left anywhere else). Last, but not least,
a disc can only be placed on top of a bigger disc, never on top of a smalle
r disc. The smallest disc can be placed
on any post (all other discs are bigger); the biggest disc can only be
placed on an empty post.
Create a method that calculates the number of moves necessary t
o move a set of
n
Hanoi disks from the initial
post to the last post.
*/
import java.util.Scanner;
import java.lang.System.*;
import java.util.*;


public class e5_2_Classics{
    
   static Map<Integer,Integer> fibonacciMap  = new HashMap<Integer,Integer>();

    public static void main (String[] args){
        
        Scanner kb = new Scanner(System.in);
        
        System.out.print("Give a number: ");
        int n = kb.nextInt();
        
        // Int is maxed at 2^31 - 1, so this will fall over for not particularly large n
        //System.out.println(factorialIt(n));
        //System.out.println(factorialRec(n));
        
        long timeStart, timeFinish;
        
        timeStart = System.currentTimeMillis();
        System.out.println(fibonacciIt(n));
        timeFinish = System.currentTimeMillis();
        System.out.println("Using the iterative method took " + (timeFinish - timeStart) + " milliseconds.");
        
        timeStart = System.currentTimeMillis();
        System.out.println(fibonacciRec(n));
        timeFinish = System.currentTimeMillis();
        System.out.println("Using the recursive method without memoization took " + (timeFinish - timeStart) + " milliseconds.");
        
        timeStart = System.currentTimeMillis();
        System.out.println(fibonacciRecMem(n));
        timeFinish = System.currentTimeMillis();
        System.out.println("Using the recursive method with memoization took " + (timeFinish - timeStart) + " milliseconds.");
    }

    public static int factorialRec(int n)
    {
        if(n == 1)
        {
            return 1;
        }
        else
        {
            return n * factorialRec(n-1);
        }
    }

    public static int factorialIt(int n)
    {
        int output = 1;
        
        for (int i = n; i>1; i--)
        {
            output *= i;
        }
        
        return output;
    }
    
    public static int fibonacciIt(int n)
    {
        int output = 1;
        int o_1 = 1;
        
        if (n<3)
        {
            return 1;
        }
        else
        {
        for (int i=3; i<= n; i++)
        {
            int temp = output;
            output+= o_1;
            o_1 = temp;
        }
            return output;
        }
        
    }
    
    public static int fibonacciRec(int n)
    {
        if (n==1 || n==2)
        {
            return 1;
        }
        else
        {
            return fibonacciRec(n-1) + fibonacciRec(n-2);
        }
    }
 
    public static int fibonacciRecMem(int n)
    {
        if (fibonacciMap.containsKey(n))
        {
            return fibonacciMap.get(n);
        }
        
        else if (n==1 || n==2)
        {
            fibonacciMap.put(n,1);
            return 1;
        }
        else
        {
            int output = fibonacciRecMem(n-1) + fibonacciRecMem(n-2);
            fibonacciMap.put(n,output);
            return output;
        }
    }

    
 
}