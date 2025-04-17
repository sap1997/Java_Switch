package Basics;
import java.util.*;
import java.util.stream.Collectors;

import Basics.Employee;
public class Filter_test {
	public static void main(String args[])
	{
		List<Employee> details = new ArrayList<>();
		details.add(new Employee(1,"john",20000,25));
		details.add(new Employee(2,"rohit",30000,50));
		details.add(new Employee(3,"james",600000,55));
		details.add(new Employee(4,"aditya",600000,60));

		
		//List<Employee> result = details.stream().filter((e->e.getSalary()>50000)).collect(Collectors.toList());
		
		//List<Employee> salarysort = details.stream().sorted().collect(Collectors.toList());
		//List<Employee> salarysort =details.stream().sorted((e1,e2)->Integer.compare(e2.getSalary(),e1.getSalary())).collect(Collectors.toList());
		//List<Employee> salarysort = details.stream().sorted(Comparator.comparingInt(Employee::getSalary).reversed().t henComparing(Employee::getName)).collect(Collectors.toList());
		//System.out.println(salarysort);
		//System.out.println(result);
		
		List<Employee> findage = details.stream().filter(e->e.getAge()>50).collect(Collectors.toList());
		System.out.println(findage);
		int id = 4;
		Optional<Integer> phone = details.stream().filter(e->e.getId()==id).map(e->e.getSalary()).findFirst();
		System.out.println("Phone is "+phone.get());
		 OptionalDouble averageSalary = details.stream()
                 .mapToDouble(Employee::getSalary).average();
			System.out.println(averageSalary);
			 Double Avg = details.stream().collect(Collectors.averagingDouble(Employee::getSalary));
			 System.out.println("Average is "+Avg);
		 
		List<Integer> number = new ArrayList<>();
		number.add(1);
		number.add(2);
		number.add(3);
		
		
		
		number.add(4);
		number.add(2);
		number.add(2);
		List<Integer> square = number.stream().map(x->x*x).collect(Collectors.toList());
		System.out.println(square);
		List<Integer> dist = number.stream().distinct().collect(Collectors.toList());
		System.out.println(dist);
		int size = number.size();
        List<Integer> nonDistinctNumbers = number.stream()
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()))
                .entrySet().stream()
               // .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        
        Map<Integer, Long> nonDistinctNumbersWithCounts = number.stream()
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() > size/2) // Filter only non-distinct numbers
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(nonDistinctNumbers);
        System.out.println(nonDistinctNumbersWithCounts);
        
        
        Set<Integer> nest = new LinkedHashSet<>(number);
        System.out.println("Removed dp is "+nest);
        
        String rev = number.toString().chars().mapToObj(c->(char)c).sorted(Comparator.reverseOrder()).map(String::valueOf).collect(Collectors.joining());
        System.out.println(rev);

        boolean prime = number.stream().anyMatch(x->x%2==0);
        System.out.println(prime);
        
        Optional<Integer> min = number.stream().min(Integer::compareTo);
        System.out.println(min.get());
        
        Optional<Integer> minred = number.stream().reduce((a,b)->a<b?a:b);
      //  System.out.println(minred.geSt());
        
        
        int ar[]= {2,5,6,7,8};
        OptionalInt small = Arrays.stream(ar).min();
        System.out.println(min.get());
        int abc=123348;
        //Int smallest = Int
	}

}
  