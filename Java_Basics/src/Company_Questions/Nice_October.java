//100 of Employees..id,name,dept,salary...unique employees sorted as per their salary..
package Company_Questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import Emp;

public class Nice_October {

	public static void main(String args[])
	{
		List<Emp> Employee = Arrays.asList(new Emp(1,"Rohan","HR",50000.0),
											new Emp(2,"Mohit","Finance",60000.0),
											new Emp(3,"Akash","Engineering",70000.0),
											new Emp(1,"Rohan","HR",50000.0));
		
		List<Emp> Employeeosorted = Employee.stream().distinct().sorted(Comparator.comparingDouble(Emp::getSal))
									.collect(Collectors.toList());
				
		
		System.out.println("Employee in sorted and distinct ones are "+Employeeosorted);
									
		
	}
	
}


