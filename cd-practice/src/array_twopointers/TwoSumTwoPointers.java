package array_twopointers;

public class TwoSumTwoPointers {

	//only when array is sorted in ascending order otherwise hashmap is better 
	//o(n) and o(1) space
	public static void main(String[] args) {
		int [] arr = {2,3,4};
		int [] result = printTwoSum(arr, 6);
		System.out.println(result[0] +"," + result[1]);
	}

	private static int[] printTwoSum(int[] arr,int target) {
		int left = 0, right = arr.length-1;
		while(left<right) {
			int sum = arr[left] + arr[right];
			if(sum == target) {
				return new int [] {left, right};
			}else if(sum>target) {
				right--;
			}else {
				left++;
			}
		}
		return new int[] {-1,-1};
	}
}
