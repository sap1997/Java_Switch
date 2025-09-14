package Company_Questions;
import java.util.*;
import java.util.stream.Collectors;
public class Persistent {
	public static void main(String args[])
	{
		List<Employees> emp = Arrays.asList(new Employees("Rohit",20,50000,"Pune"),
				new Employees("Rohan",25,60000,"Bangalore"),
				new Employees("Mohit",23,60000,"Kolkata"));
		
		
		List<Employees> empsorted = emp.stream().sorted(Comparator.comparingInt(Employees::getSalary).thenComparing(Employees::getAge))
									.collect(Collectors.toList());
		
		System.out.println(empsorted);
		
		
		
	}

}
