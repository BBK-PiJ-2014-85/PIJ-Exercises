package e9;

public interface IntSortedList {
	/**
	 * Adds a new int to the list so that the list remains sorted, a list can contain 
	 * duplicates unlike a set
	 */
	public void add(int input);
	
	/**
	 * Returns true if the number is the the list, false otherwise
	 */
	public boolean contains(int input);
	
	/**
	 * returns a string with the values of the elements in the list separated by commas
	 */
	
	public String toString();

}
