package collections_framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFrequencyOfanElement {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2,4,6,2,8,64,2,5,6);
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		list.forEach(elem -> map.put(elem, map.getOrDefault(elem, 0) + 1));
		System.out.println(map);
		
		//using streams
		Map<Integer, Long> ma = list.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting()));
		System.out.println(ma);
	}
}
