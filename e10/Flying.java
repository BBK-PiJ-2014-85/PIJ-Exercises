package e10;

public abstract class Flying extends AnimalImpl{

	public Flying(String name) {
		super(name);
	}
	
	@Override
	public void call()
	{
		System.out.println(animalName + " now flying, will come later when tired...");
	}
	
	
}
