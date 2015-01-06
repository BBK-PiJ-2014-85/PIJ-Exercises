package e11;


public class GenericMapItem<T, U> {
	
	private T key;
	private U value;
	private GenericMapItem<T, U> nextItem;
	
	public T getKey(){ return key;}
	public U getObject(){return value;}
	public GenericMapItem<T, U> getNextItem() {return nextItem;}
	
	public void setNextItem(GenericMapItem<T, U> item) {nextItem = item;}
	
	public GenericMapItem(T key, U value)
	{
		this.key = key;
		this.value = value;
	}
	
	public void addItem(GenericMapItem<T,U> item)
	{
		if (!item.getKey().equals(key))
		{
			if (nextItem == null) nextItem=item;
			else nextItem.addItem(item);
		}
	}
	
	public void test()
	{}

}
