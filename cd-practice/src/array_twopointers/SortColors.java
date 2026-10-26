package array_twopointers;

import java.util.Arrays;
import java.util.List;

public class SortColors {

	//two pointers o(n) and o(1)
	public static void main(String[] args) {
		int[] arr = {1,0,2,0,1,2};
		int[] result = sortColors(arr);
		System.out.print(Arrays.toString(result));
	}

	private static int[] sortColors(int[] arr) {
		int left = 0, mid = 0, right = arr.length - 1;
		
		while(mid<=right) {
			//case 0 swap mid with left and move forward left and mid pointers
			if(arr[mid] == 0) {
				swap(arr, mid, left);
				left++;
				mid++;
			}else if(arr[mid] == 1) {//case 1 move mid pointer forward
				mid++;
			}else {//case 2 swap mid with right move right backward
				swap(arr, mid, right);
				right--;
			}
		}
		
		return arr;
	}

	private static void swap(int[] arr, int mid, int right) {
			int temp = arr[mid];
			arr[mid] = arr[right];
			arr[right] = temp;
	}
}
