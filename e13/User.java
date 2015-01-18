package e13;

/**
 * Class holds user information on the Library system. 
 * 
 * Contains name and library ID
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
	 * Returns the Library ID of the user. 
	 * 
	 * @return the Library ID of the user
	 */
	int getLibraryID();
	
	/**
	 * Sets the library ID for the user.
	 * @param id the library ID for the user
	 */
	
	void setLibraryID(int id);
	
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
