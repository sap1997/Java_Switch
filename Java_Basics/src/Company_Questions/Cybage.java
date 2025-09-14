package Company_Questions;
import java.util.*;
import java.util.stream.Collectors;
public class Cybage {
	public static void main(String args[])
	{
		/*int[] ar = {2,3,4,5,5,4,6};
		int target = 9;
		Set<Integer> values = new HashSet<>();
		Set<Integer> result = new HashSet<>();
		Set<Integer> index = new HashSet<>();

		Map<Integer,Integer> numberswithposition =  new HashMap<>();
		for(int i =0;i<ar.length;i++)
		{
			numberswithposition.put(i, ar[i]);
		}
		for(Integer i: ar)
		{
			int remaining = target-i;
			if(values.contains(remaining))
			{
				result.add(i);
				result.add(remaining);
			}
			values.add(i);
		}
		System.out.println("Index with numbers= " +numberswithposition);
		System.out.println("Two Sum numbers" +result);
		
		for(Map.Entry<Integer,Integer> kv : numberswithposition.entrySet())
		{
			if(result.contains(kv.getValue()))
			{
				index.add(kv.getKey());
			}
		}
		
		System.out.println("Indexes are" +index);*/
		/*Find top 3 highest salaries.
		 
		Group employees by salary bracket (<50k, 50k–100k, >100k).*/
		
		List<Employee_Obj> Employees = Arrays.asList(new Employee_Obj("Anil",1,40000),
													new Employee_Obj("Sunil",2,60000),
													new Employee_Obj("Mohit",3,75000),
													new Employee_Obj("Rohan",4,40000),
													new Employee_Obj("Rohit",5,100000));
		
		
		List<Employee_Obj> TopThreeSalary = Employees.stream().sorted(Comparator
										.comparingInt(Employee_Obj::getSalary).reversed())
										.limit(3).collect(Collectors.toList());
		
		
		System.out.println("Top 3 Employees with highest salary = " +TopThreeSalary);
		
		List<Employee_Obj> sal_lessthan50k = Employees.stream().filter(Employee_Obj->Employee_Obj.getSalary()<50000).collect(Collectors.toList());
		List<Employee_Obj> sal_mid_Range = Employees.stream().filter(Employee_Obj->Employee_Obj.getSalary()>=50000 && Employee_Obj.getSalary()<100000).collect(Collectors.toList());
		List<Employee_Obj> sal_high_Range = Employees.stream().filter(Employee_Obj->Employee_Obj.getSalary()>=100000).collect(Collectors.toList());
		
		System.out.println(" <50k " +sal_lessthan50k + " 50k–100k "+sal_mid_Range+ " >100k "+sal_high_Range);

		Map<String,List<Employee_Obj>> resultaspersalary = Employees.stream().collect(Collectors.groupingBy("<50k,50k-100k"?Employees.stream().filter(Employee_Obj->Employee_Obj.getSalary()<50000).collect(Collectors.toList());
		System.out.println(resultaspersalary);
		
	}

}
