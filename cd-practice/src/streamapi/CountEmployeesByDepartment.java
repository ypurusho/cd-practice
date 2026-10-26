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
		
		//byte > short > int > long > float > double
		double d = 4;
		long l = 4;
		double f = 4f;
		byte b = 4;
		short s = 4;
		int in = (int) 4.0;
		System.out.println(s);
		System.out.println(b);
		System.out.println(f);
		System.out.println(l);
		System.out.println(d);
		System.out.println(in);
	}
}
