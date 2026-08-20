package collections_framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CustomSorting {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(1,"Ramesh", 40000, "New York"));
		list.add(new Employee(2, "Suresh", 40000, "Banglore"));
		list.add(new Employee(3,"Rahul", 40000, "Delhi"));
		list.add(new Employee(4,"Ganesh", 40000, "Ahmedabad"));
		
		Collections.sort(list, new SalarySortIfEqualsSortByName());
		list.forEach(System.out::println);
	}
}
 class Employee {
	 private Integer id; 
	 private String name; 
	 private Integer salary; 
	 private String address;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Employee(Integer id, String name, Integer salary, String address) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address + "]";
	}
	 
 }
class SalarySortIfEqualsSortByName implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getSalary() > o2.getSalary())
			return 1;
		else if(o1.getSalary() < o2.getSalary())
			return -1;
		else if(o1.getSalary().equals(o2.getSalary())) {
			return o1.getAddress().compareTo(o2.getAddress());
		}
		return 0;
	}

}