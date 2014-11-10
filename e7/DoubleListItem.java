package e7;

public class DoubleListItem{

	private DoubleListItem previousItem = null;
	private String itemName;
	private int number;
	private DoubleListItem nextItem = null;
	
	public DoubleListItem(String name, int num)
	{
		itemName = name;
		number = num;
	}
	
	public void addItem(DoubleListItem item)
	{
		if (nextItem == null) 
		{
			item.setPreviousItem(this);
			nextItem = item;
		}
		else nextItem.addItem(item);
	}
	
	public DoubleListItem getPreviousItem() {return previousItem;}
	public void setPreviousItem(DoubleListItem item) {previousItem = item;}
	
	public void printList(boolean forwards)
	{
		System.out.println(itemName + " " + number);
		
		if (forwards && nextItem != null) nextItem.printList(forwards);
		else if (forwards) 
		{
			forwards = false;
			System.out.println("Printing backwards");
			System.out.println(itemName + " " + number);
		}
		
		if (!forwards && previousItem != null) previousItem.printList(forwards);
	}
	
	public String getName() {return itemName;}
	public int getNumber() {return number;}
	public DoubleListItem getNextItem() {return nextItem;}
	
	public void delete(String name)
	{
		if (nextItem != null && nextItem.getName().equals(name))
		{
			nextItem = nextItem.getNextItem();
			nextItem.setPreviousItem(this);
		}
		
		if (nextItem != null) nextItem.delete(name);
	}
	
}
