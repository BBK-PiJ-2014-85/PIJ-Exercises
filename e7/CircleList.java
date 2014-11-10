package e7;

public class CircleList {

	private CircleListItem 	firstItem = null;

	public void deleteItem(String name)
	{
		if (firstItem != null) firstItem.delete(name, firstItem);
		if (firstItem != null && firstItem.getName().equals(name) && firstItem.isOnly()) 
		{
			firstItem=null;
		}
		else if (firstItem != null && firstItem.getName().equals(name)) 
		{
			CircleListItem oldFirst = firstItem;
			firstItem = firstItem.getNextItem();
			firstItem.updateLink(firstItem,oldFirst);
		}
	}
	
	public void addItem(ListItem item)
	{
		if (firstItem == null) 
		{
			firstItem = convertToCircle(item);
			firstItem.setNextItem(firstItem);
		}
		else firstItem.addItem(convertToCircle(item), firstItem);
	}
	
	public void printList()
	{
		if (firstItem != null) firstItem.printList(firstItem);
	}

	private CircleListItem convertToCircle(ListItem item)
	{
		return new CircleListItem(item.getName(),item.getNumber());
	}
	
	
}
