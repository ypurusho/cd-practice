package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sorted {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>(Arrays.asList(new String[]{"ramesh", "suresh", "mahesh"}));
		//sorts the items in natural order or custom if comparator
		names.stream().sorted().forEach(System.out::println);
	}
}
