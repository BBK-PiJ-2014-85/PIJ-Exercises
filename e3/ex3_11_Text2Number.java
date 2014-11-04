//Write a program that reads a number with commas and decimal dots (
//such as “23,419.34”) and then prints a
//number that is half of it. Do not use
//Double.parseDouble()
//.
//If you were writing a simple spreadsheet, you could use this code to p
//arse the input in the cells.

// TODO: Need to tidy up output removing commas where not required
package e3;
import java.util.Scanner;

public class ex3_11_Text2Number {

    public static void main(String[] args){
        
        
        boolean error = false;
        String output ="";
        
        System.out.println("Please input a number with ,'s and .'s :");
        
        Scanner kb = new Scanner(System.in);
        String input = kb.nextLine();
        
        int i=0;
        boolean carryingOver = false;
        
        while (!error && i < input.length())
        {
            
        char value = input.charAt(i);
            
        if (i==0 && value == '-')
        {
            output += value;
        }
        else if (value == ',')
        {
            output+= value;
        }
        else if (value == '.')
        {
            output += value;
        }
        else if (getHalfNumber(value, carryingOver) == 'e')
        {
            error = true;
        }
        else
        {
            output += getHalfNumber(value, carryingOver);
            carryingOver = isOdd(value);
        }
            
            i++;
        }
        
        if (carryingOver)
        {
        output += '5';
        }
        
        System.out.println(output);

        
    }
               
    public static boolean isOdd(char value)
    {
         if (value == '1' || value == '3' || value == '5' || value == '7' || value == '9')
         {
             return true;
         }
         else
         {
             return false;
         }
    }
    
    public static char getHalfNumber(char i, boolean carryOver)
    {
            if (!carryOver)
            {
        switch (i) {
            case '0': return '0';
              //  break;
            case '1': return '0';
              //  break;
            case '2': return '1';
              //  break;
            case '3': return '1';
              //  break;
            case '4': return '2';
              //  break;
            case '5': return '2';
              //  break;
            case '6': return '3';
              //  break;
            case '7': return '3';
              //  break;
            case '8': return '4';
              //  break;
            case '9': return '4';
              ///  break;
            default: return 'e';
              //  break;
        }
            }
            else
            {
                switch (i) {
                    case '0': return '5';
                //        break;
                    case '1': return '5';
                  //      break;
                    case '2': return '6';
                    //    break;
                    case '3': return '6';
                      //  break;
                    case '4': return '7';
                       // break;
                    case '5': return '7';
                 //       break;
                    case '6': return '8';
                //        break;
                    case '7': return '8';
                //        break;
                    case '8': return '9';
               //         break;
                    case '9': return '9';
              //          break;
                    default: return 'e';
             //           break;
                }
            }
            
    
    }

}



