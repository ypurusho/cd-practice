package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMissingNumberA {

	public static void main(String[] args) {
		int[] arr = {1,2,4,3,6,7};
		int sum = 0;
		int range = -1;
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
			if(arr[i] > range) {
				range = arr[i];
			}
		}
		System.out.println("range " + range);
		System.out.println("sum " + sum);
		int formula = range*(range + 1)/2;
		System.out.println("formula " + formula);
		int result  = formula - sum;
		System.out.println("result " + result);
		
		int mid = arr[(arr.length-1)/2];
		System.out.println("mid " + mid);
		if(arr[mid] == mid +1) {
			System.out.println("missing number is in right half");
		}
		if(arr[mid] > mid + 1) {
			System.out.println("missing number is in left half");
		}
	}
}
