package e9;

public class e9_1_IntegetBinaryTree {

	public static void main(String[] args) {
		
	IntegerTreeNode tree = new IntegerTreeNode(3);
	tree.add(4);
	tree.add(-12);
	tree.add(345);
	tree.add(7);
	tree.add(0);
	
	System.out.println("Exercise 1.1:");
	System.out.println("Minimum is " + tree.getMin());
	System.out.println("Maximum is " + tree.getMax());
	
	System.out.println("Exercise 1.2:");
	System.out.println(tree.toString());
	System.out.println(tree.toStringSimple());
	
	System.out.println("Exercise 1.3:");
	System.out.println(tree.depth());
	
	System.out.println("Exercise 1.4:");
	tree.add(7);
	tree.delete(7);
	System.out.println(tree.toString());
	
	System.out.println("Exercise 1.5 still to be completed");
	
	}

}
