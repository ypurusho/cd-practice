package threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServ {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService service = Executors.newSingleThreadExecutor();
		service.execute(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("runnig thread");
				
			}
		});
		Future<String> result = service.submit(new Callable<String>() {

			@Override
			public String call() throws Exception {
				// TODO Auto-generated method stub
				return "Hello from Thread";
			}
			
		});
		System.out.println(result.get());
		service.shutdown();
	}
}
