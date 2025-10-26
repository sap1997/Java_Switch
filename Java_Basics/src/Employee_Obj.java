
public class Employee_Obj {
	
	String name;
	int id;
	int Salary;
	
	public Employee_Obj(String name, int id, int salary) {
		super();
		this.name = name;
		this.id = id;
		Salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee_Obj [name=" + name + ", id=" + id + ", Salary=" + Salary + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}
	

}
