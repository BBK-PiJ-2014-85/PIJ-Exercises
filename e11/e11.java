package e11;
import e10.SmartPhone;
import e10.MobilePhone;
import e10.Phone;

public class e11 {

	//TODO: Is there a way to check what type has been input?
	
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

		System.out.println("\nExercise 2.2");
		System.out.println("Error would be caused by defining SmartPhone methods which would not be available at "
				+ "MobilePhone level.");
		System.out.println("A solution is to downcast as below:");
		MobilePhone myPhone2 = new SmartPhone("Phone brand"); //constructor requires a string input so added
		((SmartPhone) myPhone2).browseWeb("www.javaanswers.com");
		((SmartPhone) myPhone2).findPosition();
		((SmartPhone) myPhone2).call("012345678");
		
		System.out.println("\nExercise 2.3 and 2.4:");
		testPhone(myPhone2);
		System.out.println("Only methods defined within the interface, or downcasted can be called with the method.");
		
		System.out.println("\nExercise 2.5:");
		System.out.println("Passing through a MobilePhone and calling a smartPhone would return a runtime error");
		// The code below would cause this error
		//MobilePhone mob = new MobilePhone("brand here");
		//testPhone(mob);
		
		System.out.println("\nExercise 3");
		Company company = new Company();
		company.niNumbers.addItem(123);
		company.niNumbers.addItem(1234566);
		company.niNumbers.addItem(456);
		company.niNumbers.addItem(789);
		company.employeeNames.addItem("Tom");
		company.employeeNames.addItem("Dick");
		company.employeeNames.addItem("Matilda");
		company.employeeNames.addItem("Harry");
		company.niNumbers.deleteItem(1234566);
		company.employeeNames.deleteItem("Matilda");
		company.niNumbers.printList();
		company.employeeNames.printList();
		
		System.out.println("\nExercise 4:");
		GenericDoubleLinkedList<Double> sl = new GenericSortedList<Double>();
		sl.addItem(1.34);
		sl.addItem(7.345);
		sl.addItem(2.342);
		sl.addItem(3.45);
		sl.deleteItem(1.34);
		sl.printList();
		
		System.out.println("\nExercise 5:");
		System.out.println("ERROR TO FIX: CHANGE HASHCODES TO BE BETTER COMPARED OR DOUBLES");
		GenericStack<Integer> stack = new GenericStack<Integer>();
		stack.push(7);
		stack.push(6);
		stack.pop();
		stack.pop();
		stack.pop();
		GenericStack<Double> stack2 = new GenericStack<Double>();
		stack2.push(7.5676);
		stack2.push(6.43322);
		stack2.pop();
		stack2.pop();
		stack2.pop();
		
		System.out.println("\nExercise 6:");
		System.out.println("Exercise 6.1:");
		System.out.println("To be completed");
		
		System.out.println("\nExercise 6.2:");
		System.out.println("To be completed");
		
	}
	
	public static void testPhone(Phone inputPhone) 
	{
		inputPhone.call("012345");
		((SmartPhone) inputPhone).browseWeb("www.downcastme.com");
	}
	
}
