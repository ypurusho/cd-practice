package array_slidingwindow;

public class MinimumSizeSubarraySum {

	public static void main(String[] args) {
		int arr[] = {2,3,1,2,4,3};
		//int arr[] = {1,1,1,1,1,1,1,1};
		int target = 7;
		int result = findMinimumSubArray(arr,target);
		System.out.println(result);
	}

	private static int findMinimumSubArray(int[] arr, int target) {
		int left = 0;
		int minLength = Integer.MAX_VALUE;
		int sum = 0;
		for(int right = 0; right <arr.length; right++) {
			sum += arr[right];
			
			while(sum >= target) {
				minLength = Math.min(minLength, right-left +1);
				sum = sum - arr[left];
				left++;
			}
			
		}
		return minLength == Integer.MAX_VALUE ? 0 : minLength;
	}
}
