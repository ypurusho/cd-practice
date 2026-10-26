package streamapi;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupEmployeesByDepartmentWithHighestSalary {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(1l, "Mahesh", 20000l, Date.valueOf("2020-01-09"),"HR"));
		list.add(new Employee(2l, "Suresh", 80000l, Date.valueOf("2024-10-30"), "IT"));
		list.add(new Employee(3l, "Subbu", 40000l, Date.valueOf("2026-07-23"),"Sales"));
		list.add(new Employee(4l, "Yashu", 100000l, Date.valueOf("2026-07-23"),"IT"));
		list.add(new Employee(5l, "Teja", 200000l, Date.valueOf("2026-07-23"),"IT"));
		
		Map<String, List<Employee>> result = list.stream().collect(Collectors.groupingBy(Employee::getDepartment,
				Collectors.collectingAndThen(Collectors.toList(), 
						emp -> emp.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).toList())));
		result.entrySet().forEach(System.out::println);
	}
}
