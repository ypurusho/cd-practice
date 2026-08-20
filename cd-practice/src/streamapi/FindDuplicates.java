package streamapi;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicates {

	public static void main(String[] args) {
		List<Integer> list = List.of(1,2,4,5,9,7,8,2,1,4,3);
		List<String> str = List.of("Apple", "Banana", "Orange", "Apple", "Orange");
		Map<String, Long> result = str.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting())).
			entrySet().stream().filter(n -> n.getValue() > 1).collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue()));
		System.out.println(result);
	}
}
