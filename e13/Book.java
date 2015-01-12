
package e13;

/**
 * A book contains an Author and Title, both of which are final.
 * 
 * @author Paul
 */

public interface Book {

	/**
	 * Returns the name of the author of the book.
	 * 
	 * @return the name of the Author
	 */

	String getAuthorName();

	/**
	 * Returns the title of the book.
	 * 
	 * @return the title of the book
	 */
	
	String getTitle();
	
}
