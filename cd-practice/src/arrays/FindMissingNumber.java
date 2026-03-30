package arrays;

public class FindMissingNumber {

	public static void main(String[] args) {
		int[] arr = {1,2,4,3,6,7};
		//find the highest number and treat as the range
		//calculate n(n+1)/2 and subtract the sum of all elements in the array.
		int sum = 0;
		int range = -1;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
			for(int j = 0; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					range = arr[i];
				}
			}
		}
		System.out.println("sum is : " + sum);
		System.out.println("range is : " + range);
		int result = (range * (range+1))/2;
		result = result - sum;
		System.out.println(result);
	}
}
