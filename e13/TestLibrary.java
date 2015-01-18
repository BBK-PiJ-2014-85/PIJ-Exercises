package e13;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestLibrary {

	Library lib;
	
	@Before
	public void createLibrary()
	{
		lib = new LibraryImpl("Library Name");
	}
	
	@Test
	public void testGetName() {
		assertEquals("Library Name",lib.getLibrary());
	}

	@Test
	public void testMaxBooksZeroAtStart()
	{
		assertEquals(0,lib.getMaxBooks());
	}
	
	@Test
	public void testMaxBooksOnceSet()
	{
		lib.setMaxBooks(5);
		assertEquals(5,lib.getMaxBooks());
	}
	
	@Test
	public void testMaxBooksChangeCorrectly()
	{
		lib.setMaxBooks(5);
		lib.setMaxBooks(10);
		assertEquals(10,lib.getMaxBooks());
	}
	
	@Test
	public void testGetMaxBooksNotAlterValue()
	{
		lib.setMaxBooks(5);
		lib.getMaxBooks();
		assertEquals(5,lib.getMaxBooks());
	}
	
	@Test
	public void testIDCreatedAndReturned()
	{
		assertEquals(1, lib.getID("Bob"));
	}
	
	@Test
	public void testIDReturnedSame()
	{
		lib.getID("Bob");
		assertEquals(1, lib.getID("Bob"));
	}
	
	@Test
	public void test2ndIDUnique()
	{
		lib.getID("Bob");
		assertEquals(2, lib.getID("Fred"));
	}
	
	
	@Test
	public void testTakeBookReturnNullWhenNoneAdded()
	{
		assertNull(lib.takeBook("Book 1"));
	}
	
	private void assertBookEquals(Book bk, String title, String author)
	{
		assertEquals(title, bk.getTitle());
		assertEquals(author, bk.getAuthorName());
	}
	
	
	@Test
	public void testTakeBookOnceAdded()
	{
		lib.addBook("Title1","Author1");
		Book bk = lib.takeBook("Title 1");
		assertBookEquals(bk, "Title1", "Author1");
	}
	
	@Test
	public void testOnlyTakeBookOutOnce()
	{
		lib.addBook("Title1","Author1");
		lib.takeBook("Title 1");
		assertNull(lib.takeBook("Title 1"));
	}
	
	@Test
	public void testOnceBookReturnedCanBeTakenOut()
	{
		lib.addBook("Title1","Author1");
		Book bk = lib.takeBook("Title 1");
		lib.returnBook(bk);
		Book bk2 = lib.takeBook("Title 1");
		assertBookEquals(bk2, "Title1", "Author1");
	}

	@Test
	public void testBookNotAddedByOnlyReturning()
	{
		Book bk = lib.takeBook("Title 1");
		lib.returnBook(bk);
		assertNull(lib.takeBook("Title 1"));
	}
	//could also check multiple states (i.e. if first is taken out that adds correctly)
	@Test 
	public void testAddingMultipleBooksAndTakeOut2nd()
	{
		lib.addBook("Title 1", "Author 1");
		lib.addBook("Title 2", "Author 2");
		Book bk2 = lib.takeBook("Title 2");
		assertBookEquals(bk2, "Title 2", "Author 2");
	}
	
	@Test 
	public void testAddingMultipleBooksAndTakeOutReturnAndTakeOut()
	{
		lib.addBook("Title 1", "Author 1");
		lib.addBook("Title 2", "Author 2");
		Book bk2 = lib.takeBook("Title 2");
		assertNull(lib.takeBook("Title 2"));
		lib.returnBook(bk2);
		Book bk3 = lib.takeBook("Title 2");
		assertBookEquals(bk3, "Title 2", "Author 2");
	}
	
}
