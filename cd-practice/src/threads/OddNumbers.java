package threads;

import java.util.List;

public class OddNumbers implements Runnable {

	private List<Integer> numbers;
	
	public OddNumbers(List<Integer> numbers) {
		super();
		this.numbers = numbers;
	}

	public List<Integer> getNumbers() {
		return numbers;
	}

	public void setNumbers(List<Integer> numbers) {
		this.numbers = numbers;
	}

	@Override
	public void run() {
		if(this.numbers != null && !this.numbers.isEmpty()) {
			System.out.println("odd numbers are : ");
			this.numbers.stream().filter(num -> num % 2 != 0).forEach(System.out::println);
		}else {
			System.out.println("no numbers found");
		}
	}
	

}
