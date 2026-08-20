package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DifferentWaysOfThread {

	//1. using Thread class
	//2. using Runnable
	//3. ExecutorService
	public static void main(String[] args) {
		new ThreadA().run();
		ThreadB threadB = new ThreadB();
		threadB.run();
		new ExceCut().run();
	}
	
	
}
class ThreadA extends Thread{

	@Override
	public void run() {
		System.out.println("ThreadA is running");
	}
	
}

class ThreadB implements Runnable{

	@Override
	public void run() {
		System.out.println("ThreadB is running");
	}
	
}

class ExceCut{
	public void run() {
		ExecutorService service = Executors.newSingleThreadExecutor();
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("ThreadC running");
				
			}
		};
		service.execute(runnable);
		service.close();
	}
}