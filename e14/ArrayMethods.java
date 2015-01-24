package e14;

public class ArrayMethods {

	/**
	 * 
	 * Returns the first n elements of an array.
	 * 
	 * @param list list of array to split
	 * @param n the number of elements to take from the start of the list
	 * @return the first n elements of the list
	 */
	
	public static int[] first(int[] list, int n)
	{
		int[] output = new int[n];
		for (int i =0; i < n; i++)
		{
			output[i] = list[i];
		}
		
		return output;
	}
	
	public static int[] last(int[] list, int n)
	{
		int[] output = new int[n];
		if (n==0) return output;
		int c=0;
		for (int i = (list.length - n); i< list.length; i++)
		{
			output[c] = list[i];
			c++;
		}
		
		return output;
	}
	
	public static void printArray(int[] input)
	{
		for (int item : input)
		{
			System.out.print(item + ", ");
		}
		System.out.println();
	}
	
	public static int[] trimList(int[] list, int n)
	{
		int[] rtn = new int[n];
		for (int i =0; i < n; i++)
		{
			rtn[i] = list[i];
		}
		return rtn;
	}
	
	
}
