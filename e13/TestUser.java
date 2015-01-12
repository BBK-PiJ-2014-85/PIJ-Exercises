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
		user.setLibraryID(12345678);
		assertEquals(user.getLibraryID(),12345678);
	}
	
	@Test
	public void testNullID()
	{
		assertEquals(user.getLibraryID(),0);
	}
	
	@Test
	public void testReplaceNormal()
	{
		user.setLibraryID(123);
		user.setLibraryID(456);
		assertEquals(user.getLibraryID(), 456);
	}
	
	@Test
	public void testRegister()
	{
		user.register(new Library());
		assertEquals(user.getLibrary().getLibrary(), "Library name here");
		assertEquals(user.getLibrary().getID(), 7);
	}
	
	@Test 
	public void testIDUpdated()
	{
		user.register(new Library());
		assertEquals(7, user.getLibraryID());
	}
	
	@Test 
	public void testLibraryNull()
	{
		assertNull(user.getLibrary());
	}
	
	@Test
	public void testLibrarySetNullAfterOne()
	{
		user.register(new Library());
		user.register(null);
		assertNull(user.getLibrary());
	}
	
	@Test
	public void testLibraryIDSetZeroAfterLibrarySetNull()
	{
		user.register(new Library());
		user.register(null);
		assertEquals(0, user.getLibraryID());
	}
	
	@Test
	public void testLibraryReplacesSucessfully()
	{ //Doesnt actually test anything while Library is a mock class 
		user.register(new Library());
		user.register(new Library());
		assertEquals(user.getLibrary().getLibrary(), "Library name here");
		
	}
	
	@Test
	public void testLibraryReplacesIDWhenSucessfully()
	{ //Doesnt actually test anything while Library is a mock class
		user.register(new Library());
		user.register(new Library());
		assertEquals(7, user.getLibrary().getID());
	}
}
