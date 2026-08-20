package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Distinct {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>(Arrays.asList(new String[]{"ramesh", "suresh", "mahesh", "suresh", "mahesh"}));
		//removes duplicate elements
		names.stream().distinct().forEach(System.out::println);;
	}
}
