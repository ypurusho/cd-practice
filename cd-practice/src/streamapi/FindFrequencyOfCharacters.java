package streamapi;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFrequencyOfCharacters {

	public static void main(String[] args) {
		String str = "Hello world";
		str.chars().filter(c -> c != ' ').mapToObj(c -> (char)c)
		.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
		.entrySet().forEach(System.out::println);
	}
}
