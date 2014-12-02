package e10;

public abstract class NonMammals extends Animal {

	

	public NonMammals(String name, boolean flys, boolean swims) {
		super(name, flys, swims);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void reproduce() {
		layEggs();
	}
	
	private void layEggs()
	{
		System.out.println("I'm laying eggs");
	}

}
