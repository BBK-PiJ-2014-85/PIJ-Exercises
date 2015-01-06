package e12;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TestPerson {
	private String input;
	private String expected;
	
	public TestPerson(String input, String expected)
	{
		this.input = input;
		this.expected = expected;
	}

	@Parameters
	public static Collection<Object[]> process()
	{
	Object[][] data = new Object[][] 
			{
			{"Me","M"},
			{"Apple Banana Cabbage", "ABC"},
			{"Apple  Banana Cabbage", "ABC"}
			};
	return Arrays.asList(data);
	}
	
	
	@Test
	public void testGetInitials() {
		Person p = new Person();
		String output = p.getInitials(input);
		assertEquals(expected, output);
	}
	
	

}
