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
	
	void register(Library lib);
	
	Library getLibrary();
	
	
	
}
