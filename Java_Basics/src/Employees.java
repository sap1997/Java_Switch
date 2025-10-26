import java.util.*;
public class Employees {

	
	String name;
	int age;
	int salary;
	String city;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employees(String name, int age, int salary, String city) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.city = city;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String toString() {
		return "Employees [name=" + name + ", age=" + age + ", salary=" + salary + ", city=" + city + "]";
	}
	
}
