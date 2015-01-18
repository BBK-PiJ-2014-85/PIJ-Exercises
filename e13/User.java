package e13;

/**
 * Class holds user information on the Library system. 
 * 
 * Contains User ID and library name
 * 
 * @author Paul
 */

public interface User {

	/**
	 * Returns the name of the user.
	 * @return the name
	 */
	String getName();
	
	/**
	 * Returns the ID of the user. 
	 * 
	 * @return the ID of the user
	 */
	int getID();
	
	/**
	 * Sets the ID for the user.
	 * @param id the ID for the user
	 */
	
	void setID(int id);
	
	/**
	 * Registers the user at a library.
	 * @param lib the library Object for which the user should be registered
	 */
	
	void register(LibraryImpl lib);
	
	/**
	 * Returns the library where the user in registered.
	 * @return the library where the user in registered
	 */
	
	LibraryImpl getLibrary();
	
	
	
}
