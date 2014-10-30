
import java.util.Scanner;

class e6_7_BigEnough{

public static void main (String[] args){

    EmployeeDatabase eD = new EmployeeDatabase();
    Scanner kb = new Scanner (System.in);
    int c=0;
    boolean abort = false;
    String nextName="";
    int nextID;
    
    while (!abort)
    {
        if (c % 2 == 0)
        {
            System.out.print("Enter employee name: ");
            nextName = kb.nextLine();
            if (nextName.equals("")) {abort = true;}
        }
        else
        {   System.out.print("Enter employe ID: ");
            nextID = kb.nextInt();
            if (nextID == 0) {abort = true;}
            else {eD.addItem(nextName, nextID);}
        }
    
        c++;
    }

    eD.printSorEven();

}



}