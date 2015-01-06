package e12;

import static org.junit.Assert.*;

import org.junit.Test;

import e8.HashUtilities;

public class TestHash {
	
	@Test
	public void testLowerBound() {
		
		for (int i=1; i <2000; i++)
		{
			int input = (int) (Math.random() * 100000000);
			int output = HashUtilities.shortHash(input);
			assertTrue(output>=0);
		}
	}
	
	@Test
	public void testUpperBound() {
		
		for (int i=1; i <2000; i++)
		{
			int input = (int) (Math.random() * 100000000);
			int output = HashUtilities.shortHash(input);
			assertTrue(output<1000);
		}
	}

}
