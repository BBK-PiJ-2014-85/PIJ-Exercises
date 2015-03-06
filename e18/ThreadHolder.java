package e18;

public class ThreadHolder implements Runnable {

	Thread threadManager;
	Runnable command;

	
	public ThreadHolder(Thread tm, Runnable command)
	{
		threadManager = tm;
		this.command = command;
	}
	
	@Override
	public void run() {
		command.run();
	//	threadManager.lowerCount();
		notify();
		
	}


}
