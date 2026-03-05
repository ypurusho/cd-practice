package collections_framework;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ObjectSorting {

	public static void main(String[] args) {
		List<Person> list = Arrays.asList(new Person("Ramesh", 20000), 
				new Person("Suresh", 70000),
				new Person("Mahesh", 30000));
		
		//Collections.sort(list);
		Collections.sort(list, new DescendingOrder());
		System.out.println(list);
	}
}

//class Person //implements Comparator<Person>
//{
//	private String name;
//	private Integer salary;
//	
//	public Person(String name, Integer salary) {
//		super();
//		this.name = name;
//		this.salary = salary;
//	}
//	
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public Integer getSalary() {
//		return salary;
//	}
//	public void setSalary(Integer salary) {
//		this.salary = salary;
//	}
//
//	@Override
//	public String toString() {
//		return "Person [name=" + name + ", salary=" + salary + "]";
//	}
//
//	public int compareTo(Person p1, Person p2) {
//		return p1.getName().compareTo(p2.getName());
//		//return Integer.compare(this.getSalary(), o1.getSalary());
//	}
//	
//}
//
//class DescendingOrder implements Comparator<Person>{
//
//	@Override
//	public int compare(Person p1, Person p2) {
//		return p1.getName().compareTo(p2.getName());
//	}
//	
//}