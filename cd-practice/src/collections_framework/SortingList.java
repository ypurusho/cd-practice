package collections_framework;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingList {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2,1,6,3,4,7,8);
		Collections.sort(list);
		System.out.println(list);
		
	}
}
