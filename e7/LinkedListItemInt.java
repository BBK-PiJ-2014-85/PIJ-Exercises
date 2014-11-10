package e7;

public class LinkedListItemInt {
	private int num;
	private LinkedListItemInt nextItem = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public LinkedListItemInt(int number)
	{
		num = number;
	}
	
	public void addItem(LinkedListItemInt item)
	{
		if (nextItem == null) nextItem = item;
		else nextItem.addItem(item);
	}
	
	public void printList()
	{
		System.out.println(num);
		if (nextItem != null) nextItem.printList();
	}
	
	public void delete(int number)
	{
		if (nextItem != null && nextItem.getNum() == number)
		{
			nextItem = nextItem.getNextItem();
		}
		
		if (nextItem != null) nextItem.delete(number);
	}
	
	public int getNum() {return num;}
	
	public int restCount()
	{
		if (nextItem == null) return 1;
		else return 1 + nextItem.restCount();
	}
	
	
	public void setNum(int number) {num = number;}
	public LinkedListItemInt getNextItem() {return nextItem;}
	public void setNextItem(LinkedListItemInt item) {nextItem = item;}
	
}
