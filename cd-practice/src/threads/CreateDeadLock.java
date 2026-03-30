package threads;

public class CreateDeadLock {

	public static void main(String[] args) {
		
		Resource resourceA = new Resource("Resource A");
		Resource resourceB = new Resource("Resource B");
		Thread t1 = new Thread(()-> resourceA.use(resourceB), "Thread 1");
		Thread t2 = new Thread(()-> resourceB.use(resourceA), "Thread 2");
		t1.start();
		t2.start();
	}
}
class Resource {
	
	private String name;
	
	public Resource(String name) {
		this.name = name;
	}
	
	 void use(Resource other) {
		//locking current resource first
		synchronized (this) {
			System.out.println(Thread.currentThread().getName() + " locks " + this.name);
			try {
				Thread.sleep(100);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " waiting for " + other.name);
			//locking other resource
			synchronized (other) {
				System.out.println(Thread.currentThread().getName() + " locks " + other.name);
			}
		}
		
	}
}
