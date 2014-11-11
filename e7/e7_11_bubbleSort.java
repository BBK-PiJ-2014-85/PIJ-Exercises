package e7;

public class e7_11_bubbleSort {

	public static void main(String[] args) {
	
		LinkedListInt list1 = ListUtilities.createList(new int [] {10,345,56,23,2344,5456,767,45,34,123,1,23,43,12,5564,23,423,1212,54,45});
		ListUtilities.bubbleSort(list1);
		list1.printList();

	}

}
