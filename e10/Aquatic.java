package e10;

public abstract class Aquatic extends AnimalImpl{

	public Aquatic(String name) {
		super(name);
	}
	
	@Override
	public void call()
	{
		System.out.println(animalName + " will not come...");
	}
	
	
}
