package e11;

public class e11 {

	public static void main(String[] args)
	{
		System.out.println("Exercise 1 - Don't repeat yourself");
		Comparator comp = new Comparator();
		System.out.println(comp.getMax("720","360"));
		System.out.println(comp.getMax(720,360));
		System.out.println(comp.getMax(720.456,360.234));
	}
	
}
