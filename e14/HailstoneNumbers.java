package e14;

import java.util.ArrayList;
import java.util.List;

public class HailstoneNumbers {

	//As always converges to one, cannot go to same point twice and so no advantage from memoization
	
	public static List<Integer> hailstone(int n)
	{
		List<Integer> list = new ArrayList<Integer>();
		
		return getHailstone(list, n);
		
	}
	
	private static List<Integer> getHailstone(List<Integer> list, int n)
	{
		list.add(n);
		
		if (n==1) return list;
		
		if (n%2 == 0) return getHailstone(list, n/2);
		
		return getHailstone(list, 3*n + 1);
	}
	
}
