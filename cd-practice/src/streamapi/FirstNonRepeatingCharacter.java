package streamapi;

import java.util.LinkedHashMap;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		String str = "aabc";
		Optional<Character> stream = str.chars().mapToObj(s -> (char)s)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().peek(System.out::println).filter(s->s.getValue()==1).map(s->s.getKey()).findFirst();
		System.out.println(stream.get());
		
	}
}
