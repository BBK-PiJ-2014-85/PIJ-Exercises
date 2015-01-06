package e10;

public class e10_all {

	public static void main(String[] args)
	{
		System.out.println("Exercise 1: Extension, extension... ");
		// phone launcher class using all of the functionality
		PhoneLauncher pl = new PhoneLauncher();
		pl.launch();
		
		System.out.println("\n Exercise 2: Overriding completed and included within exercise 1 above");
		
		System.out.println("\n Exercise 3: Passing information to ancestor classes completed and included within exercise 1 above");
		
		System.out.println("\n Exercise 4: Visibility ");
		System.out.println("4.1: If playgame is made private in mobile phone, then it cannot be seen by other classes. Smartphone needs a public playgame method for the program phonelauncher still to work");
		System.out.println("4.2: This is not possible as you cannot reduce visibility of am imherited method. It could be overridden though with a method which does nothing");
		
		System.out.println("\n Exercise 5: Multiple inheritance");
		System.out.println("Class guitar created containing both a musical instrument and woodenObject objects within the class");
		
		System.out.println("\n Exercise 6: Java Magic");
		System.out.println("Lecurer class adapted to work. The proble mwas that it didnt call super in constructgor, which was required to set the name of teacher.");
		
		System.out.println("\n Exercise 7: Final measn no change");
		System.out.println("The string class cannot be extended as it is Final.");
		
		System.out.println("\n Exercise 8: Noah's ARC");
		System.out.println("TODO Want to discuss to see the best way of doing this. Wait for Keith example");
	}
	
}
