package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>(Arrays.asList(new String[]{"ramesh", "suresh", "mahesh"}));
		//names.stream().forEach(System.out::println);
		System.out.println("after filtering");
		
		//filters the item based on condition
		List<String> fiteredNames = names.stream().filter(name -> name.startsWith("r")).collect(Collectors.toList());
		fiteredNames.forEach(System.out::println);
		
		
	}

}
