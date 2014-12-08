package e11;
import e10.SmartPhone;
import e10.MobilePhone;

public class e11 {

	public static void main(String[] args)
	{
		System.out.println("Exercise 1 - Don't repeat yourself");
		Comparator comp = new Comparator();
		System.out.println(comp.getMax("720","360"));
		System.out.println(comp.getMax(720,360));
		System.out.println(comp.getMax(720.456,360.234));
	
		System.out.println("\nExercise 2 - Upcasting/downcasting\n");
		
		System.out.println("Exercise 2.1");
		SmartPhone myPhone = new SmartPhone("Phone brand"); //constructor requires a string input so added
		myPhone.browseWeb("www.javaanswers.com");
		myPhone.findPosition();
		myPhone.call("012345678");

		System.out.println("Exercise 2.2");
		System.out.println("Error would be caused by defining SmartPhone methods which would not be available at "
				+ "MobilePhone level.");
		System.out.println("A solution is to downcast as below:");
		MobilePhone myPhone2 = new SmartPhone("Phone brand"); //constructor requires a string input so added
		((SmartPhone) myPhone2).browseWeb("www.javaanswers.com");
		((SmartPhone) myPhone2).findPosition();
		((SmartPhone) myPhone2).call("012345678");
		
		
		
		
	}
	
}
