/*ID | Name | Department | Salary
-----------------------------------
101 | Amit Sharma | IT | ₹75000.0
102 | Priya Verma | HR | ₹65000.0
103 | Rahul Mehta | Finance | ₹80000.0
104 | Sneha Rao | Marketing | ₹70000.0*/
public class Employ {
	
	int id;
	String name;
	String dept;
	Double Salary;
	public Employ(int id, String name, String dept, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		Salary = salary;
	}
	@Override
	public String toString() {
		return "Employ [id=" + id + ", name=" + name + ", dept=" + dept + ", Salary=" + Salary + "]";
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
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Double getSalary() {
		return Salary;
	}
	public void setSalary(Double salary) {
		Salary = salary;
	}
	
	

}
