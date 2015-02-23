package e17;

/*
 * Assumed out of scope is:
 * 	- using an efficient mehtod to sort, as element needs to be added to the end of the list
 * 
 * 
 */


public class SelfSortingList implements Runnable{

	
	
	private Integer value = null;
	private boolean locked = false;
	private SelfSortingList next;
	private boolean sorted = true;
	private boolean first = false;
	
	
//	public SelfSortingList() //this is how to create the list
	{
		first = true;
		//start sorting thread
	}
	
	public SelfSortingList(int value) //this is the constructor created when adding an item

//	private SelfSortingList(boolean)
	{
		
	}
	
	public void add(int num)
	{
		//if first and none then then add it
		// else if first start a thread with an object with this list and set it on its way 
		// else store of move on
	}
	
	@Override
	public void run() {

		
	}
	
	
	
}
