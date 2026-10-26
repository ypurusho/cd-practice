package array_prefixsum;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4};
		System.out.println(Arrays.toString(findProductOfArray(arr)));
	}

	private static int[] findProductOfArray(int[] arr) {
		//int left = 0, right = arr.length;
		int[] result = new int[arr.length];
		result[0] = 1;
		//left arr product directly store in result
		for(int i = 1; i < arr.length; i++) {
			result[i] = arr[i-1] * result[i-1];
		}
		int suffix = 1;
		//right product array and left array
		for(int i = arr.length-1; i>=0; i--) {
			result[i] *= suffix;
			suffix *= arr[i];
		}
		return result;
	}
}
