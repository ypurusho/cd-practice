package array_prefixsum;

import java.util.HashMap;
import java.util.Map;

public class SubArraySumEqualsK {

	//using prefix sum instead of kadanes algo. is because problems asks count of such sub arrays instead of total sum
	//some times input can have -ve nums as well so here prefix sum 
	//o(n) & 0(n) space
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		int k = 3;
		int result = findCountOfSubArrays(arr, k);
		System.out.println(result);
	}

	private static int findCountOfSubArrays(int[] arr, int k) {
		//to store count of sub arrays
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		//always keep 0 as frequency 1
		map.put(0,1);
		int count = 0;
		for(int i = 0; i<arr.length; i++) {
			int target = k - arr[i];
			if(map.containsKey(target)) {
				count++;
			}else {
				map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
			}
		}
		
		return count;
	}
}
