package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumPairsOfNumbers {

	public static void main(String[] args) {
		int[] array = {1, 5, 7, -1, 5};
		int input = 12;
		List<List<Integer>> list = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			for (int j =i+1; j < array.length; j++) {
				if(array[i] + array[j] == input) {
					list.add(Arrays.asList(array[i], array[j]));
				}
			}
		}
		System.out.println(list);
	}
}
