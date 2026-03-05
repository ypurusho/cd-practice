package collections_framework;

import java.util.Arrays;
import java.util.List;

public class FindSecondHighest {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,5,3,27,8,9);
		
		int largest = list.get(0);
		int secondLargest = list.get(1);
		
		for (Integer number : list) {
			if(number > largest) {
				largest = number;
			}
			if(number < largest && number > secondLargest) {
				secondLargest = number;
			}
		}
		System.out.println("largest" + largest);
		System.out.println("second largest " + secondLargest);
	}
}
