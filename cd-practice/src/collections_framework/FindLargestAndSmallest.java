package collections_framework;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FindLargestAndSmallest {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,7,4,2,1,3,9);
		Integer max = Collections.max(list);
		Integer min = Collections.min(list);
		System.out.println("max : " + max);
		System.out.println("min : " + min);
		
		List<Person> personList = Arrays.asList(new Person("Ramesh", 20000), 
				new Person("Suresh", 70000),
				new Person("Mahesh", 30000));
		
		Person person = Collections.max(personList, Comparator.comparingInt(Person ::getSalary));
		System.out.println(person);
	}
}
