package e7;

import java.util.Scanner;


public class e7_3_SinglyLinkedLists{

    public static void main(String[] args){
    
        Scanner kb = new Scanner(System.in);
       String input = kb.nextLine();
     
       
        int distinction=0, pass=0, fail=0, invalid = 0;
        String numString = "";
        
        for (int i=0; i<= input.length(); i++)
        {

            int num;
            if ((i == input.length() || input.charAt(i) == ' ') && numString != "")
            {
                num = Integer.parseInt(numString);
                if (num == -1) break;
                else if (num < 0 || num > 100) invalid++;
                else if (num <= 49) fail++;
                else if (num <= 69) pass++;
                else distinction++;
                
                System.out.println("Input a mark: " + num);
                numString="";
            }
            else if (i != input.length()) numString += input.charAt(i);
        }
    
        //Assumng all are plural to save time.
        System.out.print("There are " + (distinction + pass + fail + invalid) + " students: ");
        System.out.print(distinction + " distinctions, ");
        System.out.print(pass + " passes, ");
        System.out.print(fail + " fails ");
        System.out.println(" (plus " + invalid + " invalid).");
    
        kb.close();
    }


}

