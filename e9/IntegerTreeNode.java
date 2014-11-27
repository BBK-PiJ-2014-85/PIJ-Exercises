package e9;

public class IntegerTreeNode {
	int value;
	IntegerTreeNode right;
	IntegerTreeNode left;
	
	
	public IntegerTreeNode(int num)
	{
		value = num;
	}
	
	public void delete(int num)
	{
		//unclear what to do with multiple entries (doesn't say is a set) so issue ignored
		if (num == value) //must be first in tree given logic below
		{
			//TODO - check how to delete this object
			if (right == null && left == null) System.out.println("Error: Last item deleted in tree");
			// Else what to do if has other value
		}
		
		if (left != null && left.value == num) 
			{
				left = left.left;
			}
		else if (right !=null && right.value == num) right=right.right;
			
	}
	
	private void setNextLeftValue(boolean Left)
	{
		if (left.value == null))
		value = left.value;
		if (left.value != null)
	}
	
	public void add(int newNumber) {
		if (newNumber > this.value) {
		if (right == null) {
		right = new IntegerTreeNode(newNumber);
		} else {
		right.add(newNumber);
		}
		} else {
		if (left == null) {
		left = new IntegerTreeNode(newNumber);
		} else {
		left.add(newNumber);
		}
		}
		}
	
	public boolean contains(int n) {
		if (n == this.value) {
		return true;
		} else if (n > this.value) {
		if (right == null) {
		return false;
		} else {
		return right.contains(n);
		}
		} else {
		if (left == null) {
		return false;
		} else {
		return left.contains(n);
		}
		}
		}
	
	public int getMax()
	{
		if (right == null) return value;
		else return right.getMax();
	}
	
	public  int getMin()
	{
		if (left == null) return value;
		else return left.getMin();
	}
	
	public int depth()
	{
		if (left == null && right == null) return 0;
		else return Math.max( (left != null ? left.depth() + 1: 0),(right != null ? right.depth() + 1: 0)  );
	}
	
	public void delete()
	{
		//TODO
	}
	
	public void rebalance()
	{
		//TODO
	}
	
	public String toString()
	{	
		return "[" + value + " L" + (left==null? "[]" : left.toString()) + " R" + (right==null? "[]" : right.toString()) + "]";
	}
	
	public String toStringSimple()
	{
		return "[" + value + (left != null? " " + left.toStringSimple():"") + (right != null? " " + right.toStringSimple():"") + "]";
	}
	
}
