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
        int decimalNumber = binary2decimal(input);
       
        return Dec2Hex(decimalNumber);
        
    }
    
    static String Dec2Hex(int decimal)
    {
        int highestHexPower = 0, decimalValueRemaining = decimal;
        String hex = "0x";
        
        while (Math.pow(16,highestHexPower) <= decimal)
        {
            highestHexPower++;
        }
        
        for (int i = highestHexPower - 1; i >= 0; i--)
        {
            int nextHexNumber = (int) Math.floor(decimalValueRemaining / Math.pow(16,i));
            decimalValueRemaining -= (Math.pow(16,i) * nextHexNumber);
            hex += DecToHexChar(nextHexNumber);
        }
        
        return hex;
    }

    static String Hex2Bin(String input)
    {
        return "";
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

    static int hex2decimal(String hex)
    {
        int decimal = 0;
        for (int i = 0; i < hex.length() - 2; i++)
        {
            decimal += Math.pow(16,i) * (hex.charAt(hex.length() - 1 - i) == '1' ? 1 : 0);
        }
        
        return decimal;
    }
    
    static int HexCharToDec(char hexChar)
    {
    
        switch (hexChar) {
            case '0': return 0;
            case '1': return 1;
            case '2': return 2;
            case '3': return 3;
            case '4': return 4;
            case '5': return 5;
            case '6': return 6;
            case '7': return 7;
            case '8': return 8;
            case '9': return 9;
            case 'a': return 10;
            case 'b': return 11;
            case 'c': return 12;
            case 'd': return 13;
            case 'e': return 14;
            case 'f': return 15;
            default: return -1;
        }
        
    }

    static String DecToHexChar(int value)
    {
        
        switch (value) {
            case 0: return "0";
            case 1: return "1";
            case 2: return "2";
            case 3: return "3";
            case 4: return "4";
            case 5: return "5";
            case 6: return "6";
            case 7: return "7";
            case 8: return "8";
            case 9: return "9";
            case 10: return "a";
            case 11: return "b";
            case 12: return "c";
            case 13: return "d";
            case 14: return "e";
            case 15: return "f";
            default: return "X";
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

    
}