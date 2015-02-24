package e18;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;

public class ExecutorImpl implements Executor{

	int threadNum;
	
	public static void main(String[] args)
	{
		ExecutorImpl ex = new ExecutorImpl(2,5);

		ex.execute(new WaitSecs(1,5));
		ex.execute(new WaitSecs(2,1));
	//	ex.execute(new WaitSecs(3,3));
	//	ex.execute(new WaitSecs(4,3));
	}
	
	
	BlockingQueue<Runnable> queue; 
	List<Thread> threads = new ArrayList<Thread>();
	List<ExecutorImplThread> scripts = new ArrayList<ExecutorImplThread>();
	public ExecutorImpl(int threadNum, int maxQueueSize)
	{

		queue = new ArrayBlockingQueue<Runnable>(maxQueueSize);
		ExecutorImplThread tempThread;

		System.out.println(2);		
		for (int i=1; i<= threadNum; i++) 
		{
			tempThread = new ExecutorImplThread(i, queue);
			scripts.add(tempThread);
			threads.add(new Thread(new ExecutorImplThread(i, queue)));
		}
		System.out.println(3);
		
		for (Thread t : threads) t.start();
	}
		
	@Override
	public void execute(Runnable command) {
		System.out.println("Adding command.");
		try {
			System.out.println("Adding command.");
			queue.put(command);
			notifyAll();
		} catch (InterruptedException e) {
			execute(command);
		} catch (IllegalMonitorStateException e)
		{
			System.out.println("Notifying all that command has run ");
		}
	}
	
	public void stopAll()
	{
		for (ExecutorImplThread t : scripts) t.stopRunning();
		
		notifyAll();
	}
}

