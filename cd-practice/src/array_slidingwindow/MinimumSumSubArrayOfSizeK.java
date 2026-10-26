package array_slidingwindow;

public class MinimumSumSubArrayOfSizeK {

	public static void main(String[] args) {
		int arr[] = {1,3,4,5,6,7};
		int k = 3;
		int result = findMinSumSubArray(arr,k);
		System.out.println(result);
	}

	private static int findMinSumSubArray(int[] arr, int k) {
		int windowSum = 0;
		for(int i = 0; i < k; i++) {
			windowSum += arr[i];
		}
		int minSum = windowSum;
		for(int i = k; i < arr.length; i++) {
			windowSum = windowSum + arr[i] - arr[i-k];
			minSum = Math.min(minSum, windowSum);
		}
		return minSum;
	}
}
