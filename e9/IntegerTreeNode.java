package e9;

import e7.ListUtilities;


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
		if (isNull) System.out.println("Tree is empty so there is nothing to rebalance");
		else
		{
		ListUtilities list = new ListUtilities(true); // add all values to a sorted list
		addToList();
		int count = list.count();
		
		left=null;
		right=null;
		isNull = true;

		getNextBalancedItem(0,count - 1);
		}
	}		
	
	private void getNextBalancedItem(int low, int high)
	{
		if (high == low) add(ListUtilities.getNthItem(high));
		else if (high - low == 1)
		{
			add(ListUtilities.getNthItem(high));
			add(ListUtilities.getNthItem(low));
		}
		else
		{
			int median = low + (int) ((high - low) / 2);
			add(ListUtilities.getNthItem(median));
			getNextBalancedItem(low,median - 1);
			getNextBalancedItem(median + 1, high);			
		}
	}
	
		private void addToList()
		{
			ListUtilities.add( new int[] {value});
			if (left != null) left.addToList();
			if (right != null) right.addToList();
		}
		
	
		private int count()
		{
			return 1 + (left != null ? left.count(): 0) + (left != null ? left.count(): 0); 
		}
	
	
	public void add(int newNumber) {
		
		if (isNull)
		{
			value = newNumber;
			isNull = false;
		}
		else if (newNumber > this.value) {
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
		
		if (isNull) return false;
		else if (n == this.value) {
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
		if (isNull)
		{
			System.out.println("Tree has no entries, max 0 returned");
			return 0;
		}
		else if (right == null) return value;
		else return right.getMax();
	}
	
	public  int getMin()
	{
		if (isNull)
		{
			System.out.println("Tree has no entries, min 0 returned");
			return 0;
		}
		else if (left == null) return value;
		else return left.getMin();
	}
	
	public int depth()
	{
		if (isNull)
		{
			System.out.println("Warning, tree has no entries. -1 returned");
			return -1;
		}
		else if (left == null && right == null) return 0;
		else return Math.max( (left != null ? left.depth() + 1: 0),(right != null ? right.depth() + 1: 0)  );
	}
	
	
	public String toString()
	{	
		if (isNull) return "Tree has no nodes";
		return "[" + value + " L" + (left==null? "[]" : left.toString()) + " R" + (right==null? "[]" : right.toString()) + "]";
	}
	
	public String toStringSimple()
	{
		if (isNull) return "Tree has no nodes";
		return "[" + value + (left != null? " " + left.toStringSimple():"") + (right != null? " " + right.toStringSimple():"") + "]";
	}
	
}

