package e17;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.lang.NumberFormatException;

public class ResponsiveUI implements Runnable  {

	private int waitTime = 0;
	private int runNum = 0;
	private static int runCount=1;
	private static List<Integer> finished = new ArrayList<Integer>();
	//private static boolean finishedFlag = false;
	
	public static void main(String[] args)
	{
		boolean quit = false;
		
		Scanner kb = new Scanner(System.in);
		
		int waitInt = 0;
		
		while (!quit)
		{
			try {
				
				if (ResponsiveUI.finished.size() > 0)
				{
					ResponsiveUI.printList();
				}

				System.out.print("Enter the duration (in ms) of task " + ResponsiveUI.runCount + ": ");
				String next = kb.next();
				if (next.equals("q")) quit = true;
				else
				{
					waitInt = Integer.parseInt(next);
					ResponsiveUI rui = new ResponsiveUI(waitInt);
					Thread t = new Thread(rui);
					t.start();
				}
			} catch (NumberFormatException e)
			{
				System.out.println("Not a valid number. Please try again");
			}
		}
		
		
	}
	
	public synchronized static void printList()
	{
		System.out.print("Finished Tasks:");
		
		for (Integer num : finished  ){ System.out.print(" " + num); } //Could add a wait and notifyAll() etc with flag if its in use.
		System.out.println();
		finished.clear();
	}

	public ResponsiveUI(int waitTime)
	{
		this.waitTime = waitTime;
		runNum = runCount;
		runCount++;
	}
	
	@Override
	public void run() {
		
		try 
		{
		Thread.sleep(waitTime);
		} catch (InterruptedException ex)
		{
			System.out.println("Run " + runNum + " was interrupted.");
		}
		
		finished.add(runNum);
	}

}