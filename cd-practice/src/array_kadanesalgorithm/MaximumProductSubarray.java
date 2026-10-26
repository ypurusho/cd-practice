package array_kadanesalgorithm;

public class MaximumProductSubarray {

	//can be solved using kadanes algorithm but need dynamic programming
	//so here we will go with prefix approach
	public static void main(String[] args) {
		int arr[] = {2,3,-2,4};
		int product = findMaximumProduct(arr);
		System.out.println(product);
	}

	private static int findMaximumProduct(int[] arr) {
		int prefix = 1;
		int suffix = 1;
		int result = Integer.MIN_VALUE;
		//calculate prefix & suffix product in single loop instead of two loops
		for(int i = 0; i<arr.length;i++) {
			//reassign prefix if number in arr is 0
			if(prefix == 0)
				prefix = 1;
			if(suffix == 0)
				suffix = 1;
			prefix *= arr[i];
			//at 0th index 2 is definitely going to multiplied by last index number
			//so in single loop we can multiply by n-i-1 which is 4-0-1 which is 3rd index so 2*4 = 8
			suffix *= arr[arr.length -i -1];
			
			result = Math.max(result, Math.max(prefix, suffix));
			
		}
		return result;
	}
}
