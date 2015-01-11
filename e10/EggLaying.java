package e10;

public interface EggLaying extends Animal {
	
	default void layEggs()
	{
		System.out.println("Laying eggs!");
	}
	
	default void reproduce()
	{
		layEggs();
	}

}
