/* Binary numbers can be quite long. A 32-bit memory address looks like 1
001 0101 0110 1010 1011 0010 1001
1010, which is difficult to handle. That is why memory addresses and ot
her binary numbers are usually written as
hexadecimal
numbers. An hexadecimal number is a base-16 number, with digits be
tween 0 and f (f is equivalent to
decimal 15, e is equivalent to decimal 14, and so on). An hexadecimal
number is equivalent to a four-digit binary
number, which makes them quite compact. The former address rea
ds 956ab29a, which is easier to read and write.
To prevent confusion with decimal numbers, hexadecimal numbers
are usually prefixed by “0x”, as in 0x95 (which
is 149) or 0xff (which is 255).
Write a program that takes a String. The string can be a decimal or a
hexadecimal number (starting by “0x”).
Your program must recognise the number as what it is and convert it
to the other base. Use two methods for
conversion as in the former exercise.*/
package e4;
import java.util.Scanner;

public class e4_5_BinaryAndHexidecimal {

    public static void main (String[] argss){
        
        boolean isHex = false;
        String input ="";
        
          Scanner kb = new Scanner(System.in);
        
        System.out.print("Please enter a binary of hexidecimal number: ");
        input= kb.next();
        
        if (input.substring(0,2).equals("0x"))
        {
            isHex = true;
            System.out.println("Hexidecimal number entered.");
            System.out.println("In binary: " + Hex2Bin(input));
        }
        else
        {
            System.out.println("Binary number detected");
            System.out.println("In hexidecimal " + Bin2Hex(input));
        }
    
        
    }
    
    static String Bin2Hex(String input)
    {
 
        //take last 4 to convert into hex, using zeros if less than 4 remai
        
        String hex = "0x";
        
        while (input.length() % 4 != 0)
        {
            input = "0" + input;
        }
        
        int i=0;
        
        while (i < input.length())
        {
            hex += Bin4BitToHex(input.substring(i, i+4));
            i+=4;
        }
        
        return hex;
    }
    

    static String Hex2Bin(String input)
    {
        
        input = input.substring(2);
        String binary="";

        for (int i = 0; i < input.length(); i++)
        {
            binary += HexToBin4Bit(input.charAt(i));
        }
        
        while (binary.charAt(0) == '0')
        {
            binary = binary.substring(1);
        }
        
        return binary;
    }
    
    static String Bin4BitToHex(String binBit)
    {
        switch (binBit){
                case "0000": return "0";
                case "0001": return "1";
                case "0010": return "2";
                case "0011": return "3";
                case "0100": return "4";
                case "0101": return "5";
                case "0110": return "6";
                case "0111": return "7";
                case "1000": return "8";
                case "1001": return "9";
                case "1010": return "a";
                case "1011": return "b";
                case "1100": return "c";
                case "1101": return "d";
                case "1110": return "e";
                case "1111": return "f";
                default: return "X";
        }
    }

    static String HexToBin4Bit(char hexChar)
    {
        switch (hexChar){
            case '0': return "0000";
            case '1': return  "0001";
            case '2': return  "0010";
            case '3': return  "0011";
            case '4': return  "0100";
            case '5': return  "0101";
            case '6': return  "0110";
            case '7': return  "0111";
            case '8': return  "1000";
            case '9': return  "1001";
            case 'a': return  "1010";
            case 'b': return  "1011";
            case 'c': return  "1100";
            case 'd': return  "1101";
            case 'e': return  "1110";
            case 'f': return  "1111";
            default: return "X";
        }
    }

    
}