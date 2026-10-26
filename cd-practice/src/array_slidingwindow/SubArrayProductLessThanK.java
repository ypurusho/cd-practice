package array_slidingwindow;

public class SubArrayProductLessThanK {

	public static void main(String[] args) {
		int arr[] = {10,5,2,6};
		int k = 1;
		int result = productLessThanK(arr, k);
		System.out.println(result);
	}

	private static int productLessThanK(int[] arr, int k) {
		int product = 1;
		int left = 0;
		int count = 0;
		if(k <= 1) return 0;
		
		for(int right = 0; right < arr.length; right++) {
			product *= arr[right];
			while(product>=k) {
				product /= arr[left];
				left++;
			}
			count += right - left +1;
		}
		return count;
	}
}
