package streamapi;

import java.security.Principal;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountEmployeesByDepartment {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(1l, "Mahesh", 20000l, Date.valueOf("2020-01-09"),"HR"));
		list.add(new Employee(1l, "Suresh", 80000l, Date.valueOf("2024-10-30"), "IT"));
		list.add(new Employee(1l, "Subbu", 40000l, Date.valueOf("2026-07-23"),"Sales"));
		list.add(new Employee(1l, "Yashu", 100000l, Date.valueOf("2026-07-23"),"IT"));
		
		Map<String, Long> map = list.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		map.entrySet().forEach(System.out::println);
	}
}
