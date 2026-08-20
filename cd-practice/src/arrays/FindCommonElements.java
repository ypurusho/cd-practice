package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindCommonElements {

	public static void main(String[] args) {
		int array[] = {2,4,7,9,8};
		int arr[] = {1,4,9,8,3};
		
		Set<Integer> set = findCommonElements(array, arr);
		if(set.isEmpty()) {
			System.out.println("No common elements found");
		}else {
			System.out.println(set);
		}
	}

	private static Set<Integer> findCommonElements(int[] array, int[] arr) {
		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> common = new HashSet<Integer>();
		for(int i : array) {
			set1.add(i);
		}
		for (int integer : arr) {
			if(set1.contains(integer)) {
				common.add(integer);
			}
		}
		return common;
	}
}
