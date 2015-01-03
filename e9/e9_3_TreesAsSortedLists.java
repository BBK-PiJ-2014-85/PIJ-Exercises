package e9;

public class e9_3_TreesAsSortedLists {

	public static void main (String[] args)
	{
	
	IntSortedList tree = new TreeIntSortedList(7);
	tree.add(5);
	tree.add(5);
	tree.add(67);
	tree.add(-6543);
	System.out.println(tree.toString());
	
	IntSortedList list = new ListIntSortedList(7);
	list.add(5);
	list.add(5);
	list.add(67);
	list.add(-6543);
	System.out.println(list.toString());


	}
	
}
