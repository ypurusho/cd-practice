package array_twopointers;

import java.util.HashMap;

public class TwoSumHashMap {

	public static void main(String[] args) {
		int [] arr = {2,3,4};
		int [] result = printTwoSum(arr, 5);
		System.out.println(result[0] +"," + result[1]);
	}

	private static int[] printTwoSum(int[] arr, int target) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i<arr.length; i++) {
			int complement = target - arr[i];
			System.out.println("complement"+complement);
			if(map.containsKey(complement)) {
				System.out.println("map contains");
				return new int[] {map.get(complement), i};
			}else {
				System.out.println("map puts complement " + complement +" at index " + i);
				map.put(arr[i], i);
			}
		}
		return new int[] {-1,-1};
	}
}
