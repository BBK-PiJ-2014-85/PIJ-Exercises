package e12;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import e8.PersonQueue;
import e8.SupermarketPersonQueue;
import e8.SupermarketPersonQueue2;
import e8.ForeignQueueLink;

import e8.Person;

@RunWith(Parameterized.class)
public class TestPersonQueue {

	private PersonQueue q;
	
	public TestPersonQueue(PersonQueue q)
	{
		this.q=q;
	}
	
	@Parameters
	public static Collection<Object[]> process()
	{
	Object[][] data = new Object[][] 
			{
			{new SupermarketPersonQueue()},
			{new SupermarketPersonQueue2()},
			{new ForeignQueueLink()}
			};
	return Arrays.asList(data);
	}
	
	//check adding when size of list is zero
	
	@Before 
	public void run()
	{
		q = new SupermarketPersonQueue();
	}
	
	@Test
	public void testRetrieveFromEmpty() {
		assertNull(q.retrieve());
	}

	
	@Test
	public void testOneRetrieve() {
		Person a = new Person("Jack", 54);
		q.insert(a);
		assertEquals(q.retrieve(), a);
	}
	
	public void testRetrieveEmtptyAfterInsert()
	{
		Person a = new Person("Jack", 54);
		q.insert(a);
		q.retrieve();
		assertNull(q.retrieve());
		
	}
	
	@Test
	public void testTwoRetrieve() {
		Person a = new Person("Jack", 54);
		Person b = new Person("Jill", 40);
		q.insert(a);
		q.insert(b);
		assertEquals(q.retrieve(), a);
		assertEquals(q.retrieve(), b);
		
	}

	@Test
	public void testAddMany() {
		
		Person p = new Person("First", 24);
		q.insert(p);
		for (int i=1; i <=1000; i++)
		{
			Person a = new Person("Temp person", 30);
			q.insert(a);
		}

		assertEquals(q.retrieve(), p);
		
	}

}
