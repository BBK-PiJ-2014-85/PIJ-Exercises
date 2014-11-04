package e7;

public class e7_1_Spies{

private static int spyCount = 0;
private int iD;

public static void main (String[] args) {
    
    e7_1_Spies first = new e7_1_Spies(123456);
    e7_1_Spies second = new e7_1_Spies(007);
    e7_1_Spies third = new e7_1_Spies(789);
    second.die();

} 

    public void die() {
        spyCount--;
        System.out.println("Spy " + iD + " has been eliminated. " + spyCount + " spies remain.");
    }
    
  

    public e7_1_Spies(int iD) {
        spyCount++;
        this.iD = iD;
        System.out.println("Spy " + iD + " created. There are now " + spyCount + " spies");
    }

}