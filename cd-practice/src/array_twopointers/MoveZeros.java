package array_twopointers;

import java.util.Arrays;

public class MoveZeros {

	//two pointers 0(n) and o(1)
	public static void main(String[] args) {
		int arr[] = {1,0,6,9,0,7,0,5,0};
		moveZeros(arr);
	}
	
	public static void moveZeros(int[] arr) {
		int j = 0;// to track non zero elements
		for(int i = 0; i<arr.length-1;i++) {
			System.out.println(arr[i]);
			if(arr[i]!=0) {//swap non zero element with element at index j
				System.out.println(arr[i] + " is non zero so swapping with "+ arr[j]);
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
				System.out.println(Arrays.toString(arr));
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
