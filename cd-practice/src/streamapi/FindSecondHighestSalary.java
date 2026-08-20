package streamapi;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FindSecondHighestSalary {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(1l, "Mahesh", 20000l, Date.valueOf("2020-01-09")));
		list.add(new Employee(1l, "Suresh", 80000l, Date.valueOf("2024-10-30")));
		list.add(new Employee(1l, "Subbu", 40000l, Date.valueOf("2026-07-23")));
		
		Optional<Employee> result = list.stream().sorted(new SortByHighestEmployeeSalary()).skip(1).findFirst();
		System.out.println(result.get());
	}
}
