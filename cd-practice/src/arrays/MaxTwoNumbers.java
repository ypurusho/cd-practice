package arrays;

import java.util.Arrays;
import java.util.List;

public class MaxTwoNumbers {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
		int[] array = {1,2,6,4,9,8,7};
		Integer firstMax = -1;
		Integer secondMax = -1;
		for (int i = 0; i < array.length; i++) {
			if(array[i] > firstMax) {
				secondMax = firstMax;
				firstMax = array[i];
			}
			else if(array[i] < firstMax && array[i] > secondMax) {
				secondMax = array[i];
			}
		}
		System.out.println("first Max " + firstMax);
		System.out.println("second Max " + secondMax);
	}
}
