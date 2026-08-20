package java8features;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class OptionalClass {

	public static void main(String[] args) {
		List<Integer> list = List.of(1,2,3);
		
		Optional<Integer> findAny = list.stream().findAny();
		System.out.println("isEmpty" + findAny.isEmpty());
		System.out.println("isPresent" + findAny.isPresent());
		System.out.println(findAny.get());
		System.out.println(findAny.orElse(1));
		System.out.println(findAny.empty());
		System.out.println(Optional.of(1));
		System.out.println(Optional.ofNullable(null));
		System.out.println(findAny.orElseGet(()-> 0));
	}
}
