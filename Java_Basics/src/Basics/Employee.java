package Basics;
import java.io.*;
public class Employee   {
	public int id;
	public String name;
	public int salary;
	public int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", age=" + age + "]";
	}
	public Employee(String string, int i, int salary,String string2) {
		super();
		this.id = string;
		this.name = i;
		this.salary = salary;
		this.age=string2;
	}
	/* public int compareTo(Employee other) {
	        return Integer.compare(this.salary, other.salary); // Sort by salary
	    }*/

}
