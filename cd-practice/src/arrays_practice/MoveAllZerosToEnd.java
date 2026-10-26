package arrays_practice;

import java.sql.Date;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

import streamapi.Employee;

public class MoveAllZerosToEnd {

	public static void main(String[] args) {
		int arr[] = {1,2,0,3,0,0,6};
		moveZerosToEnd(arr);
		
		
		List<Employee> em = Arrays.asList(new Employee(1l, "Mahesh", 60000l, Date.valueOf("2020-01-09"),"HR")
				,new Employee(13l, "Mahesh", 20000l, Date.valueOf("2020-01-09"),"IT")
				,new Employee(14l, "Ganesh", 80000l, Date.valueOf("2020-01-09"),"IT")
				,new Employee(15l, "Ramesh", 40000l, Date.valueOf("2020-01-09"),"IT"));
		Map<String, List<String>> listOfEmployeesByDept = em.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, 
						Collectors.collectingAndThen(Collectors.toList(), 
								list -> list.stream().sorted((o1,o2)-> o2.getSalary().compareTo(o1.getSalary())).map(Employee::getName).collect(Collectors.toList()))));
		System.out.println(listOfEmployeesByDept);
				//Arrays.asList
				//List.of()
				//new ArrayList<>();
		//print whose names are same
		// can be done by using groupingBy and filtering whose count > 1
		List<String> lis = em.stream().collect(Collectors.groupingBy(Employee::getName, Collectors.counting())).
				entrySet().stream().filter(entry -> entry.getValue() > 1).map(en -> en.getKey()).collect(Collectors.toList());
		System.out.println(lis);
		Set<String> names = new HashSet<>();
		em.stream().filter(emp -> emp.getName().endsWith(""));;
		
		em.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		Map<String, Long>result = em.stream().collect(Collectors.groupingBy(Employee::getDepartment, 
				Collectors.summingLong(Employee::getSalary)));
		System.out.println();
		
	}

	private static void moveZerosToEnd(int[] arr) {
		int windowStart = 0;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] != 0) {
				int temp = arr[windowStart];
				arr[windowStart] = arr[i];
				arr[i] = temp;
				windowStart++;	
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		
	}
}
