package e7;

public class LinkedListInt {

	private LinkedListItemInt firstItem = null;

	public void addItem(LinkedListItemInt item)
	{
		if (firstItem == null) firstItem = item;
		else firstItem.addItem(item);
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
		if (firstItem != null) firstItem.delete(number);
		if (firstItem != null && firstItem.getNum() == number) firstItem = firstItem.getNextItem();
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
