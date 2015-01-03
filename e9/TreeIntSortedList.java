package e9;

public class TreeIntSortedList extends TreeIntSet implements IntSortedList {

	public TreeIntSortedList(int num) {
		super(num);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(int num) {
		
		if (num > this.value) 
		{
			if (right == null) right = new TreeIntSortedList(num);
			else right.add(num);
		} 
		else if (num <= this.value) //include = as list version allows duplicate values 
		{
			if (left == null) left = new TreeIntSortedList(num);
			else left.add(num);
		}

	}

	

}
