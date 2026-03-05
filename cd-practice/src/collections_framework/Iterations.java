package collections_framework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Iterations {

	public static void main(String[] args) {
		List<Person> list = Arrays.asList(new Person("Ramesh", 20000), 
				new Person("Suresh", 70000),
				new Person("Mahesh", 30000));
		
		//for loop
		for (Person person : list) {
			System.out.println("for loop" + person);
		}
		
		//Iterator
		Iterator<Person> itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.println("iterable" + itr.next());
		}
		
		//streams
		list.stream().forEach(System.out::println);
		
		
		//iterator with map
		//map does not support iterator directly because it is not a collection instead we can iterate like below
		//we also remove entries while traversing over map
		Map<String, Person> map = new HashMap<String, Person>();
		map.put("Ramesh", new Person("Ramesh", 20000));
		map.put("Mahesh", new Person("Mahesh", 40000));
		map.put("Suresh", new Person("Suresh", 80000));
		
		Iterator<Person> it = map.values().iterator();
		
		while(it.hasNext()) {
			String name = it.next().getName();
			System.out.println("name" + name);
			if(name.equals("Suresh")) {
				System.out.println("removing " + name);
				it.remove();
			}
			else {
				System.out.println("itr : " + name);
			}
		}
		
	}
}
