package e11;

//import e7.DoubleListItem;

public class GenericDoubleListItem<T> {
	private GenericDoubleListItem<T> previousItem = null;
	private T value;
	private GenericDoubleListItem<T> nextItem = null;
	
	public GenericDoubleListItem (T value)
	{
		this.value = value;
	}
	
	public void addItem(GenericDoubleListItem<T> item)
	{
		if (nextItem == null) 
		{
			item.setPreviousItem(this);
			nextItem = item;
		}
		else nextItem.addItem(item);
	}
	
	public GenericDoubleListItem<T> getPreviousItem() {return previousItem;}
	public void setPreviousItem(GenericDoubleListItem<T> item) {previousItem = item;}
	
	/* Code is left here as printing forwards and backward was in original spec so kept incase needed later
	 * public void printList(boolean forwards)
	{
		System.out.println(value);
		
		if (forwards && nextItem != null) nextItem.printList(forwards);
		else if (forwards) 
		{
			forwards = false;
			System.out.println("Printing backwards");
			System.out.println(value);
		}
		
		if (!forwards && previousItem != null) previousItem.printList(forwards);
	}*/
	
	public void printList()
	{
		System.out.println(value.toString());
		if (nextItem != null) nextItem.printList();
	}
	
	public T getValue() {return value;}
	
	public GenericDoubleListItem<T> getNextItem() {return nextItem;}
	
	public void delete(T item)
	{
		if (nextItem != null && nextItem.getValue().equals(item))
		{
			nextItem = nextItem.getNextItem();
			nextItem.setPreviousItem(this);
		}
		
		if (nextItem != null) nextItem.delete(item);
	}
	
}
