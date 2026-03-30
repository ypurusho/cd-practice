package threads;

import java.util.Arrays;
import java.util.List;

import com.sun.tools.javac.Main;

public class EvenAndOddNumbers {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
		EvenNumbers even = new EvenNumbers(numbers);
		even.setName("even thread");
		even.run();
		OddNumbers odd = new OddNumbers(numbers);
		Thread oddThread = new Thread(odd);
		oddThread.setName("odd thread");
		System.out.println(oddThread.getName() + " is running");
		oddThread.run();
		
	}
}

