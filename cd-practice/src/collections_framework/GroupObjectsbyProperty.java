package collections_framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupObjectsbyProperty {

	public static void main(String[] args) {
		List<Person> list = Arrays.asList(new Person("Ramesh", 20000), 
				new Person("Suresh", 70000),
				new Person("Mahesh", 30000));
		Map<String, List<Person>> map = new HashMap<String, List<Person>>();
		for (Person person : list) {
			map.computeIfAbsent(person.getName(), k -> new ArrayList<>()).add(person);
		}
		System.out.println(map);
	}
}
