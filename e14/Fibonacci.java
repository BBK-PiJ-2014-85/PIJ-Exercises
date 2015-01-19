package e14;

public class Fibonacci {

	static int [] fibList;
	
	public static int fib(int n) {
		if ((n == 1) || (n == 2)) {
		return 1;
		} else {
		int result = fib(n-1) + fib(n-2);
		return result;
		}
		}
	
	public static int fibMem(int n)
	{
		fibList = new int[n];
		
		return fibMemInd(n);
	}
	
	private static int fibMemInd(int n)
	{
		if ((n==1) || (n==2)) return 1;
		if (fibList[n-1] != 0) return fibList[n-1]; 

		int value = fibMemInd(n-1) + fibMemInd(n-2);
		fibList[n-1] = value;
		return value;
	}
	
}
