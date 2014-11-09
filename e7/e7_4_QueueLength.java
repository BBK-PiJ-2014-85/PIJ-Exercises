package e7;

public class e7_4_QueueLength {

	public static void main(String[] args) {
		// Added two counting methods, one using recursion, one iteration.
		// Found recursion simpler
		
  	LinkedList myList = new LinkedList();
    	
    	myList.addItem(new ListItem("Bob", 17));
    	myList.addItem(new ListItem("Davey", 21));
    	myList.addItem(new ListItem("Fred", 25));
    	myList.addItem(new ListItem("Sarah", 30));
    	myList.addItem(new ListItem("Jen", 35));
    	myList.addItem(new ListItem("Lola", 21));
    	
    	System.out.println("Using recursion, count is " + myList.itemCount());
    	System.out.println("Using iteation, count is " + myList.itemCountIterative());
    	
    	System.out.println("\n");
    	
    	myList.deleteItem("Fred");
    	myList.deleteItem("Sarah");
    	myList.deleteItem("Bob");
    	
    	System.out.println("Using recursion, count is " + myList.itemCount());
    	System.out.println("Using iteation, count is " + myList.itemCountIterative());
	}

}
