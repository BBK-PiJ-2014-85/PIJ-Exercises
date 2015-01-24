package e14;

public class Sort {

	public static int[] mergeSort(int[] list)
	{
		if (list.length == 1 || list.length == 0) return list;
		else
		{
			int firstNum = (int) (list.length / 2);
			int[] list1 = mergeSort(ArrayMethods.first(list, firstNum));
			int[] list2 = mergeSort(ArrayMethods.last(list, list.length - firstNum));
			
			int[] rtnList = new int[list.length];
			int c1=0, c2=0, added=0;
			
			while(added < list.length)
			{
				if (c1 >= list1.length) 
				{
					rtnList[added] = list2[c2];
					c2++;
				}
				else if (c2 >= list2.length)
				{
					rtnList[added] = list1[c1];
					c1++;
				}
				else if (list1[c1] > list2[c2])
				{
					rtnList[added] = list2[c2];
					c2++;
				}
				else 
				{
					rtnList[added] = list1[c1];
					c1++;
				}
				added++;
			}

			return rtnList;
	
		}
	}
	
	public static int[] quickSort(int[] list)
	{
		if (list.length == 1 || list.length == 0) return list;
		else
		{
			int[] rtnList = new int[list.length];
			int[] lower = new int[list.length];
			int[] higher = new int[list.length];
			
			int c1=0, c2=0;
			
			for (int i = 1; i < list.length; i++)
			{
				if (list[i] <= list[0])
				{
					lower[c1] = list[i];
					c1++;
				}
				else
				{
					higher[c2] = list[i];
					c2++;
				}
			}
			
			int[] sortedLower = quickSort(ArrayMethods.trimList(lower, c1));
			int[] sortedHigher = quickSort(ArrayMethods.trimList(higher, c2));
			
			int added = 0;
			
			for (int  i=0; i < sortedLower.length; i++)
			{
				rtnList[added] = sortedLower[i];
				added++;
			}
			
			rtnList[added] = list[0];
			
			for (int i = 0; i < sortedHigher.length; i++)
			{
				rtnList[added] = sortedHigher[i];
				added++;
			}
			
			return rtnList;
			
		}
	}
	
	
}
