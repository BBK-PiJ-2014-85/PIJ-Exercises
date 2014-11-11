package e7;

public class LinkedListInt {

	private LinkedListItemInt firstItem = null;

	public void addItem(LinkedListItemInt item)
	{
		LinkedListItemInt current = firstItem;
		
		if (firstItem == null)  firstItem = item;
		else
		{
		while (current.getNextItem() != null)
		{
		
			current = current.getNextItem();
		}
		current.setNextItem(item);
		item.setPreviousItem(current);
		
		}
	}
	
	public void addItem(int number)
	{
		LinkedListItemInt input = new LinkedListItemInt(number);
		addItem(input);
	}
	
	public void printList()
	{
		if (firstItem != null) firstItem.printList();
		else System.out.println("List is null");
	}
	
	public void deleteItem(int number)
	{
		if (firstItem != null)
		{
			LinkedListItemInt current = firstItem;
			while (current != null)
			{
				if (current.getNum() == number && current.getPreviousItem() != null) 
				{
					current.getPreviousItem().setNextItem(current.getNextItem());
					if (current.getNextItem() != null) current.getNextItem().setPreviousItem(current.getPreviousItem());
				}
				current = current.getNextItem();
			}
		}
		
		if (firstItem != null && firstItem.getNum() == number) 
		{
			firstItem = firstItem.getNextItem();
			firstItem.setPreviousItem(null);
		}
	}
	
	public int itemCount()
	{
		if (firstItem == null) return 0;
		else return firstItem.restCount();
		
	}
	
	public int itemCountIterative()
	{
		int count = 0;
		LinkedListItemInt item = firstItem;
		while (item != null)
		{
			count++;
			item = item.getNextItem();
		}
		
		return count;
		
	}
	
	//public void setFirstItem(DoubleListItem item) {firstItem = item;}
	public LinkedListItemInt getFirstItem() {return firstItem;}
}
