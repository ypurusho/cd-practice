package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMap {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>(Arrays.asList(new String[]{"ramesh", "suresh", "mahesh"}));
		
		//map to transform the items
		List<String>transformedNames = names.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());
		System.out.println(transformedNames);
	}
}
