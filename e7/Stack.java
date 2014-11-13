package e7;

public class Stack {
	private LinkedListItemInt firstItem = null;
	
	public void push(int num)
	{
		System.out.println("Pushing " + num + " ...");
		

		if (firstItem == null)
		{
			LinkedListItemInt temp = new LinkedListItemInt(num);
			firstItem = temp;
		}
		else
		{	
			LinkedListItemInt temp2 = new LinkedListItemInt(firstItem.getNum());
			temp2.setNextItem(firstItem.getNextItem());
			firstItem= new LinkedListItemInt(num);
			firstItem.setNextItem(temp2);
		}
	}
	
	public int pop()
	{
		
		if (firstItem != null)
		{
			int num = firstItem.getNum();
			firstItem= firstItem.getNextItem();
			
			System.out.println("Popping... it's a " + num);
			return num;
		}
		
		System.out.println("Warning: Stack is empty and therefore -1 is returned");
		
		return -1; //returns -1 if queue is empty
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
