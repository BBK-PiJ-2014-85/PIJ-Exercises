package e10;

public class Dolphin extends Mammals {
	
	public Dolphin(String name, boolean flys, boolean swims) {
		super(name, flys, swims);
		// TODO Auto-generated constructor stub
	}

	public static void main (String[] args)
	{
		Dolphin d=new Dolphin("Fred", false, false);
		d.call();
		System.out.println(System.getProperty("java.runtime.version"));
	}
	

}
