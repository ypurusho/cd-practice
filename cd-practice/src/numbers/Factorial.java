package numbers;

public class Factorial {

	public static void main(String[] args) {
		int number = 3;
		System.out.println("factorial of " + number + " is : " + findFactorial(number));

	}

	public static int findFactorial(int n) {
		if(n == 1) {
			return n;
		}else
			return n* findFactorial(n - 1);
	}
}
