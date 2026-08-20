package arrays_practice;

public class FindMissingNumber {

	public static void main(String[] args) {
		int arr[] = {1,2,3,5};
		int range = arr[arr.length-1];
		int actualSum = 0;
		for(int value : arr) {
			actualSum+=value;
		}
		System.out.println(actualSum);
		int expectedSum = range*(range+1)/2;
		System.out.println(expectedSum);
		int result = expectedSum - actualSum;
		System.out.println(result);
	}
}
