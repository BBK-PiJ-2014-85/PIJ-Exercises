package e12;

import static org.junit.Assert.*;



import org.junit.Before;
import org.junit.Test;

import e8.SimpleMap;
import e8.MySimpleMap;

public class TestSimpleMap {

	SimpleMap map;

	@Before
	public void setUpMap() {
		map = new MySimpleMap();
	}
	
	
	@Test
	public void testIsEmptyAtStart(){
		assertTrue(map.isEmpty());
	}
	
	@Test
	public void testIsEmptyHavingRemoved(){
		map.put(5,"five");
		map.remove(5);
		assertTrue(map.isEmpty());
	}
	
	@Test
	public void testIsNotEmptyHavingHadOneAdded(){
		map.put(5,"five");
		assertFalse(map.isEmpty());
	}
	
	@Test
	public void testIsNotEmptyAfterAddRemoveAdd(){
		map.put(5,"five");
		map.remove(5);
		map.put(6, "six");
		assertFalse(map.isEmpty());
	}
	
	@Test
	public void testRetrieveOnEmpty()
	{
		assertNull(map.get(0));
	}
	
	@Test
	public void testNullWhenRetrieveNotExist()
	{
		map.put(1,"one");
		assertNull(map.get(2));
	}

	@Test
	public void testAddOneAndGet()
	{
		map.put(-1, "minus one");
		assertEquals(map.get(-1),"minus one");
	}
	
	@Test
	public void testAddSameValueTwice()
	{
		map.put(1, "one");
		map.put(1, "two");
		assertEquals(map.get(1),"one");
	}
	
	@Test
	public void testAddRemoveAdd()
	{
		map.put(1,"zero");
		map.remove(1);
		map.put(1, "one");
		assertEquals(map.get(1),"one");
	}
	
	@Test
	public void testAddRetrieveMatchOnMultiple()
	{
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		assertEquals(map.get(1), "one");
		assertEquals(map.get(2),"two");
		assertEquals(map.get(3),"three");
	}

	@Test
	public void testAddRetrieveNoMatchOnMultiple()
	{
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		map.remove(4);
		assertEquals(map.get(1), "one");
		assertEquals(map.get(2),"two");
		assertEquals(map.get(3),"three");
		assertNull(map.get(4));
	}
	
	@Test
	public void testRetrieveOnceRemoved()
	{
		map.put(1,"one");
		map.remove(1);
		assertNull(map.get(1));
	}
	
	@Test
	public void testRetriveOnceRemovedOnMultiple()
	{
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		map.remove(2);
		assertEquals(map.get(1), "one");
		assertNull(map.get(2));
		assertEquals(map.get(3),"three");
	}
	
	@Test
	public void testRetrieveSameValueTwice()
	{
		map.put(1, "one");
		assertEquals(map.get(1), "one");
		assertEquals(map.get(1), "one");
	}
	
	@Test
	public void testAddingSameValueAfterRemoving()
	{
		map.put(1, "zero");
		map.remove(1);
		map.put(1, "one");
		assertEquals(map.get(1),"one");
	}
	

}
