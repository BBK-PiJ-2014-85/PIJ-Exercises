package e13;

/**
 * Class represents a library holding all relevant information.
 * 
 * Holds the name of the library, as well as the max book limit
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
	
	/**
	 * Returns the ID for the of a person for a given name in this Library
	 * @param name the name of the person who is at this Library
	 * @return the ID of the person
	 */
	int getID(String name);
	
	/**
	 * Adds a book to the Library.
	 * @param title the title of the book
	 * @param author the author of the book
	 */
	void addBook(String title, String author);
	
	/**
	 * Takes a book out of the library
	 * @param title the title of the book to take out
	 * @return the book being taken out form the library, or null if it doesn't exist in the library
	 * or is already taken out
	 */
	Book takeBook(String title);
	
	/**
	 * Marks the book as not taken from the library 
	 * @param book the book being returned
	 */
	void returnBook(Book book);
	
}
