package e10;

public abstract class Animal {
	
	private boolean aquatic, flying;
	private String name;
		
	/**
	* Every animal should have a call which prints on screen
	*/
	void call() 
	{
		if (flying) System.out.println(name + " now flying. Will come later when tired.");
		else if (aquatic) System.out.println(name + " will not come.");
		else System.out.println(name + " coming...");
	}
	
	/**
	* Every animal should have a method to reproduce after the rain
	*/	
	void reproduce() {}
	
	public Animal(String name, boolean flys, boolean swims)
	{
		this.name = name;
		this.flying = flys;
		this.aquatic = swims;
	}
	
	
	void makeSound() {System.out.println("Make some NOIIIISSSEEEE....(Dont know what I'm meant to do with this)");}

}
