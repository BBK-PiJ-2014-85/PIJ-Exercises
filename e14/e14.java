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
		/*
		List<String> anagram = Anagrams.Anagram("and");
		
		for (String word : anagram) System.out.println(word);
		*/
		
		//Exercise 3 
		/*
		List<Integer> hailstone = HailstoneNumbers.hailstone(50);
		for (Integer num : hailstone) System.out.println(num);
		*/
		
		//Exercise 4:
		//System.out.println(BinarySearch.contains(new int[] {1,2,3,4,5,6,7}, 3));
		//System.out.println(BinarySearch.contains(new int[] {1,2,3,4,5,6,7}, 6));
		//System.out.println(BinarySearch.contains(new int[] {1,2,3,4,5,6,7}, 9));
		//System.out.println(BinarySearch.contains(new int[] {1,2,3,4,5,6}, -1));
	
		//Exercise 5
		ArrayMethods.printArray(Sort.mergeSort(new int[] {1,4,6,2,5,7,8,9}));
		ArrayMethods.printArray(Sort.quickSort(new int[] {1,4,6,2,5,7,8,9}));
		
		
	}
	
	
}
