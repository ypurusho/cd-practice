package arrays;

public class MaximumSumSubarray {

	public static void main(String[] args) {
		int arr[] = {2,1,5,1,3,2};
		int k = 3;
		//using sliding window pattern 
		//[2,1,5] = 8
		//[1,5,1] = 7
		//[5,1,3] = 9
		//[1,3,2] = 6
		//use Math.min for minimum sum sub array
		int result = maxSum(arr,k);
		System.out.println(result);
	}

    public static int maxSum(int[] arr, int k) {
        if (arr.length < k) {
            return -1;
        }

        int windowSum = 0;

        // First window
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        System.out.println("first window sum "+ windowSum);
        int maxSum = windowSum;

        // Slide the window
        for (int i = k; i < arr.length; i++) {
        	System.out.println("slide window from i "+i);
            windowSum = windowSum - arr[i - k] + arr[i];
            System.out.println(windowSum);
            maxSum = Math.max(maxSum, windowSum);
            System.out.println("maxSum "+maxSum);
        }

        return maxSum;
    }
}
