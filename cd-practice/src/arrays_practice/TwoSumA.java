package arrays_practice;

import java.util.HashMap;
import java.util.Map;

public class TwoSumA {

	public static void main(String[] args) {
		int[] array = {1,2,4,5,6};
		int target = 5;
		int[] result = findTwoSum(array, target);
		System.out.println(array[result[0]] +", "+ array[result[1]]);
	}

	//{1,2,4,5,6}
	//0  1 2 3 4
	//complement = 5 - 1 = 4
	//map.contains complemet = false
	//map.put(1,0)
	//complemet = 5 -2 = 3
	//map.contains = false
	//map.put(2,1)
	//complement = 5 - 4 = 1
	//map.contains complete = true
	//return new int[] {map.get(1), i}; {0,2}
	private static int[] findTwoSum(int[] array, int target) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < array.length; i++) {
			int complement = target - array[i];
			if(map.containsKey(complement)) {
				return new int[] {map.get(complement), i};
			}else
				map.put(array[i], i);
		}
		return new int[] {-1,-1};
	}
}
