package collections_framework;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseListSorting {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("India", "America", "China", "Russia", "Dubai");
		//Collections.sort(list);
		//Collections.reverse(list);
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
	}
}
