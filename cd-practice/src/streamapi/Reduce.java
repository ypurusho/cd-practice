package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Reduce {

	public static void main(String[] args) {
		List<Integer> names = new ArrayList<Integer>(Arrays.asList(new Integer[]{1,2,3,4}));
		//reduces stream into single element
		int result = names.stream().reduce(0, Integer::sum);
		System.out.println(result);
	}
}

