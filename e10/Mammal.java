package e10;

public interface Mammal extends Animal {
	
	default void giveBirth()
	{
		System.out.println("Giving Birth!");
	}
	
	default void reproduce()
	{
		giveBirth();
	}

}
