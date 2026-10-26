package array_prefixsum;

public class PivotIndex {

	public static void main(String[] args) {
		int arr[] = {1,7,3,6,5,6};
		int result = findPivotIndex(arr);
		System.out.println(result);
	}

	private static int findPivotIndex(int[] arr) {
		int totalSum = 0;
		for(int i = 0; i<arr.length; i++) {
			totalSum += arr[i];
		}
		int leftSum = 0;
		for(int j = 0; j <arr.length; j++) {
			int rightSum = totalSum - leftSum - arr[j];
			if(leftSum == rightSum)
				return arr[j];
			leftSum += arr[j];
		}
		return -1;
	}
}
