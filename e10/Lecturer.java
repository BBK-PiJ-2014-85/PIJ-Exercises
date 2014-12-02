package e10;

public class Lecturer extends Teacher {
	public Lecturer(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void doResearch(String topic) {
		System.out.println("Doing research on: " + topic);

}
	
	public static void main(String[] args)
	{
		Lecturer bob = new Lecturer("Bob");
		bob.doResearch("Life");
		System.out.println(bob.getName());
	}
	
}
