package collections_framework;

import java.util.Arrays;
import java.util.List;

public class ConverArrayToList {

	public static void main(String[] args) {
		Integer [] array  = {1, 2, 3};
		List<Integer> list = Arrays.asList(array);
		System.out.println(list);
		int[] intArray = {1,2,3};
		System.out.println(Arrays.toString(intArray));
		System.out.println(Arrays.binarySearch(intArray, 5));
		
		Object[] convertedArray =  list.toArray();
		for(int i = 0; i <= convertedArray.length - 1; i++) {
			System.out.println(convertedArray[i]);
		}
		for(Object arr : convertedArray) {
			System.out.println(arr);
		}
	}
}
