package arrays_practice;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		int[] array = {1,2,4,5,6};
		int target = 5;
		int[] result = findTwoSum(array, target);
		System.out.println(array[result[0]] +", "+ array[result[1]]);
	}

	private static int[] findTwoSum(int[] array, int target) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i< array.length; i++) {
			int complement = target - array[i];
			if(map.containsKey(complement)) {
				return new int [] {map.get(complement), i};
			}
			map.put(array[i], i);
		}
		return new int[]{-1,-1};
	}
}
