package designpatterns;

public class DoubleLockChecking {

	private static volatile DoubleLockChecking instance;
	
	private DoubleLockChecking() {}
	
	public static DoubleLockChecking getInstance() {
		if(instance == null) {
			synchronized (DoubleLockChecking.class) {
				if(instance == null) {
					instance = new DoubleLockChecking();
				}
			}
		}
		return instance;
	}
}
