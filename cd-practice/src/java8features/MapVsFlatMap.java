package java8features;

import java.util.List;
import java.util.stream.Stream;

public class MapVsFlatMap {

	public static void main(String[] args) {
		List<List<String>> list = List.of(
				List.of("Ramesh", "Mahesh"),
				List.of("Suresh", "Sindu"));
		//using map
		Stream<List<String>> newList = list.stream().map(name -> name);
		newList.forEach(n-> System.out.println(n));
		//using flatmap
		Stream<String> stream = list.stream().flatMap(List::stream);
		stream.forEach(System.out::println);
		
		
		List<String> names = List.of("John", "Ram");
		//map
		List<Integer> namesLemgth = names.stream().map(name -> name.length()).toList();
		namesLemgth.forEach(System.out::println);
	}
}
