//Create a program in which you define the following methods:
//binary2decimal(String):
//takes from the user a binary number (with digits 0 and 1) and return
//s the corresponding
//number in decimal (base-10, with digits between 0 and 9). decimal2binary(int):
//the opposite of the previous one: takes a decimal number and retu
//rns the corresponding
//binary number. Hint: instead of multiplying by 2, you will need to divide b
//y two this time.
//The program must offer a menu to the user with two options. The firs
//t one takes a binary number from the
//user and returns the corresponding decimal number. The second
//one does the opposite: takes a decimal number
//and returns a binary number. The program should use the methods
//defined.
package e4;
import java.util.Scanner;

public class e4_4_BinaryAndDecimal{

    public static void main (String[] args) {
        
        int type = 0;

        
        Scanner kb = new Scanner(System.in);
        
        
        System.out.println("Please enter:");
        System.out.println("     1 to convert from binary to decimal");
        System.out.println("     2 to convert from decimal to binary");
        System.out.println("     -1 to quit");
        
        while (type != -1 && type != 1 && type != 2)
        {
         type =kb.nextInt();
        }
        
        if (type == 1)
        {
            System.out.print("Insert binary number: ");
            String binary = kb.next();
            System.out.println("In decimal: " + binary2decimal(binary));
        }
        else if (type==2)
        {
            System.out.print("Insert decimal number: ");
            int number = kb.nextInt();
            System.out.println("In binary: " + decimal2binary(number));
        }
        
        
        
        
        
        
        
        
        
    }

    static String decimal2binary(int number)
    {
        int highestPower = 0;
        String output = "";
        
        while (Math.pow(2,highestPower) <= number)
        {
            highestPower++;
        }
        
        int remainingNumber = number;
        
        for (int i = highestPower - 1; i >=0; i--)
        {
        if (Math.pow(2,i) <= remainingNumber)
        {
            output += "1";
            remainingNumber -= Math.pow(2,i);
        }
        else
        {
            output +="0";
        }
        
        }
        
        return output;
    }
    
    static int binary2decimal(String binary)
    {
        int decimal = 0;
        for (int i = 0; i < binary.length(); i++)
        {
            decimal += Math.pow(2,i) * (binary.charAt(binary.length() - 1 - i) == '1' ? 1 : 0);
        }
        
        return decimal;
    }
    
    
}