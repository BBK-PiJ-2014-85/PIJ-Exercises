package e13;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestBook {

	Book book;
	
	@Before()
	public void createBook()
	{
		book = new BookImpl("name", "title");
	}
	
	@Test
	public void testGetName() {
		assertEquals(book.getAuthorName(), "name");
	}
	
	@Test
	public void testGetTitle() {
		assertEquals(book.getTitle(), "title");
	}
	
	@Test 
	public void testNull()
	{
		Book nullBook = new BookImpl(null,null);
		assertEquals(nullBook.getTitle(), null);
		assertEquals(nullBook.getAuthorName(), null);
	}
	
	// Should add a way of testing final?

}
