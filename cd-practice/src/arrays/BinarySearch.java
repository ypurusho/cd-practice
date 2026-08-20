package arrays;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int array[] = {1,2,3,4,5,6,7,8};
		int target = 8;
		//binary search is useful for sorted array o(logn)
		Arrays.sort(array);
		int result = findTarget(array, target);
		System.out.println("result " + result);
	}

	private static int findTarget(int[] array, int target) {
		int left = 0, right = array.length-1;
		while(left <= right) {
			int mid = (left + right)/2;
			if(array[mid] == target) {
				return mid;
			}else if(array[mid] < target) {
				left = mid + 1;
			}else {
				right = mid -1;
			}
		}
		return -1;
		
	}
}
