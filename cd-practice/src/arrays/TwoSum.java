package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		int[] array = {1,2,4,5,6};
		int target = 5;
		
		int[] result = findTwoSumArray(array, target);
		for (int i = 0; i < result.length; i++) {
			System.out.println(array[result[i]]);
		}
		//Arrays.asList(result).stream().forEach(item -> System.out.println(item));
		
	}

	private static int[] findTwoSumArray(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);
        }

        return new int[0]; // unreachable since problem guarantees one solution
    }
}
