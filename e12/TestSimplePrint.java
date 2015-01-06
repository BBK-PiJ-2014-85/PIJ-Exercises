package e12;


import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;



public class TestSimplePrint {

	private ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	
	@Before
	public void setUpStreams() {
		System.setOut(new PrintStream(outContent));
	}

	@After
	public void  cleanUpStream() {
		System.setOut(null);
	}
	
	@Test
	public void test() {
		System.out.println("hello");
		assertEquals("hello\n", outContent.toString());
	}
	


}
