package e11;

public class GenericSortedList<T extends Number> extends GenericDoubleLinkedList<T> {

	@Override
	public void addItem(T value)
	{
		GenericDoubleListItem<T> item = new GenericSortedListItem<T>(value);
		if (super.getFirstItem() == null) super.setFirstItem(item);
		else super.getFirstItem().addItem(item);
	}
	
	

	
}
