package ust.sonarqubetest;

public class Employee {
	private String name;
	private int age;
	private int year;
	private double salary;
	public Employee(String name, int age, int year, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.year = year;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "employee [name=" + name + ", age=" + age + ", year=" + year + ", salary=" + salary + "]";
	}
	
}
