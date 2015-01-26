package e15;

/**
 * 
 * Contains a list of prime numbers
 * 
 * 
 * @author Paul Day
 *
 */

public interface PrimeDivisorList {

	/**
	 * Adds a prime number to the list
	 * 
	 * @throws NullPointerException if the user passes a null reference
	 * @throws IllegalArgumentException if the user passes a non-prime number
	 * 
	 * @param i the integer to be added
	 */
	
	void add(Integer i);
	
}
