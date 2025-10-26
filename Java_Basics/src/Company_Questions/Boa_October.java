package Company_Questions;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import Employe;

public class Boa_October {
	
	public static void main(String args[])
	{
		List<Employe> emp = Arrays.asList(new Employe(1,"Rohit",50000.0),
											new Employe(2,"Mohit",60000.0),
											new Employe(3,"Rohan",60000.0),
											new Employe(4,"Mukesh",70000.0),
											new Employe(5,"Akash",70000.0));
		
		
		Optional<Employe> empwithsecondHighest =emp.stream().sorted(Comparator.comparingDouble(Employe::getSal)
												  .reversed()).skip(1).findFirst();
		
		Map<Double,List<Employe>> empgroup= emp.stream().sorted(Comparator.comparingDouble(Employe::getSal)
				  .reversed()).collect(Collectors.groupingBy(Employe::getSal));
				  
				  
	
		
	
				
		if(empwithsecondHighest.isPresent())
			System.out.println("Second highest salary "+empwithsecondHighest.get());
	}

}



SELECT * FROM EMPLOYEES WHERE NAME NOT IN (SELECT NAME FROM EMPLOYEES HAVING COUNT(NAME)>1)
AND SALARY NOT IN (SELECT SALARY FROM EMPLOYEES HAVING COUNT(SALARY)>1);