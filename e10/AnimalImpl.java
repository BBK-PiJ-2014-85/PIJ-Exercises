package e10;

public abstract class AnimalImpl implements Animal {

	protected String animalName;
	
	public AnimalImpl(String name)
	{
		animalName = name;
	}
	
	public void call()
	{
		System.out.println(animalName + " will come");
	}
	
	public void makeSound()
	{
		System.out.println("And the " + animalName + " make thier default noise!");
	}
	
}
