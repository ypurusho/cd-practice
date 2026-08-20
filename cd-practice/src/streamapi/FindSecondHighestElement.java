package streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindSecondHighestElement {

	public static void main(String[] args) {
		List<Integer> list  = Arrays.asList(1,2,4,7,3,5);
		Optional<Integer> result = list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
		System.out.println(result);
	}
}
