package e9;

public class ListIntSet implements IntSet{
	
	int value;
	ListIntSet next;
	
	
	public ListIntSet(int num)
	{
		value = num;
	}
	
	
	@Override
	public void add(int num) {
		if (value != num && next != null) next.add(num);
		else if (value != num && next == null) next = new ListIntSet(num);
	}

	@Override
	public boolean contains(int num) {
		if (value == num) return true;
		else if (next == null) return false;
		else return next.contains(num);
	}

	@Override
	public boolean containsVerbose(int num) {
		System.out.println("Value checking is: " + value);
		if (value == num) return true;
		else if (next == null) return false;
		else return next.containsVerbose(num);
	}
	
	public String toString()
	{
		return value + (next != null? ", " + next.toString():"");
	}

}
