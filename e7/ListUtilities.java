package e7;

public class ListUtilities {

	private static LinkedListInt list= null;
	
	public ListUtilities()
	{
		if (list == null) list = new LinkedListInt(false);
	}
	
	public ListUtilities(boolean sorted)
	{
		if (list == null) list = new LinkedListInt(sorted);
	}
	
	public void add(int[] input)
	{
		for (int i : input)
		{
			list.addItem(i);
		}
	}
	
	public void print()
	{
		list.printList();
	}
	
	public void delete(int number)
	{
		list.deleteItem(number);
	}
	
	public int count()
	{
		return list.itemCount();
	}
	
	
	
}