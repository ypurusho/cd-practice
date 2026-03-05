package collections_framework;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Stream;

public class IterationOfMap {

	public static void main(String[] args) {
		Map<String, Person> map = new HashMap<String, Person>();
		map.put("Ramesh", new Person("Ramesh", 20000));
		map.put("Mahesh", new Person("Mahesh", 40000));
		map.put("Suresh", new Person("Suresh", 80000));
		
		// entry set
		for (Map.Entry<String, Person> entry : map.entrySet()) {
			System.out.println(entry);
		}
		
		// values
		//map.values().stream().forEach(System.out::println);
		for (Person person : map.values()) {
			System.out.println(person);
		}
		
		//keyset
		//map.keySet().stream().forEach(System.out::println);
		for (String key : map.keySet()) {
			System.out.println("key : " + key + "[" + map.get(key) + "]");
		}
		
		map.forEach((String, Person) -> System.out.println(Person));
		
		
	}
}
