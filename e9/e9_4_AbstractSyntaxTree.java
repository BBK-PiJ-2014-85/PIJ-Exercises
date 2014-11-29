package e9;

public class e9_4_AbstractSyntaxTree {

	public static void main(String[] args)
	{
		BinaryTreeNode tree = BinaryTreeNode.toTree("(3 + 4) / (7 * 4 + 3)");
		System.out.println(tree.toString());
	}
	
}
