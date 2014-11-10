package e7;

public class DoubleLinkedList{
	
	private DoubleListItem 	firstItem = null;

	public void deleteItem(String name)
	{
		if (firstItem != null) firstItem.delete(name);
		if (firstItem != null && firstItem.getName().equals(name)) 
			{
			firstItem = firstItem.getNextItem();
			firstItem.setPreviousItem(null);
			}
	}
	
	public void addItem(ListItem item)
	{
		if (firstItem == null) firstItem = convertToDouble(item);
		else firstItem.addItem(((DoubleListItem) convertToDouble(item) ));
	}
	
	public void printList()
	{
		if (firstItem != null) firstItem.printList(true);
	}

	public void printBothWays()
	{
		
	}

	private DoubleListItem convertToDouble(ListItem item)
	{
		return new DoubleListItem(item.getName(),item.getNumber());
	}
	
	
}
