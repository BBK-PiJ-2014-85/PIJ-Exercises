package e7;

public class e7_9_ArrayToList {

	public static void main(String[] args) {
		
		ListUtilities list = new ListUtilities();
		
		list.add(new int[] {1,2,3,4,5,6,7,8,9});
		list.delete(7);
		System.out.println("There are " + list.count() + " entries in the list.");
		list.print();
		
		System.out.println("");
		
		list.add(new int[] {10, 1});
		list.print();

	}

}
