package e7;

public class ListUtilities {

	private static LinkedListInt list= null;
	
	public static LinkedListInt quickSort(LinkedListInt input)
	{
		if (input.getFirstItem().getNextItem() == null)
		{
			return input;
		}
		else if (input.getFirstItem().getNextItem().getNextItem() == null)
		{
			return ListUtilities.bubbleSort(input);
		}
		else
		{
			LinkedListInt listLower = new LinkedListInt();
			LinkedListInt listHigher = new LinkedListInt();
			
			int compareValue = input.getFirstItem().getNum();
			LinkedListItemInt current = input.getFirstItem().getNextItem();
			while (current != null)
			{
				if (current.getNum() < compareValue) listLower.addItem(current);
				else listHigher.addItem(current);
				
				current = current.getNextItem();
			}
			
			listLower = ListUtilities.quickSort(listLower); 
			listHigher = ListUtilities.quickSort(listHigher);
			
			listLower.addItem(input.getFirstItem());
			listLower.addItem(listHigher);

			return listLower; 
		}
	}
	
	
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
		list = input;
		
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
	
	public static LinkedListInt cocktailSort(LinkedListInt input)
	{
		list = input;
		
		boolean moved = true, forwards=true;
		LinkedListItemInt current = list.getFirstItem();
		
		while (moved)
		{
			if (forwards)
			{
				moved = false;
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
				forwards = false;
			}
			else
			{
				moved = false;
				while (current.getPreviousItem() != null)
				{
					if (current.getNum() < current.getPreviousItem().getNum())
					{
						int tempNum = current.getNum();
						current.setNum(current.getPreviousItem().getNum());
						current.getPreviousItem().setNum(tempNum);
						moved = true;
					}
					current = current.getPreviousItem();
				}
				forwards = true;
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