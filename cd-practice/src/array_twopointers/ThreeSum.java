package array_twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {

	//two pointers 0(n2)time and 0(n) space due to sorting
	public static void main(String[] args) {
		int[] arr = {-1,0,1,2,-1,-4};
		//int[] arr = {0,1,1};
		//int arr[] = {0,0,0};
		Set<List<Integer>> result = findThreeSumTriplets(arr);
		System.out.println(result);
	}

	private static Set<List<Integer>> findThreeSumTriplets(int[] arr) {
		//sort the elements 
		Arrays.sort(arr);
		//set to store unique triplets
		Set<List<Integer>> result = new HashSet<>();
		
		//fix first element and try to find other two elements
		for(int i = 0; i < arr.length -2; i++) {
			//find other two elements using two sum approach
			int left = i + 1; 
			int right = arr.length - 1;
			
			while(left < right) {
				int sum = arr[i] + arr[left] + arr[right];
				if(sum == 0) {
					// add triplets and move to find other triplets
					result.add(Arrays.asList(arr[i], arr[left], arr[right]));
					left++;
					right--;
				}else if(sum > 0) {
					right--;
				}else {
					left++;
				}
			}
		}
		return result;
	}
}
