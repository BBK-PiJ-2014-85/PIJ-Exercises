package e13;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestUser {

	User user;
	
	@Before
	public void setUp()
	{
		user = new UserImpl("Joe Bloggs");
	}
	
	@Test
	public void testName() {
		assertEquals(user.getName(), "Joe Bloggs");
	}
	
	@Test
	public void testNullName()
	{
		User nullUser = new UserImpl(null);
		assertNull(nullUser.getName());
	}

	
	@Test
	public void testId()
	{
		user.setID(12345678);
		assertEquals(user.getID(),12345678);
	}
	
	@Test
	public void testNullID()
	{
		assertEquals(user.getID(),0);
	}
	
	@Test
	public void testReplaceNormal()
	{
		user.setID(123);
		user.setID(456);
		assertEquals(user.getID(), 456);
	}
	
	@Test
	public void testRegister()
	{
		user.register(new LibraryImpl());
		assertEquals(user.getLibrary().getLibrary(), "Library name here");
		assertEquals(user.getLibrary().getID(), 7);
	}
	
	@Test 
	public void testIDUpdated()
	{
		user.register(new LibraryImpl());
		assertEquals(7, user.getID());
	}
	
	@Test 
	public void testLibraryNull()
	{
		assertNull(user.getLibrary());
	}
	
	@Test
	public void testLibrarySetNullAfterOne()
	{
		user.register(new LibraryImpl());
		user.register(null);
		assertNull(user.getLibrary());
	}
	
	@Test
	public void testLibraryIDSetZeroAfterLibrarySetNull()
	{
		user.register(new LibraryImpl());
		user.register(null);
		assertEquals(0, user.getID());
	}
	
	@Test
	public void testLibraryReplacesSucessfully()
	{ //Doesnt actually test anything while Library is a mock class 
		user.register(new LibraryImpl());
		user.register(new LibraryImpl());
		assertEquals(user.getLibrary().getLibrary(), "Library name here");
		
	}
	
	@Test
	public void testLibraryReplacesIDWhenSucessfully()
	{ //Doesnt actually test anything while Library is a mock class
		user.register(new LibraryImpl());
		user.register(new LibraryImpl());
		assertEquals(7, user.getLibrary().getID());
	}
}
