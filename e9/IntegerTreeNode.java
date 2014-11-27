package e9;

public class IntegerTreeNode {
	int value;
	IntegerTreeNode right;
	IntegerTreeNode left;

	boolean isNull = false;
	
	public IntegerTreeNode(int num)
	{
		value = num;
	}
	
	public void delete(int num)
	{
		
		if (num == value) // this will always be the first in the tree if met due to logic below
		{
			//TODO - check how to delete this object
			if (right == null && left == null) 
				{
				isNull= true;
				System.out.println("Warning: Last item deleted in tree");
				}
			else if (left != null)
			{
				setLeft();
			}
			else setRight();
		}
		else // check the roots from this point
		{ // Need to keep looking same side every time
			
			while (left != null && left.value == num) //while removes multiple instances of same number
				// assuming it is not a set
			{
				if (left.left == null && left.right == null) left=null;
				else if (left.left != null) 
				{
					left = left.left;
					left.setLeft();
				}
				else left = left.right;
			}
		
			while (right != null && right.value == num)
			{
				if (right.left == null && right.right == null) right=null;
				else if (right.right != null) 
					{
					right = right.right;
					right.setRight();
					}
				else right = right.left;
			}
			
			if (num > value && right != null) right.delete(num);
			else if (left != null) left.delete(num);
			
		}
			
	}
	
	
	private void setLeft()
	{
		if (left != null)
		{
			value = left.value;
			if (left.left == null) left = left.right;
			else left.setLeft();
		}
		else if (right != null)
		{
			value = right.value;
			left = right.left;
			right = right.right;
		}
	}
	
	private void setRight ()
	{
		if (right != null)
		{
			value = right.value;
			if (right.right == null) right = right.left;
			else right.setRight();
		}
		else if (left != null)
		{
			value = left.value;
			right = left.right;
			left = left.left;
		}
	}
	
	public void reBalance()
	{
		
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

