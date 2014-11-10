package e7;

public class LinkedList {

	private ListItem firstItem = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void addItem(ListItem item)
	{
		if (firstItem == null) firstItem = item;
		else firstItem.addItem(item);
	}
	
	public void printList()
	{
		if (firstItem != null) firstItem.printList();
		else System.out.println("List is null");
	}
	
	public void deleteItem(String name)
	{
		if (firstItem != null) firstItem.delete(name);
		if (firstItem != null && firstItem.getName().equals(name)) firstItem = firstItem.getNextItem();
	}
	
	public int itemCount()
	{
		if (firstItem == null) return 0;
		else return firstItem.restCount();
		
	}
	
	public int itemCountIterative()
	{
		int count = 0;
		ListItem item = firstItem;
		while (item != null)
		{
			count++;
			item = item.getNextItem();
		}
		
		return count;
		
	}
	
	//public void setFirstItem(DoubleListItem item) {firstItem = item;}
	public ListItem getFirstItem() {return firstItem;}
}
