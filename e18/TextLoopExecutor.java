package e18;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class TextLoopExecutor implements Runnable {
	
	public static final int COUNT = 10;
	
	private final String name;
	
	public TextLoopExecutor(String name) {
	this.name = name;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < COUNT; i++) {
	System.out.println("Loop:" + name + ", iteration:" + i + ".");
		}
	}
	
	public static void main(String args[]) {

		BlockingQueue<Runnable> q = new ArrayBlockingQueue<Runnable>(200);
		Executor ex = new ThreadPoolExecutor(10,100,1000,TimeUnit.SECONDS,q);
		
		if (args.length < 1 || (!args[0].equals("0") && !args[0].equals("1"))) {
				System.out.println("USAGE: java TextLoop <mode>");
				System.out.println(" mode 0: without threads");
				System.out.println(" mode 1: with threads");
		} else if (args[0].equals("0")) {
				for (int i = 0; i < 10; i++) {
				Runnable r = new TextLoopExecutor("Thread " + i);
				r.run();
				}
		} else {
			for (int i = 0; i < 10; i++) {
				Runnable r = new TextLoopExecutor("Thread " + i);
				ex.execute(r);
			}
		}
		((ExecutorService) ex).shutdownNow();
	}
	
}


