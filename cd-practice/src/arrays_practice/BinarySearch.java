package arrays_practice;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[] = {2,1,5,6,3,4};// {1,2,3,4,5,6}
		int target = 6;
		Arrays.sort(arr);
		int result = findTarget(arr, target);
		System.out.println("given target present at " + result);
	}

	private static int findTarget(int[] arr, int target) {
		int left = 0, right = arr.length -1;
		while(left<=right) {
			int mid = (left + right)/2;
			if(arr[mid] == target) {
				return mid;
			}else if(arr[mid] < target) {
				left = mid + 1;
			}else {
				right = mid - 1;
			}
		}
		return -1;
	}
}
