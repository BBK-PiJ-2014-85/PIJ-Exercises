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
	
	
	}

}
