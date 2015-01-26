package e15;

import java.util.ArrayList;
import java.util.List;



public class PrimeDivisorListImpl implements PrimeDivisorList{

	List list = new ArrayList();
	
	@Override
	public void add(Integer i) {
	
		if (i==null) throw new NullPointerException();
		
		if (!isPrime(i) || i<=0) throw new IllegalArgumentException();
		
		list.add(i);
	}
	
	private boolean isPrime(Integer value)
	{
		for (int i=2 ; i < value; i++) if (value % i == 0) return false;		
		return true;
	}
	
	@Override
	public String toString()
	{
		boolean first = true;
		
		list.sort(null);
		String output = "[ ";
		int current = 0;
		int numCurrent = 0;
		for (int i = 0; i < list.size(); i++)
		{
			if ( ((int) list.get(i)) == current) numCurrent++;
			else
			{
				if (numCurrent == 1) 
				{
					output += (!first? "* " : "") + current + " ";
					if (first) first = false;
				}
				else if (numCurrent > 1)
				{
					output += (!first? "* " : "") + current + "^" + numCurrent + " ";
					if (first) first = false;
				}
				
				current = (int)list.get(i);
				numCurrent = 1;
			}
		}
		
		if (numCurrent == 1) 
		{
			output += (!first? "* " : "") + current + " ";
		}
		else if (numCurrent > 1)
		{
			output += (!first? "* " : "") + current + "^" + numCurrent + " ";
		}
				
		int product = 1;
		
		for (int i=0; i < list.size(); i++) product *= (int) list.get(i); 
			 
		return output + "= " + product + " ]";
	}
	

}
