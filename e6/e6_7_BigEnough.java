
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
            if (c != 0) {nextName = kb.nextLine();} // nextInt doesnt take the new line part, so this removes it
            nextName = kb.nextLine();
            if (nextName.equals("")) {System.out.println("In here: " + nextName); abort = true;}
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