package array_slidingwindow;

import java.util.Arrays;
import java.util.List;

public class MaximumSumSubArrayOfSizeK {

	public static void main(String[] args) {
		int arr[] = {1,3,4,5,6,7};
		int k = 3;
		int result = findMaxSumSubArray(arr,k);
		System.out.println(result);
	}

	private static int findMaxSumSubArray(int[] arr, int k) {
		int windowSum = 0;
		//sum of first window
		for(int i = 0; i < k; i++) {
			windowSum += arr[i];
		}
		int maxSum = windowSum;
		for(int i = k; i < arr.length; i++ ) {
			windowSum = windowSum + arr[i] - arr[i-k];
			maxSum = Math.max(windowSum, maxSum);
		}
		return maxSum;
	}
}
