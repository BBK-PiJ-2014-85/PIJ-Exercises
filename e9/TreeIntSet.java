package e9;

public class TreeIntSet implements IntSet {

	int value;
	TreeIntSet right;
	TreeIntSet left;
	
	public TreeIntSet(int num)
	{
		value = num;
	}
	
	@Override
	public void add(int num) {
		if (num > this.value) {
		if (right == null) {
		right = new TreeIntSet(num);
		} else {
		right.add(num);
		}
		} else if (num < this.value) {
		if (left == null) {
		left = new TreeIntSet(num);
		} else {
		left.add(num);
		}
		}
	}

	@Override
	public boolean contains(int num) {

		if ( num == this.value) return true;
		else if (num > this.value && right != null) return right.contains(num);
		else if (num < this.value && left != null) return left.contains(num);

		return false;
	}

	@Override
	public boolean containsVerbose(int num) {
		
		System.out.println("Checking value: " + value);
		
		if ( num == value) return true;
		else if ( (num > this.value) && (right != null)) return right.containsVerbose(num); 
		else if ((num < this.value) && (left != null)) return left.containsVerbose(num);

		return false;
	}
	
	public String toString()
	{
		return value + (left!= null? ", " + left.toString(): "") + (right!= null? ", " + right.toString(): "");
	}

}
