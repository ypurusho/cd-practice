package arrays;

import java.util.Arrays;
import java.util.List;

public class MoveZerosToEnd {

	public static void main(String[] args) {
		int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
		approach1(arr);
		approach2(arr);
	}

	private static void approach2(int[] arr) {
		
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
