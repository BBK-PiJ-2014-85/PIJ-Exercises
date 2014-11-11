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
	
	public static void setListUtilities(int[] inputArray)
	{
		list = new LinkedListInt(false);
		add(inputArray);
	}
	
	public static LinkedListInt createList(int[] inputArray)
	{
		list = new LinkedListInt(false);
		add(inputArray);
		return list;
	}
	
	public static void add(int[] input)
	{
		for (int i : input)
		{
			list.addItem(i);
		}
	}
	
	
	public static LinkedListInt bubbleSort(LinkedListInt input)
	{
		boolean moved = true;
		while (moved)
		{
			moved = false;
			LinkedListItemInt current = list.getFirstItem();
			while (current.getNextItem() != null)
			{
				if (current.getNum() > current.getNextItem().getNum())
				{
					int tempNum = current.getNum();
					current.setNum(current.getNextItem().getNum());
					current.getNextItem().setNum(tempNum);
					moved = true;
				}
				current = current.getNextItem();
			}
		}
		
		return list;
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