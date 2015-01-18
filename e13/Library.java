package e13;

/**
 * Class represents a library holding all relevant information.
 * 
 * Holds the ID and name of the library, as well as the max book limit
 * per user.
 * 
 * @author Paul
 *
 */

public interface Library {

	/**
	 * Returns the name of the Library.
	 * @return the name of the library
	 */
	
	String getLibrary();
	
	/**
	 * Return the ID number of the Library.
	 * @return the ID of the library
	 */
	int getID();
	
	/**
	 * Sets the maximum number of books a user may borrow at any one time.
	 * @param num the number of books any one user can borrow at one time
	 */
	
	void setMaxBooks(int num);
	
	/**
	 * Returns the maximum amount of books a user can borrow at one one moment
	 * in time
	 * @return the maximum number of books a user may borrow at any one point
	 */
	int getMaxBooks();
	
}
