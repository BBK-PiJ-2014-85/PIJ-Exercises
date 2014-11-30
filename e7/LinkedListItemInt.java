package e7;

public class LinkedListItemInt {
	private int num;
	private LinkedListItemInt nextItem = null;
	private LinkedListItemInt previousItem = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public LinkedListItemInt(int number)
	{
		num = number;
	}
	
	public void setPreviousItem(LinkedListItemInt item)
	{
		previousItem = item;
	}
	
	public LinkedListItemInt getPreviousItem() {return previousItem;}
	
	public void printList()
	{
		System.out.println(num);
		if (nextItem != null) nextItem.printList();
	}
	
	public int getNum() {return num;}
	
	public int restCount()
	{
		if (nextItem == null) return 1;
		else return 1 + nextItem.restCount();
	}
	
	public int getNthItem(int currentNum) //added for exercise in week 9
	{
		if (currentNum ==0) return num;
		else return nextItem.getNthItem((currentNum-1));
	}
	
	
	
	public void setNum(int number) {num = number;}
	public LinkedListItemInt getNextItem() {return nextItem;}
	public void setNextItem(LinkedListItemInt item) {nextItem = item;}
	
}
