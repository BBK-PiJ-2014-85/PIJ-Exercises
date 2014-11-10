package e7;

public class CircleListItem {
	private String itemName;
	private int number;
	private CircleListItem nextItem = null;
	
	public CircleListItem(String name, int num)
	{
		itemName = name;
		number = num;
	}
	
	public void addItem(CircleListItem item, CircleListItem startItem)
	{
		if (nextItem == startItem) 
		{
			nextItem = item;
			item.setNextItem(startItem);
		}
		else nextItem.addItem(item, startItem);
	}
	
	public void printList(CircleListItem startItem)
	{
		System.out.println(itemName + " " + number);
		
		if (nextItem != startItem) nextItem.printList(startItem);
	}
	
	public String getName() {return itemName;}
	public int getNumber() {return number;}
	public CircleListItem getNextItem() {return nextItem;}
	
	public void delete(String name, CircleListItem startItem)
	{
		if (nextItem != startItem && nextItem.getName().equals(name))
		{
			nextItem = nextItem.getNextItem();
		}
		
		if (nextItem != startItem) nextItem.delete(name, startItem);
	}
	
	public boolean isOnly() 
	{
		if (this == nextItem) return true;
		else return false;
	}
	
	public void updateLink(CircleListItem newItem, CircleListItem oldItem)
	{
		if (nextItem == oldItem) nextItem = newItem;
		else nextItem.updateLink(newItem, oldItem);
	}
	
	public void setNextItem(CircleListItem item) {nextItem = item;} 
}
