package e7;

public class ListItem {

	private String itemName;
	private int number;
	private ListItem nextItem = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public ListItem(String name, int number)
	{
		itemName = name;
		this.number = number;
	}
	
	public void addItem(ListItem item)
	{
		if (nextItem == null) nextItem = item;
		else nextItem.addItem(item);
	}
	
	public void printList()
	{
		System.out.println(itemName + " " + number);
		if (nextItem != null) nextItem.printList();
	}
	
	public void delete(String name)
	{
		if (nextItem != null && nextItem.getName().equals(name))
		{
			nextItem = nextItem.getNextItem();
		}
		
		if (nextItem != null) nextItem.delete(name);
	}
	
	public int restCount()
	{
		if (nextItem == null) return 1;
		else return 1 + nextItem.restCount();
	}
	
	
	public String getName() {return itemName;}
	public int getNumber() {return number;}
	public void setName(String name) {itemName = name;}
	public void setNumber(int number) {this.number = number;}
	public ListItem getNextItem() {return nextItem;}
	

}
