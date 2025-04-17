package Basics;

public class Employ {

	String name;
	@Override
	public String toString() {
		return "Employ [name=" + name + ", Gender=" + Gender + ", age=" + age + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employ(String name, String gender, int age) {
		super();
		this.name = name;
		Gender = gender;
		this.age = age;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	String Gender;
	int age;
}
