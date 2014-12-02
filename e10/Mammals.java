package e10;

public abstract class Mammals extends Animal {

	
	public Mammals(String name, boolean flys, boolean swims) {
		super(name, flys, swims);
		// TODO Auto-generated constructor stub
	}



	@Override
	public void reproduce() {
		giveBirth();
	}
	
	private void giveBirth()
	{
		System.out.println("I'm giving birth");
	}

}
