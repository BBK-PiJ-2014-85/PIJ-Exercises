package e11;

public class GenericSortedListItem<T extends Number> extends GenericDoubleListItem<T> {

	public GenericSortedListItem(T value)
	{
		super(value);
	}
	
	@Override
	public void addItem(GenericDoubleListItem<T> item)
	{
		if (getNextItem() == null) 
		{
			item.setPreviousItem(this);
			setNextItem(item);
		}
		else if ( getNextItem().getValue().longValue()  > item.getValue().longValue())
		{
			item.setNextItem(getNextItem());
			setNextItem(item);//Not updating previous number as doesnt need to be double linked
		}
		else getNextItem().addItem(item);
	}
	
//	public void addItem(GenericDoubleListItem<T> item)
//	{
//		
//	}
}
