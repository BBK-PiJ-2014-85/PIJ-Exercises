package e15;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestPrimeDivisorList {

	PrimeDivisorList list;
	
	@Before 
	public void setUpTest()
	{
		list = new PrimeDivisorListImpl();
	}
	
	@Test
	public void testAddPrime() {
		list.add(5);
		assertEquals("[ 5 = 5 ]",list.toString());
	}
	
	@Test
	public void testTwoPrimes() {
		list.add(5);
		list.add(7);
		assertEquals("[ 5 * 7 = 35 ]",list.toString());
	}
	
	@Test
	public void testTwoPrimesSame() {
		list.add(5);
		list.add(5);
		list.add(3);
		assertEquals("[ 3 * 5^2 = 75 ]",list.toString());
	}
	
	@Test(expected=NullPointerException.class)
	public void testAddNull() {
		list.add(null);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testAddNonPrime() {
		list.add(4);
	}

	
	
}
