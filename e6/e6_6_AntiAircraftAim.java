
import java.util.Scanner;

class e6_6_AntiAircraftAim{

    

public static void main (String[] args){

    Scanner kb = new Scanner(System.in);

   System.out.print("You must hit a flying target, please enter area size:");
   Target tar = new Target(kb.nextInt());
   
   e6_6_AntiAircraftAim program = new e6_6_AntiAircraftAim();
   
   program.playGame(tar, kb);

}

    private void playGame(Target target, Scanner kb)
    {
    
    target.init();
    
    Result outcome=null;
    
    while (outcome != Result.HIT)
    {
    if (outcome == null) {System.out.println("Target is in the air");}
    
        System.out.print("Enter width: ");
        int a = kb.nextInt();
        System.out.print("Enter depth: ");
        int b = kb.nextInt();
        System.out.print("Enter height: ");
        int c = kb.nextInt();
        
        outcome = target.fire(a, b, c);
        
        System.out.println(outcome);
    
    }
    
    
    }





}