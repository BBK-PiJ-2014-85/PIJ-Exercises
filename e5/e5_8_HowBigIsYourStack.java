/*Write a method that calculates the maximum size of the stack (measu
red in method calls) by forcing a
StackOverflowError
.
Use different methods, which different number and types of local va
riables, and see how the number of maximum
function calls changes.*/


public class e5_8_HowBigIsYourStack{

    static int method1 =0;
    static int method2 =0;
    static int method3 = 0;
    static int method4=0;
    
    public static void main(String[] args){
        
        try {method1();}
        catch(StackOverflowError e)
        {System.out.println("Size of stack was " + method1 + " method 1's");}

        try {method2();}
        catch(StackOverflowError e)
        {System.out.println("Size of stack was " + method2 + " method 2's");}

        method1=0;
        
        try {method1();}
        catch(StackOverflowError e)
        {System.out.println("Size of stack was " + method1 + " method 1's");}

        try {method3();}
        catch(StackOverflowError e)
        {System.out.println("Size of stack was " + method3 + " method 3's");}
        try {method4();}
        catch(StackOverflowError e)
        {System.out.println("Size of stack was " + method4 + " method 4's");}
        
    }

    static void method1()
    {
        method1++;
        method1();
    }
    
    static void method2()
    {
        method2++;
        method2--;
        method2++;
        method2();
    }
    
    static void method3()
    {
        String c = null;
        method3++;
        method3();
    }
    
    static void method4()
    {
        int c = 5;
        method4++;
        method4();
    }


}