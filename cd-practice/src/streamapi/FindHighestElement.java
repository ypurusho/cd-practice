package streamapi;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindHighestElement {

	public static void main(String[] args) {
		List<Integer> list = List.of(1,2,4,5,9,72);
		Optional<Integer> result = list.stream().distinct().sorted(Comparator.reverseOrder()).findFirst();
		System.out.println(result.orElseGet(()-> -1));
	}
}
