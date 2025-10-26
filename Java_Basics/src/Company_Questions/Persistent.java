//[1, 7, 8, 0, 2, 0, 0, 5]
package Company_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import Employ;

public class Persistent {
	
	public static void main(String args[])
	{
		int ar[] = {1,7,8,0,2,0,0,5};
		//List<Integer> result = new ArrayList<>();
		
		List<Integer >result = Arrays.stream(ar).boxed().filter(n->n!=0).collect(Collectors.toList());
		for(int i=result.size();i<ar.length;i++)
			result.add(0);
		
		
		System.out.println(result);
		
		
		
		List<Employ> employee = Arrays.asList(new Employ(101,"Amit Sharma","IT",75000.0),
											  new Employ(102,"Priya Verma","HR",65000.0),
											  new Employ(103,"Rahul Mehta","Finance",80000.0),
											  new Employ(104,"Sneha Rao","Marketing",70000.0));
		
		
		Optional<Employ> empwiththirdhighest = employee.stream().sorted(Comparator.comparingDouble(Employ::getSalary).reversed())
											.distinct().skip(2).findFirst();
		if(empwiththirdhighest.isPresent())
		System.out.println("Details of employee with third highest "+empwiththirdhighest.get());
		
		
		
	}
	
	

}
