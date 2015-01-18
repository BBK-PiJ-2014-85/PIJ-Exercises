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
	
	
	
	
	
}
