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
	}
	
	public void deleteItem(String name)
	{
		if (firstItem != null) firstItem.delete(name);
		if (firstItem != null && firstItem.getName().equals(name)) firstItem = firstItem.getNextItem();
	}
	
}
