package streamapi;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class FindEmployeeWithHighestSalaray {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(1l, "Mahesh", 20000l, Date.valueOf("2020-01-09")));
		list.add(new Employee(1l, "Suresh", 80000l, Date.valueOf("2024-10-30")));
		list.add(new Employee(1l, "Subbu", 40000l, Date.valueOf("2026-07-23")));
		
		//list.sort(Comparator.comparing(Employee::getSalary));
		//list.sort(new SortByHighestEmployeeSalary());
		list.sort(new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return o2.getSalary().compareTo(o1.getSalary());
			}
		});
		
		
	}
}

