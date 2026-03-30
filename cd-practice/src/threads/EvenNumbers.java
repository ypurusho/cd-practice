package threads;

import java.util.List;

public class EvenNumbers extends Thread{

	private List<Integer> numbers;
	
	public EvenNumbers(List<Integer> numbers) {
		super();
		this.numbers = numbers;
	}

	public List<Integer> getEvenNumbers() {
		return numbers;
	}

	public void setEvenNumbers(List<Integer> evenNumbers) {
		this.numbers = evenNumbers;
	}


	@Override
	public void run() {
		if(this.numbers != null && !this.numbers.isEmpty()) {
			System.out.println(this.getName() + " is running");
			System.out.println("Even numbers are : ");
			this.numbers.stream().filter(number -> number % 2 == 0).forEach(System.out::println);
		}else {
			System.out.println("no numbers found");
		}
	}

	
}
