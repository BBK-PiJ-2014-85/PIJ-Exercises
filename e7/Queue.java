package e7;

public class Queue {

	private LinkedListItemInt firstItem = null;
	private LinkedListItemInt lastItem = null;
	private int count = 0;
	
	public void insert(int num)
	{
		System.out.println("Inserting request " + num + "...");
		
		count++;
		LinkedListItemInt temp = new LinkedListItemInt(num);
		if (firstItem == null)
		{
			firstItem = temp;
			lastItem=temp;
		}
		else
		{
			LinkedListItemInt temp2 = new LinkedListItemInt(firstItem.getNum());
			temp2.setNextItem(firstItem.getNextItem());
			if (temp2.getNextItem() != null) temp2.getNextItem().setPreviousItem(temp2);
			else lastItem = temp2;
			firstItem= new LinkedListItemInt(num);
			firstItem.setNextItem(temp2);
			temp2.setPreviousItem(firstItem);
		}
	}
	
	public int retrieve()
	{
		
		if (lastItem != null)
		{
			int num = lastItem.getNum();
			count--;
			if (lastItem.getPreviousItem() != null)
			{
				lastItem = lastItem.getPreviousItem();
			}
			else
			{
				lastItem = null;
				firstItem = null;
			}
			
			System.out.println("Retrieving request " + num + "... done." );
			return num;
		}
		
		System.out.println("Warning: Queue is empty and therefore -1 is returned");
		
		return -1; //returns -1 if queue is empty
	}
	
	public int size()
	{
		System.out.println("There are " + count + " requests in the queue");
		return count;
	}
	
	
}
