package array_kadanesalgorithm;

public class MaximumSubarray {

	//using kadane's algorithm since -ve numbers present and requirement is only maximum sum
	//keep adding sum of numbers. if sum is -ve reset to zero. finally keep track of max sum so far
	//o(n) and o(1)
	public static void main(String[] args) {
		int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
		int result = findMaximumSubArraySum(arr);
		System.out.println(result);
	}

	private static int findMaximumSubArraySum(int[] arr) {
		int maxSum = 0;
		int currentSum = 0;
		for(int i = 0; i<arr.length; i++) {
			currentSum += arr[i];
			if(currentSum < 0) {
				currentSum = 0;
			}
			maxSum = Math.max(maxSum, currentSum);
		}
		return maxSum;
	}
}
