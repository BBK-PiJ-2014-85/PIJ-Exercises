
package e1;
import java.util.Scanner;

public class ex1_12_NumberPyramids {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        int thisInt = 0;
        Scanner kb = new Scanner(System.in);
        System.out.println("How high would you like the pyramid to go?");
        
        if (kb.hasNextInt())
        {
            thisInt=kb.nextInt();
        }
        else
        {
            System.out.println("Not a valid integer.");
            ex1_12_NumberPyramids.main(args);
        }
        
        kb.close();
        
        if (thisInt == -1)
        {
            System.out.println("Process cancelled");
        }
        else if (thisInt > 0)
        {
            System.out.println("Number pyramid up to " + thisInt + ":");
            
            int currentInt=1;
            
            while (currentInt <= thisInt)
            {
                for (int i=1;i<=currentInt;i++)
                {
                    System.out.print(currentInt);
                }
                System.out.println(" ");
                currentInt++;	
            }
            
        }
        
        
        
    }
    
}
