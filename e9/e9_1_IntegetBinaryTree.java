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
	
	IntegerTreeNode tree2 = new IntegerTreeNode(1);
	tree2.delete(1);
	System.out.println(tree2.toString());
	tree2.add(12);
	System.out.println(tree2.toString());
	
	System.out.println("Exercise 1.5:");
	IntegerTreeNode tree3 = new IntegerTreeNode(1);
	for (int i = 2; i < 50; i++) tree3.add(i);
	tree3.reBalance();
	System.out.println(tree3.toString());
	
	
	}

}
