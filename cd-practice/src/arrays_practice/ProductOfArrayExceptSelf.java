package arrays_practice;

public class ProductOfArrayExceptSelf {

	//by using prefix and suffix o(n) time but space is also o(n)
	//can also acheive this with o(1) space by excluding one array
	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		//appraochPrefixandSuffix(nums);
		//better approach
		approach2(nums);
	}

	private static void approach2(int[] nums) {
		int n = nums.length;
		int[] result = new int[n];
		//store prefix products directly in result
		result[0] = 1;
		for(int i = 1; i<n; i++) {
			result[i] = result[i-1] * nums[i-1];
			System.out.println("result : "+result[i]);
		}
		
		//multiply with suffix
		int suffix = 1;
		for(int i = n-1; i >= 0; i--) {
			System.out.println("suffix: "+suffix);
			result[i] *= suffix;
			System.out.println("result in 2nd : " + result[i]);
			suffix *= nums[i];
		}
		for(int i: result) {
			System.out.println(i);
		}
	}

	private static void appraochPrefixandSuffix(int[] nums) {
		int n = nums.length;
		int[] prefix = new int[n];
		int[] suffix = new int[n];
		int[] result = new int[n];
		prefix[0] = 1;
		//store product of left elements
		for(int i = 1; i < n; i++) {
			prefix[i] = prefix[i-1] * nums[i-1];
			//System.out.println(prefix[i]);
		}
		
		//store product of right elements
		suffix[n-1] = 1;
		for(int i = n-2; i>=0; i--) {
			suffix[i] = suffix[i+1] * nums[i+1];
			//System.out.println(suffix[i]);
		}
		// finally store the prodcut of left and right elements into result
		for(int i = 0; i < n; i++) {
			result[i] = prefix[i] * suffix[i];
		}
		
		for(int i : result) {
			System.out.println(i);
		}
	}
}
