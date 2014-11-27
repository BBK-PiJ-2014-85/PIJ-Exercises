package e9;

public class e9_2_TreesAsSets {

	public static void main(String[] args)
	{
		IntSet tree = new TreeIntSet(7);
		tree.add(5);
		tree.add(5);
		tree.add(67);
		tree.add(-6543);
		System.out.println(tree.toString());
		System.out.println(tree.contains(67));
		System.out.println(tree.containsVerbose(67));
		System.out.println(tree.contains(6700));
		System.out.println(tree.containsVerbose(6700));
		
		System.out.println("\n And now as a list:");
		IntSet list = new ListIntSet(7);
		list.add(5);
		list.add(5);
		list.add(67);
		list.add(-6543);
		System.out.println(list.toString());
		System.out.println(list.contains(67));
		System.out.println(list.containsVerbose(67));
		System.out.println(list.contains(6700));
		System.out.println(list.containsVerbose(6700));
	}
	
}
