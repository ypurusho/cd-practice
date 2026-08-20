package java8features;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.function.Function;

public class CompletableFutureExample {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		CompletableFuture<String> future = CompletableFuture.supplyAsync(()-> "Hello World");
		System.out.println(future.get());
		
		Function<Throwable, Integer> func = (ex) -> { System.out.println(ex); return 0;};
		
		CompletableFuture<Integer> inte = CompletableFuture.supplyAsync(() -> 10/0)
				.exceptionally((ex) -> { 
//					System.out.println(ex); fallback value 0
					return 0;
				});
		System.out.println(inte.get());
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		};
		//async just to execute
		CompletableFuture<Void> comp = CompletableFuture.runAsync(()-> {System.out.println("Running ");});
		
		
	}
}
