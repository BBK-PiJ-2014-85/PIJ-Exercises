package e14;

import java.util.List;

public class e14 {

	public static void main (String[] args)
	{
		//Exercise 1:
		/*
		long startTime = System.nanoTime();
		int fib40 = Fibonacci.fib(40);
		long endTime = System.nanoTime();
		System.out.println("Answer for 40 is " + fib40 + " without memoization and took " + (endTime-startTime)  + " milliseconds");

		startTime = System.nanoTime();
		fib40 = Fibonacci.fibMem(40);
		endTime = System.nanoTime();
		System.out.println("Answer for 40 is " + fib40 + " with memoization and took " + (endTime-startTime)  + " milliseconds");
		
		startTime = System.nanoTime();
		int fib45 = Fibonacci.fib(45);
		endTime = System.nanoTime();
		System.out.println("Answer for 45 is " + fib45 + " without memoization and took " + (endTime-startTime) + " milliseconds");

		startTime = System.nanoTime();
		fib45 = Fibonacci.fibMem(45);
		endTime = System.nanoTime();
		System.out.println("Answer for 45 is " + fib45 + " with memoization and took " + (endTime-startTime)  + " milliseconds");
		*/
		//Exercise 2:
		
		List<String> anagram = Anagrams.Anagram("and");
		
		for (String word : anagram) System.out.println(word);
		
	}
	
}
