package e15;

import java.util.ArrayList;
import java.util.List;

public class Exercise2Class {

	public static void main(String[] args)
	{
		List list = new ArrayList();
		try {
			String thing = "word";
			thing = null;
			thing.length();
			System.out.println("Here");
		} catch (NullPointerException ex) { ex.printStackTrace(); System.out.println("Exception caused");
		}catch (Exception ex) { ex.printStackTrace();
		} 
	}
	
}
