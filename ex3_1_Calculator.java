import java.util.Scanner;
import java.io.IOException;

public class ex3_1_Calculator {

    public static void main(String[] args) {
        
        int providedNums = 0;
        double[] numbers   =   new double[2];
        boolean exit = false;
        
        while (providedNums < 2 && !exit)
        {
            System.out.println("Please provide the " + (providedNums == 0 ? "1st " : "2nd ") + "number (q to quit)");
            Scanner kb = new Scanner(System.in);
            String input = kb.nextLine();
            
            if (input.equals("q"))
            {
                exit = true;
            }
            else
            {
                System.out.println(checkDouble(input));
                
                
                
          //  try
           // {
           //     numbers[providedNums]   = Double.parseDouble(input);
           //     providedNums++;
           // }
           // catch ()
            //    {
             //       System.out.println("Not a valid number");
              //  }
            }
            
        }
    }
    
        public static boolean checkDouble(String input)
        {
            int dotCount = 0;
            boolean validChars   =   true;
            boolean leastOneNum=false;
            
            for (int i = 0; i < input.length(); i++)
            {
                if (input.substring(i,i+1).equals("."))
                {
                    dotCount++;
                }
                else if (! (input.substring(i,i+1).equals("1") || input.substring(i,i+1).equals("2") || input.substring(i,i+1).equals("3")
                         || input.substring(i,i+1).equals("4") || input.substring(i,i+1).equals("5") || input.substring(i,i+1).equals("6")
                            || input.substring(i,i+1).equals("7") || input.substring(i,i+1).equals("8") || input.substring(i,i+1).equals("9")
                            || input.substring(i,i+1).equals("0")) )
                {
                    validChars = false;
                }
                else
                {
                    leastOneNum  =   true;
                }
                
            }
            
            return ( validChars && leastOneNum && dotCount < 2 ? true : false);
        }


}