package e11;


public class GenericStack <T extends Number> {
	private GenericDoubleListItem<T> firstItem = null;
	
	public void push(T value)
	{
		System.out.println("Pushing " + value.toString() + " ...");

		if (firstItem == null)
		{
			GenericDoubleListItem<T> temp = new GenericDoubleListItem<T>(value);
			firstItem = temp;
		}
		else
		{	
			GenericDoubleListItem<T> temp2 = new GenericDoubleListItem<T>(firstItem.getValue());
			temp2.setNextItem(firstItem.getNextItem());
			firstItem = new GenericDoubleListItem<T>(value);
			firstItem.setNextItem(temp2);
		}
	}
	
	public T pop()
	{
		
		if (firstItem != null)
		{
			T value = firstItem.getValue();
			firstItem= firstItem.getNextItem();
			
			System.out.println("Popping... it's a " + value.toString());
			return value;
		}
		
		System.out.println("Warning: Stack is empty and therefore null is returned");
		
		return null; //returns -1 if queue is empty
	}
	
	public boolean empty()
	{
		if (firstItem == null) 
			{
			System.out.println("Stack Empty...");
			return true;
			}
		System.out.println("Stack not empty.");
		return false;
	}
	
}
