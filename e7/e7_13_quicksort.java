package e7;

import java.util.Random;

public class e7_13_quicksort {

	public static void main(String[] args) {
		
		int[] bigArray = new int[1000];
		Random ran = new Random();
		for (int i = 0; i < bigArray.length; i++)
		{
			bigArray[i] = ran.nextInt(1000);
		}
		
		LinkedListInt list1 = ListUtilities.createList(bigArray);
		Long start1 = System.currentTimeMillis();
		ListUtilities.cocktailSort(list1);
		Long finish1 = System.currentTimeMillis();
		System.out.println("Sorting the list took " + (finish1 - start1) + " milliseconds");
		list1.printList();
		
		
		LinkedListInt list2 = ListUtilities.createList(bigArray);
		Long start2 = System.currentTimeMillis();
		ListUtilities.quickSort(list2);
		Long finish2 = System.currentTimeMillis();
		System.out.println("Sorting the list took " + (finish2 - start2) + " milliseconds");
		
		LinkedListInt list3 = ListUtilities.createList(bigArray);
		Long start3 = System.currentTimeMillis();
		ListUtilities.quickSort(list3);
		Long finish3 = System.currentTimeMillis();
		System.out.println("Sorting the list took " + (finish3 - start3) + " milliseconds");

		LinkedListInt list4 = ListUtilities.createList(bigArray);
		Long start4 = System.currentTimeMillis();
		ListUtilities.cocktailSort(list4);
		Long finish4 = System.currentTimeMillis();
		System.out.println("Sorting the list took " + (finish4 - start4) + " milliseconds");

		//Quicksort is slower....:( Maybe I have done something wrong, or maybe it needs more 
		
	}

}
