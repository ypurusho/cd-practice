package arrays;

import java.util.Arrays;
import java.util.List;

public class MoveZerosToEnd {

	public static void main(String[] args) {
		int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
		//approach1(arr);
		approach2(arr);
	}

	//sliding window
	private static void approach2(int[] arr) {
		int start = 0;
		for(int i = 0; i<arr.length; i++) {
			System.out.println("arr[i]" + arr[i]);
			if(arr[i] != 0) {
				System.out.println("arr[start]" + arr[start]);
				int temp = arr[start];
				System.out.println("arr[i]" + arr[i]);
				arr[start] = arr[i];	
				System.out.println("temp" + temp);
				arr[i] = temp;
				start++;
				
			}
		}
		System.out.println("sliding window");
		for(int i = 0; i < arr.length ; i++) {
			System.out.print(arr[i]);
		}
	}

	private static void approach1(int[] arr) {
		//The idea is to use a temporary array of the same size, 
		//copy all non-zero elements into it, fill the remaining positions with zeros, 
		//and then copy the temporary array back to the original array
		int n = arr.length;
		int[] result = new int[n];
		
		int count = 0;
		
		for(int i = 0; i < n; i++) {
			if(arr[i] != 0) {
				result[count] = arr[i];
				count++;
			}
		}
		for(int i = 0; i < result.length ; i++) {
			System.out.print(result[i]);
		}
	}
}
