package array_prefixsum;

import java.util.HashMap;
import java.util.Map;

public class ContinousSubArraySum {

	//have to check if sum of subarray is divisible by k
	public static void main(String[] args) {
		int[] arr = {23,2,4,6,7};
		int  k = 6;
		boolean result = checkSumOfContinousSubArray(arr,k);
		System.out.println(result);
	}

	private static boolean checkSumOfContinousSubArray(int[] arr, int k) {
		int prefixSum = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(0, -1);
		for(int i = 0; i<arr.length; i++) {
			prefixSum += arr[i];
			System.out.println("prefixsum" + prefixSum);
			int reminder = prefixSum%k;
			System.out.println("reminder" + reminder);
			if(map.containsKey(reminder)) {
				if(i - map.get(reminder) >= 2) {
					return true;
				}
			}else {
				map.put(reminder, i);
			}
			System.out.println("map :" + map);
		}
		return false;
	}
}
