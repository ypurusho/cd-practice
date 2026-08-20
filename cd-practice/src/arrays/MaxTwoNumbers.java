package arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MaxTwoNumbers {

	public static void main(String[] args) {
		int[] array = {1,2,6,4,9,8,7};
		List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
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
		
		//using arrays.sort
		Arrays.sort(array);
		System.out.println("using array sort first max is : " + array[array.length - 1]);
		System.out.println("using array sort second max is : " + array[array.length - 2]);
		
		//using streams
		List<Integer> finalList = list.stream().sorted(Comparator.reverseOrder()).limit(2).collect(Collectors.toList());
		finalList.stream().forEach(number -> {System.out.println(number);});
	}
}
