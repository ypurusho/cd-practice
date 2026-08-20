package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbers {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		List<Integer> result = list.stream().filter(num -> num % 2 == 0).peek(System.out::println).map(num -> num * 5).collect(Collectors.toList());
		System.out.println(result);
	}
}
