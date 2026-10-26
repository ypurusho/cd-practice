package arrays_practice;

public class MaximumSumSubArray {

	public static void main(String[] args) {
		int[] arr = {2, 3, -8, 7, -1, 2, 3};
		printMaximum(arr);
	}

	private static void printMaximum(int[] arr) {
		int currenSum = arr[0], maxSum = arr[0];
		
		for(int i = 1; i < arr.length ; i++) {
			//calculate sum of curren element & previous element
			currenSum = Math.max(arr[i], currenSum + arr[i]);
			//update maxSum if currenSum is greater than maxSum
			maxSum = Math.max(currenSum, maxSum);
		}
		System.out.println("Max Sum is " + maxSum);
	}
}
