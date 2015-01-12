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
		user.setLibrayID(12345678);
		assertEquals(user.getLibraryID(),12345678);
	}
	
	@Test
	public void testNullID()
	{
		assertNull(user.getLibraryID());
	}
	
	@Test
	public void testReplaceNormal()
	{
		user.setLibrayID(123);
		user.setLibrayID(456);
		assertEquals(user.getLibraryID(), 456);
	}
	

}
