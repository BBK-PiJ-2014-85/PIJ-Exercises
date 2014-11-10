package e7;

public class e7_5_DoublyLinkedLists {

	public static void main (String[] args)
	{
		DoubleLinkedList myList = new DoubleLinkedList();
    	
    	myList.addItem(new ListItem("Bob", 17));
    	myList.addItem(new ListItem("Davey", 21));
    	myList.addItem(new ListItem("Fred", 25));
    	myList.addItem(new ListItem("Sarah", 30));
    	myList.addItem(new ListItem("Jen", 35));
    	myList.addItem(new ListItem("Lola", 21));
 
    	myList.printList();
    	
    	System.out.println("\n");
    	
    	myList.deleteItem("Fred");
    	myList.deleteItem("Sarah");
    	myList.deleteItem("Bob");
    	myList.deleteItem("Non existant list");
    	
    	myList.printList();
		
	}
	
}
