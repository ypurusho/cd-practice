package arrays_practice;

public class PrintMaximumSumSubArray {

	public static void main(String[] args) {
		int[] arr = {2, 3, -8, 7, -1, 2, 3};
		printMaximumSumSubArray(arr);
	}

	private static void printMaximumSumSubArray(int[] arr) {
		int currSum = 0, maxSum = arr[0];
		//start and end to track max sub array
		int tempStart = 0, start = 0, end = 0;
		for(int i = 1; i < arr.length; i++) {
			//checks if new sub array else keep adding elements
			if(arr[i] > currSum + arr[i]) {
				currSum = arr[i];
				tempStart = i;
			}else {
				currSum += arr[i];
			}
			//keep updated sum 
			if(currSum > maxSum) {
				maxSum = currSum;
				start = tempStart;
				end = i;
			}
		}
		System.out.println("max sum " + maxSum);
		System.out.println("indices are " + start + " to " + end);
		System.out.print("sub array is [");
		for(int i = start; i <= end; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.println("]");
	}
}
