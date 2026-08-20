package streamapi;

import java.util.Comparator;
import java.util.Date;

public class Employee {

	private Long id;
	private String name;
	private Long Salary;
	private Date joiningDate;
	private String Department;
	
	public Employee(Long id, String name, Long salary, Date joiningDate, String department) {
		super();
		this.id = id;
		this.name = name;
		Salary = salary;
		this.joiningDate = joiningDate;
		Department = department;
	}
	public Employee(Long id, String name, Long salary, Date joiningDate) {
		super();
		this.id = id;
		this.name = name;
		Salary = salary;
		this.joiningDate = joiningDate;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getSalary() {
		return Salary;
	}
	public void setSalary(Long salary) {
		Salary = salary;
	}
	public Date getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", Salary=" + Salary + ", joiningDate=" + joiningDate + "]";
	}
	
	
}

class SortByHighestEmployeeSalary implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o2.getSalary().compareTo(o1.getSalary());
	}
	
}
