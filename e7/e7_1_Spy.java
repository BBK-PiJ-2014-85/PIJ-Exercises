
public class e7_1_Spy{

private static int spyCount = 0;
private int iD;

    
    public void die() {
        spyCount--;
        System.out.println("Spy " + iD + " has been eliminated. " + spyCount + " spies remain.");
    }
    
    public static void main (String[] args) {
    
        e7_1_Spy first = new e7_1_Spy(123456);
        e7_1_Spy second = new e7_1_Spy(007);
        e7_1_Spy third = new e7_1_Spy(789);
        second.die();
    
    }

    public e7_1_Spy(int iD) {
        spyCount++;
        this.iD = iD;
        System.out.println("Spy " + iD + " created. There are now " + spyCount + " spies");
    }

}